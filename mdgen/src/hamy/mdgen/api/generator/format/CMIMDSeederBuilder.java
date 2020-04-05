package hamy.mdgen.api.generator.format;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import hamy.mdgen.api.generator.base.GeneratorInput.Read;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeeder;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.ObjectFactory;

public class CMIMDSeederBuilder {
	private static DatatypeFactory datatypeFactory;
	private static Properties qualityMethodFCMapping = new Properties();
	private static Properties qualityMethodReasonNeededMapping = new Properties();
	private static final ZoneId AEST = ZoneId.of("+10:00");
	
	static {
		try {
			datatypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException("Unable to create DatatypeFactory instance", e);
		}
		
		InputStream propStream = null;
		try {
			propStream = CMIMDSeederBuilder.class.getResourceAsStream("quality_method_mapping.properties");
			qualityMethodFCMapping.load(propStream);
		} catch (IOException e) {
			throw new RuntimeException("Unable to load Quality Method Mapping", e);
		}

		try {
			propStream = CMIMDSeederBuilder.class.getResourceAsStream("quality_method_reason_needed.properties");
			qualityMethodReasonNeededMapping.load(propStream);
		} catch (IOException e) {
			throw new RuntimeException("Unable to load Quality Method Reason Needed Mapping", e);
		}
	}
	
	public static CMIMDSeeder build(String mdp, String nem12FileName, ZonedDateTime nem12UpdateDateTime, String nmi,
			String meterSerialNumber, String nmiSuffix, String registerId, String uom, int intervalSize, LocalDate startDate, LocalDate endDate,
			List<Read> reads, double indexRead) {
		
		ObjectFactory of = new ObjectFactory();
		CMIMDSeeder imd = of.createCMIMDSeeder();
		
		imd.setDateTimeTagFormat("xsd:strict");
		imd.setBo("CM-IMD Seeder");
		imd.setServiceProviderExternalId("DEFAULTHES");
		imd.setNmi(nmi);
		
		CMIMDSeeder.PreVEE pv = new CMIMDSeeder.PreVEE();
		pv.setExternalId(null);
		pv.setImdType(of.createCMIMDSeederPreVEEImdType("D1IL"));
		
		pv.setMdp(mdp);
		pv.setDvcIdN(nmi + "_" + meterSerialNumber);
		pv.setMcIdN(nmiSuffix);
		pv.setRegisterId(registerId);
		pv.setUom(uom);
		pv.setSpi(of.createCMIMDSeederPreVEESpi(intervalSize * 60));
		pv.setStDt(of.createCMIMDSeederPreVEEStDt(datatypeFactory.newXMLGregorianCalendar(
				GregorianCalendar.from(startDate.atStartOfDay(AEST)))));
		pv.setEnDt(of.createCMIMDSeederPreVEEEnDt(datatypeFactory.newXMLGregorianCalendar(
				GregorianCalendar.from(endDate.atStartOfDay(AEST)))));

		if(nem12FileName != null) imd.setNem12FileName(nem12FileName);
		if(nem12UpdateDateTime != null) 
			pv.setNem12UpdateDateTime(of.createCMIMDSeederPreVEENem12UpdateDateTime(datatypeFactory.newXMLGregorianCalendar(
					GregorianCalendar.from(nem12UpdateDateTime.withZoneSameInstant(AEST)))));
		
		pv.setIndexRead(Double.toString(indexRead));
		
		CMIMDSeeder.PreVEE.Msrs msrs = new CMIMDSeeder.PreVEE.Msrs();
		List<CMIMDSeeder.PreVEE.Msrs.ML> mls = msrs.getML();
		int seq = 1;
		CMIMDSeeder.PreVEE.Msrs.ML ml;
		for(Read rd : reads) {
			ml = new CMIMDSeeder.PreVEE.Msrs.ML();
			ml.setS(BigDecimal.valueOf(seq));
			ml.setQ(BigDecimal.valueOf(rd.getRd()));
			ml.setFc(of.createCMIMDSeederPreVEEMsrsMLFc(qualityMethodFCMapping.getProperty(rd.getQual())));
			mls.add(ml);
			++seq;
		}
		
		pv.setMsrs(msrs);
		imd.setPreVEE(pv);
		
		return imd;
	}
	
}

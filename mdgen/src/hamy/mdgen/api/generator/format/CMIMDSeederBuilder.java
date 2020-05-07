package hamy.mdgen.api.generator.format;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
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
	private static DateTimeFormatter imd_ext_id_date_suffix_format = null;
	
	static {
		try {
			datatypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException("Unable to create DatatypeFactory instance", e);
		}
		
		InputStream propStream = null;
		try {
			propStream = CMIMDSeederBuilder.class.getClassLoader().getResourceAsStream("quality_method_mapping.properties");
			if(propStream == null)
				throw new RuntimeException("Unable to find quality method mapping properties file");
			qualityMethodFCMapping.load(propStream);
		} catch (IOException e) {
			throw new RuntimeException("Unable to load Quality Method Mapping", e);
		}

		try {
			propStream = CMIMDSeederBuilder.class.getClassLoader().getResourceAsStream("quality_method_reason_needed.properties");
			if(propStream == null)
				throw new RuntimeException("Unable to find quality method reason needed properties file");
			qualityMethodReasonNeededMapping.load(propStream);
		} catch (IOException e) {
			throw new RuntimeException("Unable to load Quality Method Reason Needed Mapping", e);
		}
		
		imd_ext_id_date_suffix_format = DateTimeFormatter.ofPattern("MMddyyyyHHmmss");
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
		String imd_ext_id = nmi + "_" + meterSerialNumber + "_" + nmiSuffix + "_" + imd_ext_id_date_suffix_format.format(ZonedDateTime.now());
		pv.setExternalId(imd_ext_id);
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
		String condFlag; 
		String reasonCode = "001";
		for(Read rd : reads) {
			ml = new CMIMDSeeder.PreVEE.Msrs.ML();
			ml.setS(BigDecimal.valueOf(seq));
			ml.setQ(BigDecimal.valueOf(rd.getRd()));
			condFlag = qualityMethodFCMapping.getProperty(rd.getQual());
			if(condFlag == null) throw new RuntimeException("Unable to map quality " + rd.getQual() + " to condition flag");
			if("Y".equalsIgnoreCase(qualityMethodReasonNeededMapping.getProperty(rd.getQual())))
					condFlag += reasonCode;
			else condFlag += "000";
			ml.setFc(of.createCMIMDSeederPreVEEMsrsMLFc(condFlag));
			mls.add(ml);
			++seq;
		}
		
		pv.setMsrs(msrs);
		imd.setPreVEE(pv);
		
		return imd;
	}
	
}

package hamy.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import hamy.mdgen.api.generator.base.GeneratorInput.Read;
import hamy.mdgen.api.generator.format.CMIMDSeederBuilder;
import hamy.mdgen.api.generator.format.CMIMDSeederJAXBContext;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeeder;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeederFault;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeederPortType;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeederService;

public class TestXAI {
	public static void main(String[] args) {
		
		List<Read> reads = new ArrayList<>();
		Read r = new Read();
		r.setQual("A");
		r.setRd(0.123);
		for(int i = 0; i < 48; ++i) reads.add(r);
		
		CMIMDSeeder imd = CMIMDSeederBuilder.build("ACTEWM", "", 
				null, "1234567890", "MTR001", "E1", "E1", "KWH", 30, 
				LocalDate.now(), LocalDate.now().plusDays(1), reads, 0.0);
		
		long t1 = System.currentTimeMillis();
		CMIMDSeederService service = new CMIMDSeederService();
		CMIMDSeederPortType port = service.getCMIMDSeederPort();
		BindingProvider bp = (BindingProvider) port;
		System.out.println("WSDL proxy: " + (System.currentTimeMillis() - t1));
		
		Map<String, Object> rc = bp.getRequestContext();
		rc.put(BindingProvider.USERNAME_PROPERTY, "hmurt");
		rc.put(BindingProvider.PASSWORD_PROPERTY, "hmurt@123");

		try {
			for(int i = 0; i < 10; ++i) {
				long t = System.currentTimeMillis();
				Holder<CMIMDSeeder> h = new Holder<CMIMDSeeder>(imd);
				Marshaller m = CMIMDSeederJAXBContext.createMarshaller();
				System.out.println("Request ...");
				m.marshal(imd, System.out);
				System.out.println("\nGenerate request: " + (System.currentTimeMillis() - t));
				port.cmIMDSeeder(h);
				CMIMDSeeder res= h.value;
				System.out.println("IMD ID: " + res.getInitialMeasurementDataId());
				System.out.println("Call service: " + (System.currentTimeMillis() - t));
			}
			
		} catch (CMIMDSeederFault e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}

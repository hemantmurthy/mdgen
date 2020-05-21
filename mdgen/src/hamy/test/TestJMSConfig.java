package hamy.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import hamy.mdgen.config.JMSDestinationsFactory;
import hamy.mdgen.config.JMSDestinationsFactory.JMSDestinations;
import hamy.mdgen.config.JMSDestinationsXML;
import hamy.mdgen.config.JMSDestinationsXML.JMSDestinationXML;
import hamy.mdgen.config.JMSDestinationsXML.JMSQueueXML;
import hamy.mdgen.config.JMSDestinationsXML.JMSQueuesXML;

public class TestJMSConfig {
	public static void main(String[] args) {
		try {
			JAXBContext c = JAXBContext.newInstance(JMSDestinationsXML.class);
			Marshaller m = c.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(createConfig(), System.out);
			
			Unmarshaller um = c.createUnmarshaller();
			JMSDestinationsXML config = (JMSDestinationsXML) um.unmarshal(new File("C:\\gitrepo\\mdgen\\mdgen\\src\\hamy\\mdgen\\config\\jms_config.xml"));
			System.out.println("\nFrom config file ...\n\n");
			m.marshal(config, System.out);
			
			JMSDestinations jds = JMSDestinationsFactory.loadConfig("jms_config.xml");
			System.out.println(jds.get("MSGASVD4").getUrl());
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	static JMSDestinationsXML createConfig() {
		JMSDestinationsXML jds = new JMSDestinationsXML();
		
		List<JMSDestinationXML> destinations = new ArrayList<JMSDestinationXML>();
		
		JMSDestinationXML jd = new JMSDestinationXML();
		jd.setName("MSGASVD5");
		jd.setUrl("jms/MyConnectionFactory");
		
		List<JMSQueueXML> ql = new ArrayList<>();
		
		JMSQueueXML q = new JMSQueueXML();
		q.setName("Queue1");
		ql.add(q);
		
		JMSQueuesXML qs = new JMSQueuesXML();
		qs.setQueues(ql);
		jd.setQueues(qs);
		
		destinations.add(jd);
		
		jds.setDestinations(destinations);
		
		return jds;
	}
	
}

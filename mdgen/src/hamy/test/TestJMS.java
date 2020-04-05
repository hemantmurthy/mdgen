package hamy.test;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TestJMS {
	public static void main(String[] a) {
		Connection connection = null;
		Session session = null;
		MessageProducer prod = null;
		
		System.out.println("Creating connection factory ...");
		ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory("tcp://msgasvd4.domain.internal:61616");
		// Enter user name and password here ...
		cf.setUserName("b2badmin"); 
		cf.setPassword("MuSupE2!zu");
		try {
			System.out.println("Creating connection...");
			connection = cf.createConnection();
			System.out.println("Creating session ...");
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			System.out.println("Creating queue and producer ...");
			prod = session.createProducer(session.createQueue("ea.nem.b2b.external.mdms.mtrd.in.21"));
			System.out.println("Sending Message ...");
			prod.send(session.createTextMessage("Hello JMS World!!!"));
			System.out.println("Message sent successfully");
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing produced ...");
			if(prod != null)
				try {
					prod.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			System.out.println("Closing session ...");
			if(session != null)
				try {
					session.close();
				} catch(JMSException e) {
					e.printStackTrace();
				}
			System.out.println("Closing connection ...");
			if(connection != null)
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
		}
		
	}

}

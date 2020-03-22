package hamy.test.servlet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.persistence.jaxb.JAXBContextProperties;

import hamy.test.model.Request;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 2225785882617569902L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			Request r = new Request();
			r.setId("1234");
			r.addProp("abc");
			r.addProp("pqr");
			
			Map<String, Object> p = new HashMap<>();
			p.put(JAXBContextProperties.MEDIA_TYPE, "application/json");
			p.put(JAXBContextProperties.JSON_INCLUDE_ROOT, false);
			
			JAXBContext jc = JAXBContext.newInstance(new Class[] {Request.class}, p);
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
			
			BufferedWriter out = new BufferedWriter(response.getWriter());
			m.marshal(r, out);
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

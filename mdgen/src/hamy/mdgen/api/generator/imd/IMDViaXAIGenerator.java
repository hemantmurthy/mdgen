package hamy.mdgen.api.generator.imd;

import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import hamy.mdgen.api.generator.format.CMIMDSeederJAXBContext;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeeder;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeederFault;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeederPortType;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeederService;
import hamy.mdgen.config.XAIDestinationsFactory;
import hamy.mdgen.config.XAIDestinationsFactory.XAIDestinations;
import hamy.mdgen.config.XAIDestinationsFactory.XAIDestinations.XAIDestination;

public class IMDViaXAIGenerator extends IMDGenerator {
	private static Logger logger = Logger.getLogger(IMDViaXAIGenerator.class);
	
	private static XAIDestinations xaiDestinations = null;
	static {
		xaiDestinations = XAIDestinationsFactory.loadConfig();
	}
	
	private Queue<Dispatcher> pool = new LinkedList<>();
	private int poolSize = 5;
	private String serverUrl;
	private String username;
	private String password;
	
	private int numFailure = 0;
	Marshaller imdMarshaller = null;
	
	public IMDViaXAIGenerator(IMDViaXAIGeneratorInput input, int poolSize) {
		super(input);
		
		if(input.getServer() == null || "".equals(input.getServer().trim()))
			throw new RuntimeException("XAI Server not specified or is blank");
		
		String name = input.getServer();
		XAIDestination server = xaiDestinations.get(name);
		if(server == null)
			throw new RuntimeException("XAI Server not recognised. Value specified is " + input.getServer().trim());

		if(server.getUrl() == null || "".equals(server.getUrl().trim())) 
			this.serverUrl = null;
		else
			this.serverUrl = server.getUrl().trim().replaceAll("/+$", "");
		
		if(input.getUsername() != null && input.getPassword() != null) {
			this.username = input.getUsername();
			this.password = input.getPassword();
		} else if(server.getUsername() != null && server.getPassword() != null) {
			this.username = server.getUsername();
			this.password = server.getPassword();
		} else
			throw new RuntimeException("Username and password are required");
		
		this.poolSize = input.getDispatcherPoolSize() == 0 ? this.poolSize : input.getDispatcherPoolSize();
		
		try {
			this.imdMarshaller = CMIMDSeederJAXBContext.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void processFile(String mdp, String targetParticipant, String targetRole, String nem12FileName,
			ZonedDateTime nem12UpdateDateTime) {
		for(int i = 0; i < poolSize; ++i)
			try {
				addDispatcherToPool(new Dispatcher(this.serverUrl, username, password));
			} catch (MalformedURLException e) {
				throw new RuntimeException("Server URL invalid. (" + this.serverUrl + ")", e);
			}
		super.processFile(mdp, targetParticipant, targetRole, nem12FileName, nem12UpdateDateTime);
	}

	@Override
	protected void dispatchIMD(CMIMDSeeder imd) {
		//if(logger.isDebugEnabled()) {
			try {
				StringWriter out = new StringWriter();
				imdMarshaller.marshal(imd, out);
				logger.info(out.toString());
				System.out.println(out.toString());
			} catch (JAXBException e) {
				logger.warn("Unable to marshal IMD into XML", e);
			}
		//}
		Dispatcher d = getDispatcherFromPool();
		d.dispatch(imd);
	}
	
	void addDispatcherToPool(Dispatcher dispatcher) {
		synchronized(pool) {
			pool.add(dispatcher);
			pool.notifyAll();
		}
	}
	
	Dispatcher getDispatcherFromPool() {
		synchronized(pool) {
			while(pool.peek() == null) {
				try {
					pool.wait();
				} catch (InterruptedException e) {}
			}
			return pool.remove();
		}
	}
	
	class Dispatcher implements Runnable {
		CMIMDSeederPortType port = null;
		Thread thread = null;
		CMIMDSeeder imd = null;
		
		Dispatcher(String serverUrl, String username, String password) throws MalformedURLException {
			CMIMDSeederService service = 
					serverUrl == null ? new CMIMDSeederService() : 
						new CMIMDSeederService(new URL(serverUrl + "/CM-IMDSeeder?WSDL"));
			CMIMDSeederPortType port = service.getCMIMDSeederPort();
			BindingProvider bp = (BindingProvider) port;
			Map<String, Object> rc = bp.getRequestContext();
			rc.put(BindingProvider.USERNAME_PROPERTY, username);
			rc.put(BindingProvider.PASSWORD_PROPERTY, password);

			this.port = port;
		}
		
		void dispatch(CMIMDSeeder imd) {
			this.imd = imd;
			thread = new Thread(this);
			thread.start();
			logger.debug("Dispatcher started");
		}
		
		@Override
		public void run() {
			logger.debug("Dispatcher running ...");
			try {
				Holder<CMIMDSeeder> h = new Holder<CMIMDSeeder>(imd);
				port.cmIMDSeeder(h);
				logger.info("IMD Created: ID: " + h.value.getInitialMeasurementDataId());
			} catch (CMIMDSeederFault e) {
				logger.warn("Fault response received. ", e);
			} finally {
				this.imd = null;
				addDispatcherToPool(this);
				logger.debug("Dispatcher completed");
			}
		}
	}
}

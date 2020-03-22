package hamy.mdgen.api.generator;

public class GeneratorRequestProcessor {
	private Generator generator;
	private int numReadsToProcess;
	private Thread thread = null;
	
	public GeneratorRequestProcessor(Generator generator) {
		this.generator = generator;
	}
	
	public void start() {
		this.thread = new Thread(new Runnable() {
			@Override
			public void run() {
			}
		});
	}
	
}

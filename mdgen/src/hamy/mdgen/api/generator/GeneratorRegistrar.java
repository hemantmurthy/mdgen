package hamy.mdgen.api.generator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratorRegistrar {
	private static Map<String, Generator> generators = new HashMap<String, Generator>();
	
	public static synchronized String add(Generator generator) {
		String id = null;
		while(true) {
			id = Long.toString(Math.round(1000000000.0 * Math.random()));
			if(!generators.containsKey(id)) {
				generators.put(id, generator);
				break;
			}
		}
		
		return id;
	}
	
	public static Generator get(String id) {
		return generators.get(id);
	}
	
	public static synchronized void remove(String id) {
		generators.remove(id);
	}
	
	public static Map<String, Generator> getAll() {
		return Collections.unmodifiableMap(generators);
	}
	
}

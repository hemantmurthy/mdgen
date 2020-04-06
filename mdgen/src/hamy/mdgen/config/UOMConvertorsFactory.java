package hamy.mdgen.config;

import java.util.HashMap;
import java.util.Map;

public class UOMConvertorsFactory {
	private static UOMConvertors defaultUomConversions = null;
	public static UOMConvertors loadConfig() {
		if(defaultUomConversions == null) {
			defaultUomConversions = new UOMConvertors();
			
			Map<String, UOMConvertors.UOMConvertor> kutou = new HashMap<>();
			UOMConvertors.UOMConvertor kutouc = new UOMConvertors.UOMConvertor(1000.0);
			kutou.put("WH", kutouc);
			kutou.put("VARH", kutouc);
			kutou.put("W", kutouc);
			kutou.put("VAR", kutouc);
			
			Map<String, UOMConvertors.UOMConvertor> utoku = new HashMap<>();
			UOMConvertors.UOMConvertor utokuc = new UOMConvertors.UOMConvertor(0.001);
			utoku.put("KWH", utokuc);
			utoku.put("KVARH", utokuc);
			utoku.put("KW", utokuc);
			utoku.put("KVAR", utokuc);
			
			defaultUomConversions.convertors.put("KWH", kutou);
			defaultUomConversions.convertors.put("KVARH", kutou);
			defaultUomConversions.convertors.put("KW", kutou);
			defaultUomConversions.convertors.put("KVAR", kutou);

			defaultUomConversions.convertors.put("WH", utoku);
			defaultUomConversions.convertors.put("VARH", utoku);
			defaultUomConversions.convertors.put("W", utoku);
			defaultUomConversions.convertors.put("VAR", utoku);
		}
		return defaultUomConversions;
	}
	
	public static class UOMConvertors {
		private Map<String, Map<String, UOMConvertor>> convertors = new HashMap<>();
		
		public UOMConvertor get(String fromUom, String toUom) {
			if(fromUom == null || toUom == null || "".equals(fromUom.trim()) || "".equals(toUom.trim()))
				return null;
			
			Map<String, UOMConvertor> cfs = convertors.get(fromUom.trim());
			if(cfs == null) return null;
			
			return cfs.get(toUom.trim());
		}

		public static class UOMConvertor {
			double factor;
			public UOMConvertor(double factor) {
				this.factor = factor;
			}
			
			public double convert(double quantity) {
				return quantity * factor;
			}
			
		}
	}
}

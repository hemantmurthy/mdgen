package hamy.mdgen.api.generator.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import hamy.mdgen.api.generator.base.GeneratorInput.Read;

public class NEM12CSVBuilder {
	private static String DELIMITER = ",";
	private static DateTimeFormatter DATETIME_12_FORMAT = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
	private static DateTimeFormatter DATE_8_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");
	private static DateTimeFormatter DATETIME_14_FORMAT = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	public static String create100Record(ZonedDateTime createDateTime, String fromParticipant, String targetParticipant) {
		StringBuilder sb = new StringBuilder()
				.append("100").append(DELIMITER)
				.append("NEM12").append(DELIMITER)
				.append(createDateTime == null ? "" : createDateTime.format(DATETIME_12_FORMAT)).append(DELIMITER)
				.append(fromParticipant).append(DELIMITER)
				.append(targetParticipant);
		
		return sb.toString();
	}
	
	public static String create200Record(String nmi, String nmiConfig, String meterSerialNumber,
			String nmiSuffix, String registerId, String dataStreamIdentifier, String uom, int intervalSize) {
		StringBuilder sb = new StringBuilder()
				.append("200").append(DELIMITER)
				.append(nmi == null ? "" : nmi).append(DELIMITER)
				.append(nmiConfig == null ? "" : nmiConfig).append(DELIMITER)
				.append(registerId == null ? "" : registerId).append(DELIMITER)
				.append(nmiSuffix == null ? "" : nmiSuffix).append(DELIMITER)
				.append(dataStreamIdentifier == null ? "" : dataStreamIdentifier).append(DELIMITER)
				.append(meterSerialNumber == null ? "" : meterSerialNumber).append(DELIMITER)
				.append(uom == null ? "" : uom).append(DELIMITER)
				.append(intervalSize).append(DELIMITER)
				//.append(NSRD)
			;
		return sb.toString();
	}
	
	public static String create300Record(LocalDate date, List<Read> reads, String qualityMethod, 
			String reasonCode, String reasonDescription, LocalDateTime updateDateTime, LocalDateTime msatsLoadDateTime) {
		StringBuilder sb = new StringBuilder()
			.append("300").append(DELIMITER)
			.append(date.format(DATE_8_FORMAT)).append(DELIMITER);
		
		for(Read r : reads) sb.append(r.getRd()).append(DELIMITER);
		
		sb
			.append(qualityMethod).append(DELIMITER)
			.append(reasonCode).append(DELIMITER)
			.append(reasonDescription).append(DELIMITER)
			.append(updateDateTime == null ? "" : updateDateTime.format(DATETIME_14_FORMAT)).append(DELIMITER)
			.append(msatsLoadDateTime == null ? "" : msatsLoadDateTime.format(DATETIME_14_FORMAT))
			;
		return sb.toString();
	}
	
	public static String create400Record(int startInterval, int endInterval, String qualityMethod, String reasonCode) {
		StringBuilder sb = new StringBuilder()
			.append("400").append(DELIMITER)
			.append(startInterval).append(DELIMITER)
			.append(endInterval).append(DELIMITER)
			.append(qualityMethod).append(DELIMITER)
			.append(reasonCode == null ? "" : reasonCode).append(DELIMITER)
			.append(DELIMITER)
			;
		return sb.toString();
	}
	
	public static String create900Record() {
		return "900";
	}
}

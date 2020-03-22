package hamy.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestTime {
	public static void main(String[] a) {
		LocalDateTime t = ZonedDateTime.parse("2020-03-19T10:15:30+10:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("t: " + t);
		System.out.println("t.format: " + t.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
	}

}

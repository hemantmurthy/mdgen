package hamy.mdgen.common.xml;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * XmlAdapter to convert XML date time to Zoned Date Time.
 * @author hmurt
 *
 */
public class ZonedDateTimeAdapter extends XmlAdapter<String, ZonedDateTime> {
    @Override
    public String marshal(ZonedDateTime dateTime) {
    	// Format and return Local Date Time with local system time zone 
        return dateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
 
    @Override
    public ZonedDateTime unmarshal(String dateTime) {
    	// Convert XML Date Time from specified zone to local time zone, and then to local date time
        return ZonedDateTime.parse(dateTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
 
}
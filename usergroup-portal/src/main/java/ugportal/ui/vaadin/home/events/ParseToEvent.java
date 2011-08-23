/**
 * ParseToEvent.java, 17.8.2011 15:12:32 
 */
package ugportal.ui.vaadin.home.events;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import ugportal.model.Event;

/**
 * @author Tomas
 */
public class ParseToEvent {

    /**
     * @param line
     * @return
     */
    public static Event getEvent(String line) {
        Event event = new Event();

        String[] data = line.split(",");
        String dateData = data[7].split("\"")[3];
        String date = dateData.split("T")[0];
        String time = dateData.split("T")[1].substring(0, 7);
        Date d = null;
        try {
            d = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss", Locale.ENGLISH).parse(date + ":" + time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        event.setAddress((data[14] + data[15] + data[16]).split(":")[1].replaceAll("\"", ""));
        // System.out.println(data[14] + data[15] + data[16]);
        event.setLabel(data[0].split(":")[1].replaceAll("\"", ""));
        event.setDate(d);
        return event;
    }
}

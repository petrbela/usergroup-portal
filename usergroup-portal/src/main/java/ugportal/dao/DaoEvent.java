/**
 * DaoEvent.java, 28.7.2011 15:54:54 
 */
package ugportal.dao;

import java.util.Date;
import java.util.List;

import ugportal.model.Event;
import ugportal.model.EventType;
import ugportal.model.User;

/**
 * @author Tomas
 */
public interface DaoEvent {
    /**
     * returns {@link Event} by it's id.
     * 
     * @param id
     *            event's id
     * @return fetched event or null.
     */
    Event getById(Long id);

    /**
     * returns collection of {@link Event} by it's datas.
     * 
     * @param eventType
     *            type of event
     * @param date
     *            date of event
     * @param autor
     *            autor of event
     * @return fetched collection of event or null.
     */

    List<Event> getByDatas(EventType eventType, Date date, User autor);

    /**
     * Saves or updates event
     * 
     * @param event
     *            event to save or update
     */
    void put(Event event);

    /**
     * Deletes event
     * 
     * @param event
     *            event to delete.
     */
    void delete(Event event);

}

/**
 * DaoEventObjectify.java, 28.7.2011 16:03:53 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ugportal.dao.DaoEvent;
import ugportal.model.Event;
import ugportal.model.EventType;
import ugportal.model.User;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Query;
import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoEventObjectify extends DAOBase implements DaoEvent {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEvent#getById(java.lang.Long)
     */
    @Override
    public Event getById(Long id) {
        return ofy().find(Event.class, id);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEvent#getByDatas(ugportal.model.EventType,
     *      java.util.Date, ugportal.model.User)
     */
    @Override
    public List<Event> getByDatas(EventType eventType, Date date, User autor) {
        Query<Event> query = ofy().query(Event.class).filter("eventype =", eventType).filter("date =", date)
                .filter("author", autor);
        return query.list();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEvent#put(ugportal.model.Event)
     */
    @Override
    public Key<Event> put(Event event) {
        return ofy().put(event);

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEvent#delete(ugportal.model.Event)
     */
    @Override
    public void delete(Event event) {
        ofy().delete(event);
    }

    /**
     * @param events
     * @return
     */
    public List<Event> getAllByKeys(List<Key<Event>> events) {
        return new ArrayList<Event>(ofy().get(events).values());
    }

    /**
     * @param events
     * @return
     */
    public List<Key<Event>> putAll(List<Event> events) {
        return new ArrayList<Key<Event>>(ofy().put(events).keySet());
    }

    /**
     * @param put
     * @return
     */
    public Event get(Key<Event> key) {
        return ofy().find(key);
    }

    public List<Event> getInterval(int from, int count) {
        List<Key<Event>> keys = ofy().query(Event.class).listKeys();
        return new ArrayList<Event>(ofy().get(keys.subList(from, from + count)).values());
    }

}

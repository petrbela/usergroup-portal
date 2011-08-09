/**
 * DaoEventTypeObjectify.java, 28.7.2011 16:04:25 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoEventType;
import ugportal.model.EventType;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoEventTypeObjectify extends DAOBase implements DaoEventType {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEventType#getById(java.lang.Long)
     */
    @Override
    public EventType getById(Long id) {
        return ofy().find(EventType.class, id);
    }

    /**
     * {@inheritDoc}
     * 
     * @return
     * 
     * @see ugportal.dao.DaoEventType#put(ugportal.model.EventType)
     */
    @Override
    public Key<EventType> put(EventType eventType) {
        return ofy().put(eventType);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEventType#delete(ugportal.model.EventType)
     */
    @Override
    public void delete(EventType eventType) {
        ofy().delete(eventType);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEventType#get(com.googlecode.objectify.Key)
     */
    @Override
    public EventType get(Key<EventType> key) {
        return ofy().find(key);
    }

}

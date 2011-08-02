/**
 * DaoEventType.java, 28.7.2011 15:55:00 
 */
package ugportal.dao;

import ugportal.model.EventType;

import com.googlecode.objectify.Key;

/**
 * Dao object for {@link EventType}
 * 
 * @author Tomas Vantuch
 */
public interface DaoEventType {
    /**
     * Returns {@link EventType} by it's key
     * 
     * @param key
     *            key of eventType
     * @return fetched eventType or null
     */
    EventType get(Key<EventType> key);

    /**
     * Returns {@link EventType} by it's id.
     * 
     * @param id
     *            eventype's id
     * @return fetched eventtype or null.
     */
    EventType getById(Long id);

    /**
     * Saves or update {@link EventType}
     * 
     * @param eventType
     *            eventType to save or update.
     */
    Key<EventType> put(EventType eventType);

    /**
     * Deletes {@link EventType}
     * 
     * @param eventType
     *            eventType to delete.
     */
    void delete(EventType eventType);
}

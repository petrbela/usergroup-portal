/**
 * DaoEventType.java, 28.7.2011 15:55:00 
 */
package ugportal.dao;

import ugportal.model.EventType;

/**
 * Dao object for {@link EventType}
 * 
 * @author Tomas Vantuch
 */
public interface DaoEventType {

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
    void put(EventType eventType);

    /**
     * Deletes {@link EventType}
     * 
     * @param eventType
     *            eventType to delete.
     */
    void delete(EventType eventType);
}

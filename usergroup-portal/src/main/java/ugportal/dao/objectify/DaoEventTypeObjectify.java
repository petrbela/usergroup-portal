/**
 * DaoEventTypeObjectify.java, 28.7.2011 16:04:25 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoEventType;
import ugportal.model.EventType;

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
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEventType#put(ugportal.model.EventType)
     */
    @Override
    public void put(EventType eventType) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEventType#delete(ugportal.model.EventType)
     */
    @Override
    public void delete(EventType eventType) {
        // TODO Auto-generated method stub

    }

}

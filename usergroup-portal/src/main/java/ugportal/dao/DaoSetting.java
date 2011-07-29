/**
 * DaoSetting.java, 28.7.2011 15:55:27 
 */
package ugportal.dao;

import ugportal.model.Invitation;
import ugportal.model.Setting;

/**
 * Dao object for {@link Setting}
 * 
 * @author Tomas Vantuch
 */
public interface DaoSetting {
    /**
     * Returns {@link Setting}.
     * 
     * @return fetched {@link Setting} or null.
     */
    Invitation get();

    /**
     * Saves or updates {@link Setting}
     * 
     * @param Setting
     *            {@link Setting} to save or update
     */
    void put(Setting setting);

    /**
     * Deletes {@link Setting}
     * 
     * @param Setting
     *            {@link Setting} to delete
     */
    void delete(Setting setting);

}

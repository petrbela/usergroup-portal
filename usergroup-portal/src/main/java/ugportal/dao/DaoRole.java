/**
 * DaoRole.java, 28.7.2011 15:55:21 
 */
package ugportal.dao;

import ugportal.model.Role;

/**
 * Dao object for {@link Role}
 * 
 * @author Tomas Vantuch
 */
public interface DaoRole {
    /**
     * Returns {@link Role} by it's id.
     * 
     * @param id
     *            id of Role
     * 
     * @return fetched Role or null.
     */
    Role getById(Long id);

    /**
     * Returns {@link Role} by it's label.
     * 
     * @param label
     *            label of Role
     * 
     */
    Role getByLabel(String label);

    /**
     * Saves or updates {@link Role}
     * 
     * @param Role
     *            Role to save or update
     */
    void put(Role role);

    /**
     * Deletes {@link Role}
     * 
     * @param Role
     *            Role to delete
     */
    void delete(Role role);
}

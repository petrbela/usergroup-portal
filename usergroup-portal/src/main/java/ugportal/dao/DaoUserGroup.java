/**
 * DaoUserGroup.java, 11.7.2011 12:54:39 
 */
package ugportal.dao;

import ugportal.model.UserGroup;

/**
 * DAO object for {@link UserGroup}.
 * 
 * @author Ondrej Kvasnovsky
 */
public interface DaoUserGroup {

    /**
     * Returns {@link UserGroup} by it's ID.
     * 
     * @param id
     *            user group id
     * @return fetched user group, or null
     */
    public abstract UserGroup get(final String id);
}

/**
 * DaoUserGroup.java, 11.7.2011 12:54:39 
 */
package ugportal.dao;

import java.util.List;

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
     * @return fetched user group; or null
     */
    UserGroup get(final Long id);

    /**
     * @param userGroup
     *            user group
     */
    void put(UserGroup userGroup);

    /**
     * @return list of all user groups
     */

    List<UserGroup> list();

}

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
<<<<<<< HEAD
    public abstract UserGroup get(final String id);

    /**
     * @param userGroup
     */
    public void persist(UserGroup userGroup);
=======
    List<UserGroup> list();
>>>>>>> origin/master
}

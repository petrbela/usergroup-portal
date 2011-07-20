/**
 * DaoUserGroupObjectify.java, 11.7.2011 13:00:16 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoUserGroup;
import ugportal.model.UserGroup;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

/**
 * {@link DaoUserGroupObjectify} implements access to the database via Objectify
 * framework.
 * 
 * @author Tomas Vantuch, Ondrej Kvasnovsky
 */
public class DaoUserGroupObjectify implements DaoUserGroup {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUserGroup#get(java.lang.String)
     */
    @Override
    public UserGroup getById(String id) {
        Objectify ofy = ObjectifyService.begin();
        UserGroup userGroup = (UserGroup) ofy.query(UserGroup.class).filter("id", id);
        return userGroup;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUserGroup#getByName(java.lang.String)
     */
    @Override
    public UserGroup getByName(String name) {
        Objectify ofy = ObjectifyService.begin();
        UserGroup userGroup = (UserGroup) ofy.query(UserGroup.class).filter("name", name);
        return userGroup;
    }

}

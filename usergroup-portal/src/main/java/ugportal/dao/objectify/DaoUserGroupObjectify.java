/**
 * DaoUserGroupObjectify.java, 11.7.2011 13:00:16 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoUserGroup;
import ugportal.model.UserGroup;

<<<<<<< HEAD
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
=======
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;
>>>>>>> origin/master

/**
 * {@link DaoUserGroupObjectify} implements access to the database via Objectify framework.
 * 
 * @author Tomas Vantuch, Ondrej Kvasnovsky
 */
public class DaoUserGroupObjectify extends DAOBase implements DaoUserGroup {

    static {
	ObjectifyService.register(UserGroup.class);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUserGroup#get(java.lang.String)
     */
    @Override
<<<<<<< HEAD
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
=======
    public UserGroup get(final String id) {
	return ofy().get(UserGroup.class, id);
>>>>>>> origin/master
    }

}

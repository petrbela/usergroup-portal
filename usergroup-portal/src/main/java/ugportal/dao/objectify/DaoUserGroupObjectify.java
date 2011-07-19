/**
 * DaoUserGroupObjectify.java, 11.7.2011 13:00:16 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoUserGroup;
import ugportal.model.UserGroup;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;

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
    public UserGroup get(final String id) {
	return ofy().get(UserGroup.class, id);
    }

}

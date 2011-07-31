/**
 * DaoUserGroupObjectify.java, 11.7.2011 13:00:16 
 */
package ugportal.dao.objectify;

import java.util.List;

import ugportal.dao.DaoUserGroup;
import ugportal.model.UserGroup;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Query;
import com.googlecode.objectify.util.DAOBase;

/**
 * {@link DaoUserGroupObjectify} implements access to the database via Objectify
 * framework.
 * 
 * @author Tomas Vantuch, Ondrej Kvasnovsky
 */
public class DaoUserGroupObjectify extends DAOBase implements DaoUserGroup {

    public UserGroup getById(Long id) {
        return (UserGroup) ofy().find(UserGroup.class, id);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUserGroup#get(java.lang.String)
     */
    public UserGroup get() {
        Query<UserGroup> q = ofy().query(UserGroup.class);
        return q.get();
    }

    @Override
    public Key<UserGroup> put(final UserGroup userGroup) {
        return ofy().put(userGroup);
    }

    @Override
    public List<UserGroup> list() {
        return ofy().query(UserGroup.class).list();
    }
}

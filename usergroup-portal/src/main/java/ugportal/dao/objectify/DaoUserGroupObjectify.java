/**
 * DaoUserGroupObjectify.java, 11.7.2011 13:00:16 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoUserGroup;
import ugportal.model.UserGroup;

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
    public UserGroup get(String id) {
        return null;
    }

}

/**
 * DaoFactoryObjectify.java, 11.7.2011 13:03:44 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoFactory;
import ugportal.dao.DaoUser;
import ugportal.dao.DaoUserGroup;
import ugportal.model.Role;

import com.googlecode.objectify.ObjectifyService;

/**
 * DAO factory to access Objectify DAO objects.
 * 
 * @author Ondrej Kvasnovsky
 */
public class DaoFactoryObjectify extends DaoFactory {

    static {
        ObjectifyService.register(Role.class);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoUserGroup()
     */
    @Override
    public DaoUserGroup getDaoUserGroup() {
        return new DaoUserGroupObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoUser()
     */
    @Override
    public DaoUser getDaoUser() {

        return new DaoUserObjectify();
    }

}

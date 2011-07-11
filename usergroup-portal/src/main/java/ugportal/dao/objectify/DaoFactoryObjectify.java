/**
 * DaoFactoryObjectify.java, 11.7.2011 13:03:44 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoFactory;
import ugportal.dao.DaoUserGroup;

/**
 * DAO factory to access Objectify DAO objects.
 * 
 * @author Ondrej Kvasnovsky
 */
public class DaoFactoryObjectify extends DaoFactory {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoUserGroup()
     */
    @Override
    public DaoUserGroup getDaoUserGroup() {
        return new DaoUserGroupObjectify();
    }

}

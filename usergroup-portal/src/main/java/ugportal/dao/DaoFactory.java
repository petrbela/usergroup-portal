/**
 * DaoFactory.java, 11.7.2011 12:47:10 
 */
package ugportal.dao;

import ugportal.dao.objectify.DaoFactoryObjectify;

/**
 * {@link DaoFactory} provides access to a database. It should instantiated in a
 * session/application class.
 * 
 * @author Ondrej Kvasnovsky
 */
public abstract class DaoFactory {

    /**
     * Returns instance of DAO factory.
     * 
     * @return instance of DAO factory
     */
    public static DaoFactory getInstance() {
        return new DaoFactoryObjectify();
    }

    /**
     * Returns DAO for UserGroup objects.
     * 
     * @return UserGroup DAO
     */
    public abstract DaoUserGroup getDaoUserGroup();
}

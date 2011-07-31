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

    private static DaoFactory daoFactory;

    /**
     * Returns instance of DAO factory.
     * 
     * @return instance of DAO factory
     */
    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactoryObjectify();
        }
        return daoFactory;
    }

    /**
     * Returns DAO for UserGroup objects.
     * 
     * @return UserGroup DAO
     */
    public abstract DaoUserGroup getDaoUserGroup();

    public abstract DaoUser getDaoUser();

    public abstract DaoBlog getDaoBlog();

    public abstract DaoBlogPost getDaoBlogPost();

    public abstract DaoEvent getDaoEvent();

    public abstract DaoEventType getDaoEventType();

    public abstract DaoInvitation getDaoInvitation();

    public abstract DaoInvitationState getDaoInvitationState();

    public abstract DaoRank getDaoRank();

    public abstract DaoRole getDaoRole();

    public abstract DaoSetting getDaoSetting();

    public abstract DaoSourceMaterial getDaoSourceMaterial();

    public abstract DaoTweet getDaoTweet();

}

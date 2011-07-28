/**
 * DaoFactoryObjectify.java, 11.7.2011 13:03:44 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoBlog;
import ugportal.dao.DaoBlogPost;
import ugportal.dao.DaoEvent;
import ugportal.dao.DaoEventType;
import ugportal.dao.DaoFactory;
import ugportal.dao.DaoInvitation;
import ugportal.dao.DaoInvitationState;
import ugportal.dao.DaoRank;
import ugportal.dao.DaoRole;
import ugportal.dao.DaoSetting;
import ugportal.dao.DaoSourceMaterial;
import ugportal.dao.DaoTweet;
import ugportal.dao.DaoUser;
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

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoUser()
     */
    @Override
    public DaoUser getDaoUser() {

        return new DaoUserObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoBlog()
     */
    @Override
    public DaoBlog getDaoBlog() {
        return new DaoBlogObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoBlogPost()
     */
    @Override
    public DaoBlogPost getDaoBlogPost() {
        return new DaoBlogPostObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoEvent()
     */
    @Override
    public DaoEvent getDaoEvent() {
        return new DaoEventObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoEventType()
     */
    @Override
    public DaoEventType getDaoEventType() {
        return new DaoEventTypeObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getInvitation()
     */
    @Override
    public DaoInvitation getInvitation() {
        return new DaoInvitationObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoInvitationState()
     */
    @Override
    public DaoInvitationState getDaoInvitationState() {
        return new DaoInvitationStateObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoRank()
     */
    @Override
    public DaoRank getDaoRank() {
        return new DaoRankObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoRole()
     */
    @Override
    public DaoRole getDaoRole() {
        return new DaoRoleObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoSetting()
     */
    @Override
    public DaoSetting getDaoSetting() {
        return new DaoSettingObjectify();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoSourceMaterial()
     */
    @Override
    public DaoSourceMaterial getDaoSourceMaterial() {
        return new DaoSourceMaterialObjecitfy();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoFactory#getDaoTweet()
     */
    @Override
    public DaoTweet getDaoTweet() {
        return new DaoTweetObjectify();
    }

}

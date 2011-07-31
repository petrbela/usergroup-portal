/**
 * DaoInvitationObjectify.java, 28.7.2011 16:04:57 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.List;

import ugportal.dao.DaoInvitation;
import ugportal.model.Invitation;
import ugportal.model.User;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoInvitationObjectify extends DAOBase implements DaoInvitation {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitation#getById(java.lang.Long)
     */
    @Override
    public Invitation getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitation#getByInvitatedUser(ugportal.model.User)
     */
    @Override
    public Invitation getByInvitatedUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitation#getByRegisteredUser(ugportal.model.User)
     */
    @Override
    public List<Invitation> getByRegisteredUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitation#put(ugportal.model.Invitation)
     */
    @Override
    public Key<Invitation> put(Invitation invitation) {
        return ofy().put(invitation);

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitation#delete(ugportal.model.Invitation)
     */
    @Override
    public void delete(Invitation invitation) {
        // TODO Auto-generated method stub

    }

    /**
     * @param invitations
     * @return
     */
    public List<Key<Invitation>> putAll(List<Invitation> invitations) {
        return new ArrayList<Key<Invitation>>(ofy().put(invitations).keySet());
    }

    /**
     * @param invitations
     * @return
     */
    public List<Invitation> getAllByKeys(List<Key<Invitation>> invitations) {
        return new ArrayList<Invitation>(ofy().get(invitations).values());
    }

}

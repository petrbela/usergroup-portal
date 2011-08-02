/**
 * DaoInvitationStateObjectify.java, 28.7.2011 16:05:25 
 */
package ugportal.dao.objectify;

import java.util.List;

import ugportal.dao.DaoInvitationState;
import ugportal.model.InvitationState;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas Vantuch
 */
public class DaoInvitationStateObjectify extends DAOBase implements DaoInvitationState {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#getById(java.lang.Long)
     */
    @Override
    public InvitationState getById(Long id) {
        return ofy().get(InvitationState.class, id);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#getByLabel(java.lang.String)
     */
    @Override
    public List<InvitationState> getByLabel(String label) {
        return ofy().query(InvitationState.class).filter("label =", label).list();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#put(ugportal.model.InvitationState)
     */
    @Override
    public Key<InvitationState> put(InvitationState invitationState) {
        return ofy().put(invitationState);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#delete(ugportal.model.InvitationState)
     */
    @Override
    public void delete(InvitationState invitationState) {
        ofy().delete(invitationState);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#get(com.googlecode.objectify.Key)
     */
    @Override
    public InvitationState get(Key<InvitationState> key) {
        return ofy().get(key);
    }
}

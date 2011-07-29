/**
 * DaoInvitationStateObjectify.java, 28.7.2011 16:05:25 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoInvitationState;
import ugportal.model.InvitationState;

import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoInvitationStateObjectify extends DAOBase implements DaoInvitationState {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#getById(java.lang.Long)
     */
    @Override
    public InvitationState getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#getByLabel(java.lang.String)
     */
    @Override
    public InvitationState getByLabel(String label) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#put(ugportal.model.InvitationState)
     */
    @Override
    public void put(InvitationState invitationState) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoInvitationState#delete(ugportal.model.InvitationState)
     */
    @Override
    public void delete(InvitationState invitationState) {
        // TODO Auto-generated method stub

    }

}

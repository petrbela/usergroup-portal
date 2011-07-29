/**
 * DaoInvitationState.java, 28.7.2011 15:55:11 
 */
package ugportal.dao;

import ugportal.model.InvitationState;

/**
 * Dao object for {@link InvitationState}
 * 
 * @author Tomas Vantuch
 */
public interface DaoInvitationState {

    /**
     * Returns {@link InvitationState} by it's id.
     * 
     * @param id
     *            id of invitationState
     * 
     * @return fetched invitationState or null.
     */
    InvitationState getById(Long id);

    /**
     * Returns {@link InvitationState} by it's label.
     * 
     * @param label
     *            label of invitationState
     * 
     * @return fetched invitationState or null.
     */
    InvitationState getByLabel(String label);

    /**
     * Saves or updates {@link InvitationState}
     * 
     * @param invitationState
     *            invitationState to save or update
     */
    void put(InvitationState invitationState);

    /**
     * Deletes {@link InvitationState}
     * 
     * @param invitationState
     *            invitationState to delete
     */
    void delete(InvitationState invitationState);

}

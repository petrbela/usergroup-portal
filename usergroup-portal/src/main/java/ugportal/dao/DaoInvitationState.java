/**
 * DaoInvitationState.java, 28.7.2011 15:55:11 
 */
package ugportal.dao;

import java.util.List;

import ugportal.model.InvitationState;

import com.googlecode.objectify.Key;

/**
 * Dao object for {@link InvitationState}
 * 
 * @author Tomas Vantuch
 */
public interface DaoInvitationState {
    /**
     * Returns {@link InvitationState} by it's key
     * 
     * @param key
     *            key of invitationState
     * @return fetched invitationState or null
     */

    InvitationState get(Key<InvitationState> key);

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
    List<InvitationState> getByLabel(String label);

    /**
     * Saves or updates {@link InvitationState}
     * 
     * @param invitationState
     *            invitationState to save or update
     * @return
     */
    Key<InvitationState> put(InvitationState invitationState);

    /**
     * Deletes {@link InvitationState}
     * 
     * @param invitationState
     *            invitationState to delete
     */
    void delete(InvitationState invitationState);

}

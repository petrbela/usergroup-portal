/**
 * DaoInvitation.java, 28.7.2011 15:55:05 
 */
package ugportal.dao;

import java.util.List;

import ugportal.model.Invitation;
import ugportal.model.User;

/**
 * @author Tomas
 */
public interface DaoInvitation {
    /**
     * Returns {@link Invitation} by it's id.
     * 
     * @param id
     *            invitations id
     * @return fetched invitaiton or null.
     */
    Invitation getById(Long id);

    /**
     * Returns {@link Invitation} by invitated user
     * 
     * @param user
     *            invited user by this invitation
     * @return invitation or null
     */
    Invitation getByInvitatedUser(User user);

    /**
     * Returns collection of {@link Invitation} by registered user
     * 
     * @param user
     *            user, that sends invitations
     * @return collection of invitations or null
     */
    List<Invitation> getByRegisteredUser(User user);

    /**
     * Saves or updates {@link Invitation}
     * 
     * @param invitation
     *            {@link Invitation} to save or update
     */
    void put(Invitation invitation);

    /**
     * Deletes {@link Invitation}
     * 
     * @param invitation
     *            {@link Invitation} to delete
     */
    void delete(Invitation invitation);

}

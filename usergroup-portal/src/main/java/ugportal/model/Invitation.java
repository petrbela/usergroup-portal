/**
 * Invitation.java, Jun 26, 2011 12:09:46 PM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * {@link Invitation} represents an invitation for user registration.
 * 
 * @author Ondrej Kvasnovsky
 */
public class Invitation implements Serializable {
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -8073250804442335691L;
    /**
     * invitation id
     */
    @Id
    private String id;
    /**
     * user who send the invitation
     */
    private User invitedByUser;
    /**
     * registered user
     */
    private User registeredUser;

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Returns the invitedByUser.
     * 
     * @return the invitedByUser
     */
    public User getInvitedByUser() {
        return this.invitedByUser;
    }

    /**
     * Returns the registeredUser.
     * 
     * @return the registeredUser
     */
    public User getRegisteredUser() {
        return this.registeredUser;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the invitedByUser.
     * 
     * @param invitedByUser
     *            the invitedByUser to set
     */
    public void setInvitedByUser(User invitedByUser) {
        this.invitedByUser = invitedByUser;
    }

    /**
     * Sets the registeredUser.
     * 
     * @param registeredUser
     *            the registeredUser to set
     */
    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

}

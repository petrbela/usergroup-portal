/**
 * Invitation.java, Jun 26, 2011 12:09:46 PM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import ugportal.dao.DaoFactory;
import ugportal.dao.objectify.DaoUserObjectify;

import com.googlecode.objectify.Key;

/**
 * {@link Invitation} represents an invitation for user registration.
 * 
 * @author Ondrej Kvasnovsky
 */
public class Invitation implements Serializable {

    private final DaoUserObjectify daoUserObjectify = (DaoUserObjectify) DaoFactory.getInstance().getDaoUser();
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -8073250804442335691L;
    /**
     * invitation id
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * user who send the invitation
     */
    private Key<User> invitedByUser;
    /**
     * registered user
     */
    private Key<User> registeredUser;

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Returns the invitedByUser.
     * 
     * @return the invitedByUser
     */
    public User getInvitedByUser() {
        return this.daoUserObjectify.get(this.invitedByUser);
    }

    /**
     * Returns the registeredUser.
     * 
     * @return the registeredUser
     */
    public User getRegisteredUser() {
        return this.daoUserObjectify.get(this.registeredUser);
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets the invitedByUser.
     * 
     * @param invitedByUser
     *            the invitedByUser to set
     */
    public void setInvitedByUser(User invitedByUser) {
        this.invitedByUser = this.daoUserObjectify.put(invitedByUser);
    }

    /**
     * Sets the registeredUser.
     * 
     * @param registeredUser
     *            the registeredUser to set
     */
    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = this.daoUserObjectify.put(registeredUser);
    }

}

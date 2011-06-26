/**
 * User.java, Jun 26, 2011 11:38:22 AM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.Id;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Email;

/**
 * {@link User} represents a specific user and member of the user group. It is
 * represented by set of fields like name, email...
 * 
 * @author Ondrej Kvasnovsky
 */
public class User implements Serializable {
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = 1986237427727385566L;
    /**
     * email
     */
    private Email email;

    /**
     * first name
     */
    private String firstname;

    /**
     * user id
     */
    @Id
    private String id;

    /**
     * password
     */
    private String password;

    /**
     * photo
     */
    private Blob photo;

    /**
     * rank
     */
    private Rank rank;

    /**
     * role
     */
    private Role role;

    /**
     * surname
     */
    private String surname;

    /**
     * visible name
     */
    private String visibleName;

    /**
     * Creates new instance.
     */
    public User() {
        super();
    }

    /**
     * Returns the email.
     * 
     * @return the email
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Returns the firstname.
     * 
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns the photo.
     * 
     * @return the photo
     */
    public Blob getPhoto() {
        return photo;
    }

    /**
     * Returns the rank.
     * 
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Returns the role.
     * 
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * Returns the surname.
     * 
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Returns the visibleName.
     * 
     * @return the visibleName
     */
    public String getVisibleName() {
        return visibleName;
    }

    /**
     * Sets the email.
     * 
     * @param email
     *            the email to set
     */
    public void setEmail(Email email) {
        this.email = email;
    }

    /**
     * Sets the firstname.
     * 
     * @param firstname
     *            the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
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
     * Sets the password.
     * 
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the photo.
     * 
     * @param photo
     *            the photo to set
     */
    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    /**
     * Sets the rank.
     * 
     * @param rank
     *            the rank to set
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /**
     * Sets the role.
     * 
     * @param role
     *            the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Sets the surname.
     * 
     * @param surname
     *            the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Sets the visibleName.
     * 
     * @param visibleName
     *            the visibleName to set
     */
    public void setVisibleName(String visibleName) {
        this.visibleName = visibleName;
    }

}

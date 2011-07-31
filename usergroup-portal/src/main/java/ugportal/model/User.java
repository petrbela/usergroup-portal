/**
 * User.java, Jun 26, 2011 11:38:22 AM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import ugportal.dao.DaoFactory;
import ugportal.dao.objectify.DaoRankObjectify;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Email;
import com.googlecode.objectify.Key;

/**
 * {@link User} represents a specific user and member of the user group. It is
 * represented by set of fields like name, email...
 * 
 * @author Ondrej Kvasnovsky
 */
public class User implements Serializable {

    private final DaoRankObjectify daoRankObjectify = (DaoRankObjectify) DaoFactory.getInstance().getDaoRank();
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
    @GeneratedValue
    private Long id;

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
    private Key<Rank> rank;

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
     * Returns the email.
     * 
     * @return the email
     */
    public Email getEmail() {
        return this.email;
    }

    /**
     * Returns the firstname.
     * 
     * @return the firstname
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Returns the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Returns the photo.
     * 
     * @return the photo
     */
    public Blob getPhoto() {
        return this.photo;
    }

    /**
     * Returns the rank.
     * 
     * @return the rank
     */
    public Rank getRank() {
        return this.daoRankObjectify.get(this.rank);
    }

    /**
     * Returns the role.
     * 
     * @return the role
     */
    public Role getRole() {
        return this.role;
    }

    /**
     * Returns the surname.
     * 
     * @return the surname
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Returns the visibleName.
     * 
     * @return the visibleName
     */
    public String getVisibleName() {
        return this.visibleName;
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
    public void setId(Long id) {
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
        this.rank = this.daoRankObjectify.put(rank);
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

/**
 * Blog.java, 27.7.2011 20:56:13 
 */
package ugportal.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Email;

/**
 * {@link Blog} represents the blog of user group.
 * 
 * @author Ondrej Kvasnovsky
 */
public class Blog {
    /**
     * blog ID (something like database ID)
     */
    private String blogId;
    /**
     * email - most probably used as login
     */
    private Email email;
    /**
     * ID of this entity
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * password to access the account
     */
    private String password;

    /**
     * Returns the blogId.
     * 
     * @return the blogId
     */
    public String getBlogId() {
        return this.blogId;
    }

    /**
     * Returns the email.
     * 
     * @return the email
     */
    public Email getEmail() {
        return this.email;
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
     * Sets the blogId.
     * 
     * @param blogId
     *            the blogId to set
     */
    public void setBlogId(String blogId) {
        this.blogId = blogId;
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

}

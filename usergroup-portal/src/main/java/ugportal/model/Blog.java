/**
 * Blog.java, 27.7.2011 20:56:13 
 */
package ugportal.model;

/**
 * {@link Blog} represents the blog of user group.
 * 
 * @author Ondrej Kvasnovsky
 */
public class Blog {
    private Long id;
    private String blogId;
    private String email;
    private String password;

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return id;
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
     * Returns the blogId.
     * 
     * @return the blogId
     */
    public String getBlogId() {
        return blogId;
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
     * Returns the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * Sets the password.
     * 
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}

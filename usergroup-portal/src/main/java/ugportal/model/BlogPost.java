package ugportal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import ugportal.dao.DaoFactory;
import ugportal.dao.objectify.DaoUserObjectify;

import com.google.appengine.api.datastore.Link;

/**
 * {@link BlogPost} to represents a blog added by user to portal.
 * 
 * 
 * @author Tomas Vantuch
 */
public class BlogPost implements Serializable {

    private final DaoUserObjectify daoUserObjectify = (DaoUserObjectify) DaoFactory.getInstance().getDaoUser();

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7813474677908976294L;
    /**
     * id of the BlogPost
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * date of creating the BlogPost
     */
    private Date dateTime;
    /**
     * title of the blogPost
     */
    private String title;
    /**
     * description of the BlogPost
     */
    private String description;
    /**
     * link of the BlogPost
     */
    private Link link;

    private String author;

    private Link authorLink;

    /**
     * Returns the authorLink.
     * 
     * @return the authorLink
     */
    public Link getAuthorLink() {
        return authorLink;
    }

    /**
     * Sets the authorLink.
     * 
     * @param authorLink
     *            the authorLink to set
     */
    public void setAuthorLink(Link authorLink) {
        this.authorLink = authorLink;
    }

    /**
     * Returns the author.
     * 
     * @return the author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Sets the author.
     * 
     * @param author
     *            the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Returns the id
     * 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id
     * 
     * @param id
     *            the id of blogpost
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the dateTime
     * 
     * @return the dateTime
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * Sets the dateTime
     * 
     * @param dateTime
     *            to set the datetime of blogpost
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Returns the title
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title
     * 
     * @param title
     *            to set the title of blogpost
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the description
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description
     * 
     * @param description
     *            to set the description of blogPost
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the link
     * 
     * @return the link
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets the link
     * 
     * @param link
     *            to set the link of blogpost
     */
    public void setLink(Link link) {
        this.link = link;
    }

}

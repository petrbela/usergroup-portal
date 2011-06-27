package ugportal.model;

import java.io.Serializable;
import java.util.Date;

import com.google.appengine.api.datastore.Link;

/**
 * {@link BlogPost} to represents a blog added by user to portal.
 * 
 * 
 * @author Tomas Vantuch
 */
public class BlogPost implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7813474677908976294L;
    /**
     * id of the BlogPost
     */
    private String id;
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

    /**
     * Returns the id
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id
     * 
     * @param id
     *            the id of blogpost
     */
    public void setId(String id) {
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

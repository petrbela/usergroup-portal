package ugportal.model;

import java.io.Serializable;
import java.util.Date;

import com.google.appengine.api.datastore.Link;

/**
 * {@link Tweet} to represents a tweet added by user to portal.
 * 
 * @author Tomas
 */
public class Tweet implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 8832221858812220881L;
    /**
     * id of the tweet
     */
    private Long id;
    /**
     * date of creating the tweet
     */
    private Date dateTime;
    /**
     * title of the tweet
     */
    private String title;
    /**
     * description of the tweet
     */
    private String description;
    /**
     * link of the tweet
     */
    private Link link;

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
     *            the id of the tweet
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
     *            to set the datetime of the tweet
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
     *            to set the title the tweet
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
     *            to set the description of the tweet
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
     *            to set the link of the tweet
     */
    public void setLink(Link link) {
        this.link = link;
    }

}

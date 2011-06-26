/**
 * Event.java, Jun 26, 2011 11:58:51 AM 
 */
package ugportal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import com.google.appengine.api.datastore.Link;

/**
 * {@link Event} represents an event organized by user group.
 * 
 * @author Ondrej Kvasnovsky
 */
public class Event implements Serializable {
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -5134880099193477444L;
    /**
     * address where event is organized
     */
    private String address;

    /**
     * date when an even happens
     */
    private Date date;

    /**
     * description of event, providing more info about an event
     */
    private String description;

    /**
     * event id
     */
    @Id
    private String id;

    /**
     * link to more details or registration page
     */
    private Link link;

    /**
     * Returns the address.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the date.
     * 
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Returns the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
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
     * Returns the link.
     * 
     * @return the link
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets the address.
     * 
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the date.
     * 
     * @param date
     *            the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Sets the description.
     * 
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Sets the link.
     * 
     * @param link
     *            the link to set
     */
    public void setLink(Link link) {
        this.link = link;
    }

}

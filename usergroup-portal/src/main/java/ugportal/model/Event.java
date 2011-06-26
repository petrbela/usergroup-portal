/**
 * Event.java, Jun 26, 2011 11:58:51 AM 
 */
package ugportal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
     * author who made an event
     */
    private User author;

    /**
     * date when an even happens
     */
    private Date date;

    /**
     * description of event, providing more info about an event
     */
    private String description;

    /**
     * event type
     */
    private EventType eventType;

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
     * participants of an event
     */
    private List<User> participants;
    /**
     * source materials
     */
    private List<SourceMaterial> sourceMaterials;

    /**
     * Returns the address.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the author.
     * 
     * @return the author
     */
    public User getAuthor() {
        return author;
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
     * Returns the eventType.
     * 
     * @return the eventType
     */
    public EventType getEventType() {
        return eventType;
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
     * Returns the participants.
     * 
     * @return the participants
     */
    public List<User> getParticipants() {
        return participants;
    }

    /**
     * Returns the sourceMaterials.
     * 
     * @return the sourceMaterials
     */
    public List<SourceMaterial> getSourceMaterials() {
        return sourceMaterials;
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
     * Sets the author.
     * 
     * @param author
     *            the author to set
     */
    public void setAuthor(User author) {
        this.author = author;
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
     * Sets the eventType.
     * 
     * @param eventType
     *            the eventType to set
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
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

    /**
     * Sets the participants.
     * 
     * @param participants
     *            the participants to set
     */
    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    /**
     * Sets the sourceMaterials.
     * 
     * @param sourceMaterials
     *            the sourceMaterials to set
     */
    public void setSourceMaterials(List<SourceMaterial> sourceMaterials) {
        this.sourceMaterials = sourceMaterials;
    }

}

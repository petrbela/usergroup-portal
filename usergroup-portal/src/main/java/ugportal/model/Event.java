/**
 * Event.java, Jun 26, 2011 11:58:51 AM 
 */
package ugportal.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import ugportal.dao.DaoFactory;
import ugportal.dao.objectify.DaoSourceMaterialObjecitfy;
import ugportal.dao.objectify.DaoUserObjectify;

import com.google.appengine.api.datastore.Link;
import com.googlecode.objectify.Key;

/**
 * {@link Event} represents an event organized by user group.
 * 
 * @author Ondrej Kvasnovsky
 */
public class Event implements Serializable {

    // private final DaoUserObjectify daoUserObjectify = (DaoUserObjectify)
    // DaoFactory.getInstance().getDaoUser();
    // private final DaoSourceMaterialObjecitfy daoSourceMaterialObjecitfy =
    // (DaoSourceMaterialObjecitfy) DaoFactory
    // .getInstance().getDaoSourceMaterial();
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -5134880099193477444L;
    /**
     * title of event
     */
    private String label;
    /**
     * address where event is organized
     */
    private String address;

    /**
     * author who made an event
     */
    private Key<User> author;

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
    private Long id;

    /**
     * link to more details or registration page
     */
    private Link link;
    /**
     * participants of an event
     */
    private List<Key<User>> participants = new ArrayList<Key<User>>();
    /**
     * source materials
     */
    private List<Key<SourceMaterial>> sourceMaterials = new ArrayList<Key<SourceMaterial>>();

    /**
     * Returns the address.
     * 
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Returns the author.
     * 
     * @return the author
     */
    public User getAuthor() {
        return ((DaoUserObjectify) DaoFactory.getInstance().getDaoUser()).get(this.author);
    }

    /**
     * Returns the date.
     * 
     * @return the date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Returns the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Returns the eventType.
     * 
     * @return the eventType
     */
    public EventType getEventType() {
        return this.eventType;
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
     * Returns the link.
     * 
     * @return the link
     */
    public Link getLink() {
        return this.link;
    }

    /**
     * Returns the participants.
     * 
     * @return the participants
     */
    public List<User> getParticipants() {
        return ((DaoUserObjectify) DaoFactory.getInstance().getDaoUser()).getAllByKeys(this.participants);
    }

    /**
     * Returns the sourceMaterials.
     * 
     * @return the sourceMaterials
     */
    public List<SourceMaterial> getSourceMaterials() {
        return ((DaoSourceMaterialObjecitfy) DaoFactory.getInstance().getDaoSourceMaterial())
                .getByAllKeys(this.sourceMaterials);
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
        this.author = ((DaoUserObjectify) DaoFactory.getInstance().getDaoUser()).put(author);
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
    public void setId(Long id) {
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
    public List<Key<User>> setParticipants(List<User> participants) {
        return new ArrayList<Key<User>>(((DaoUserObjectify) DaoFactory.getInstance().getDaoUser()).putAll(participants));
    }

    /**
     * Sets the sourceMaterials.
     * 
     * @param sourceMaterials
     *            the sourceMaterials to set
     */
    public List<Key<SourceMaterial>> setSourceMaterials(List<SourceMaterial> sourceMaterials) {
        return ((DaoSourceMaterialObjecitfy) DaoFactory.getInstance().getDaoSourceMaterial()).putAll(sourceMaterials);
    }

    public void addParticipant(User participant) {
        this.participants.add(((DaoUserObjectify) DaoFactory.getInstance().getDaoUser()).put(participant));
    }

    public void addSourceMaterial(SourceMaterial sourceMaterial) {
        this.sourceMaterials.add(((DaoSourceMaterialObjecitfy) DaoFactory.getInstance().getDaoSourceMaterial())
                .put(sourceMaterial));
    }

}

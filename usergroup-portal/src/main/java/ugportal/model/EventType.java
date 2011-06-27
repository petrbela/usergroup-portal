/**
 * EventType.java, Jun 26, 2011 12:15:38 PM 
 */
package ugportal.model;

import javax.persistence.Id;

/**
 * {@link EventType} represents a type of an event (e.g. online, offline)
 * 
 * @author Ondrej Kvasnovsky
 */
public class EventType {
    /**
     * event type id
     */
    @Id
    private String id;

    /**
     * label (e.g. online, offline)
     */
    private String label;

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Returns the label.
     * 
     * @return the label
     */
    public String getLabel() {
        return this.label;
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
     * Sets the label.
     * 
     * @param label
     *            the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

}

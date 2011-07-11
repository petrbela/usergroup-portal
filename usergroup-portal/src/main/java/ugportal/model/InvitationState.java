/**
 * InvitationState.java, Jun 26, 2011 12:13:27 PM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * {@link InvitationState} represents a state of the invitation (e.g. new, sent,
 * opened, registered).
 * 
 * @author Ondrej Kvasnovsky
 */
public class InvitationState implements Serializable {
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = 6999713113263111153L;

    /**
     * invitation state id
     */
    @Id
    private String id;

    /**
     * label (e.g. new, sent, opened, registered)
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

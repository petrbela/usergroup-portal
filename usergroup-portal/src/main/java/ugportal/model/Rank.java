/**
 * Rank.java, Jun 26, 2011 11:41:23 AM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * {@link Rank} represents a rank of the user (e.g. member, speaker, leader...).
 * 
 * @author Ondrej Kvasnovsky
 */
public class Rank implements Serializable {
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = 2305514793410913912L;
    /**
     * rank id
     */
    @Id
    private String id;
    /**
     * rank label (e.g. member, speaker, leader...)
     */
    private String label;

    /**
     * Creates new instance.
     */
    public Rank() {
        super();
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
     * Returns the label.
     * 
     * @return the label
     */
    public String getLabel() {
        return label;
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

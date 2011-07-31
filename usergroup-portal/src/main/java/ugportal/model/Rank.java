/**
 * Rank.java, Jun 26, 2011 11:41:23 AM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    private Long id;
    /**
     * rank label (e.g. member, speaker, leader...)
     */
    private String label;

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
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
    public void setId(Long id) {
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

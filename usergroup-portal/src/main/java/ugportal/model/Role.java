/**
 * Role.java, Jun 26, 2011 12:06:18 PM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * {@link Role} represents permissions of an user (e.g. member, admin,
 * superadmin).
 * 
 * @author Ondrej Kvasnovsky
 */
public class Role implements Serializable {
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -8723206709606334995L;
    /**
     * role id
     */
    @Id
    private String id;
    /**
     * role label (e.g. member, admin, superadmin)
     */
    private String label;

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

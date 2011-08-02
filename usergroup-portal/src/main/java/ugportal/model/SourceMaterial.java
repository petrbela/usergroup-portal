/**
 * SourceMaterial.java, Jun 26, 2011 12:17:43 PM 
 */
package ugportal.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Link;

/**
 * {@link SourceMaterial} represents material related to the event (e.g.
 * presentations, example source codes, video, picture...).
 * 
 * @author Ondrej Kvasnovsky
 */
public class SourceMaterial implements Serializable {

    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -9174710968925329300L;
    /**
     * description of a source material
     */
    private String description;

    /**
     * file (presentation, ZIP file, ...)
     */
    private Blob file;

    /**
     * source material id
     */
    @Id
    @GeneratedValue
    private String id;

    /**
     * label - short description of a source material
     */
    private String label;

    /**
     * link to the material
     */
    private Link link;

    /**
     * Returns the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Returns the file.
     * 
     * @return the file
     */
    public Blob getFile() {
        return this.file;
    }

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
     * Returns the link.
     * 
     * @return the link
     */
    public Link getLink() {
        return this.link;
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
     * Sets the file.
     * 
     * @param file
     *            the file to set
     */
    public void setFile(Blob file) {
        this.file = file;
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

/**
 * SourceMaterialTest.java, Jun 26, 2011 1:26:06 PM 
 */
package ugportal.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Link;

/**
 * @author Ondrej Kvasnovsky
 */
public class SourceMaterialTest {

    private SourceMaterial testSourceMaterial;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testSourceMaterial = new SourceMaterial();
    }

    /**
     * Test method for {@link ugportal.model.SourceMaterial#getDescription()}.
     */
    @Test
    public final void testGetDescription() {
        String description = "description...";
        this.testSourceMaterial.setDescription(description);
        Assert.assertEquals(description, this.testSourceMaterial.getDescription());
    }

    /**
     * Test method for {@link ugportal.model.SourceMaterial#getFile()}.
     */
    @Test
    public final void testGetFile() {
        Blob file = new Blob(null);
        this.testSourceMaterial.setFile(file);
        Assert.assertEquals(file, this.testSourceMaterial.getFile());
    }

    /**
     * Test method for {@link ugportal.model.SourceMaterial#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "SM001";
        this.testSourceMaterial.setId(id);
        Assert.assertEquals(id, this.testSourceMaterial.getId());
    }

    /**
     * Test method for {@link ugportal.model.SourceMaterial#getLabel()}.
     */
    @Test
    public final void testGetLabel() {
        String label = "Presentation";
        this.testSourceMaterial.setLabel(label);
        Assert.assertEquals(label, this.testSourceMaterial.getLabel());
    }

    /**
     * Test method for {@link ugportal.model.SourceMaterial#getLink()}.
     */
    @Test
    public final void testGetLink() {
        Link link = new Link("www.google.com");
        this.testSourceMaterial.setLink(link);
        Assert.assertEquals(link, this.testSourceMaterial.getLink());
    }

    /**
     * Test method for
     * {@link ugportal.model.SourceMaterial#setDescription(java.lang.String)}.
     */
    @Test
    public final void testSetDescription() {
        String description = "description...";
        this.testSourceMaterial.setDescription(description);
        Assert.assertEquals(description, this.testSourceMaterial.getDescription());
    }

    /**
     * Test method for
     * {@link ugportal.model.SourceMaterial#setFile(com.google.appengine.api.datastore.Blob)}
     * .
     */
    @Test
    public final void testSetFile() {
        Blob file = new Blob(null);
        this.testSourceMaterial.setFile(file);
        Assert.assertEquals(file, this.testSourceMaterial.getFile());
    }

    /**
     * Test method for
     * {@link ugportal.model.SourceMaterial#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "SM001";
        this.testSourceMaterial.setId(id);
        Assert.assertEquals(id, this.testSourceMaterial.getId());
    }

    /**
     * Test method for
     * {@link ugportal.model.SourceMaterial#setLabel(java.lang.String)}.
     */
    @Test
    public final void testSetLabel() {
        String label = "Presentation";
        this.testSourceMaterial.setLabel(label);
        Assert.assertEquals(label, this.testSourceMaterial.getLabel());
    }

    /**
     * Test method for
     * {@link ugportal.model.SourceMaterial#setLink(com.google.appengine.api.datastore.Link)}
     * .
     */
    @Test
    public final void testSetLink() {
        Link link = new Link("www.google.com");
        this.testSourceMaterial.setLink(link);
        Assert.assertEquals(link, this.testSourceMaterial.getLink());
    }

}

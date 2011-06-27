/**
 * EventTypeTest.java, Jun 26, 2011 1:23:02 PM 
 */
package ugportal.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ondrej Kvasnovsky
 */
public class EventTypeTest {

    private EventType testEventType;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testEventType = new EventType();
    }

    /**
     * Test method for {@link ugportal.model.EventType#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "ID001";
        this.testEventType.setId(id);
        Assert.assertEquals(id, this.testEventType.getId());
    }

    /**
     * Test method for {@link ugportal.model.EventType#getLabel()}.
     */
    @Test
    public final void testGetLabel() {
        String label = "Offline";
        this.testEventType.setLabel(label);
        Assert.assertEquals(label, this.testEventType.getLabel());
    }

    /**
     * Test method for {@link ugportal.model.EventType#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "ID001";
        this.testEventType.setId(id);
        Assert.assertEquals(id, this.testEventType.getId());
    }

    /**
     * Test method for
     * {@link ugportal.model.EventType#setLabel(java.lang.String)}.
     */
    @Test
    public final void testSetLabel() {
        String label = "Offline";
        this.testEventType.setLabel(label);
        Assert.assertEquals(label, this.testEventType.getLabel());
    }

}

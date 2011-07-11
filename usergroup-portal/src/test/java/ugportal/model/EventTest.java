/**
 * EventTest.java, Jun 26, 2011 12:49:29 PM 
 */
package ugportal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.appengine.api.datastore.Link;

/**
 * @author Ondrej Kvasnovsky
 */
public class EventTest {

    /**
     * test event
     */
    private Event testEvent;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testEvent = new Event();
    }

    /**
     * Test method for {@link ugportal.model.Event#getAddress()}.
     */
    @Test
    public final void testGetAddress() {
        String address = "New York";
        this.testEvent.setAddress(address);
        Assert.assertEquals(address, this.testEvent.getAddress());
    }

    /**
     * Test method for {@link ugportal.model.Event#getAuthor()}.
     */
    @Test
    public final void testGetAuthor() {
        User author = new User();
        this.testEvent.setAuthor(author);
        Assert.assertEquals(author, this.testEvent.getAuthor());
    }

    /**
     * Test method for {@link ugportal.model.Event#getDate()}.
     */
    @Test
    public final void testGetDate() {
        Date date = new Date();
        this.testEvent.setDate(date);
        Assert.assertEquals(date, this.testEvent.getDate());
    }

    /**
     * Test method for {@link ugportal.model.Event#getDescription()}.
     */
    @Test
    public final void testGetDescription() {
        String description = "description...";
        this.testEvent.setDescription(description);
        Assert.assertEquals(description, this.testEvent.getDescription());
    }

    /**
     * Test method for {@link ugportal.model.Event#getEventType()}.
     */
    @Test
    public final void testGetEventType() {
        EventType eventType = new EventType();
        this.testEvent.setEventType(eventType);
        Assert.assertEquals(eventType, this.testEvent.getEventType());
    }

    /**
     * Test method for {@link ugportal.model.Event#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "EVN010";
        this.testEvent.setId(id);
        Assert.assertEquals(id, this.testEvent.getId());
    }

    /**
     * Test method for {@link ugportal.model.Event#getLink()}.
     */
    @Test
    public final void testGetLink() {
        Link link = new Link("www.google.com");
        this.testEvent.setLink(link);
        Assert.assertEquals(link, this.testEvent.getLink());
    }

    /**
     * Test method for {@link ugportal.model.Event#getParticipants()}.
     */
    @Test
    public final void testGetParticipants() {
        List<User> participants = new ArrayList<User>();
        this.testEvent.setParticipants(participants);
        Assert.assertEquals(participants, this.testEvent.getParticipants());
    }

    /**
     * Test method for {@link ugportal.model.Event#getSourceMaterials()}.
     */
    @Test
    public final void testGetSourceMaterials() {
        List<SourceMaterial> sourceMaterial = new ArrayList<SourceMaterial>();
        this.testEvent.setSourceMaterials(sourceMaterial);
        Assert.assertEquals(sourceMaterial, this.testEvent.getSourceMaterials());
    }

    /**
     * Test method for {@link ugportal.model.Event#setAddress(java.lang.String)}
     * .
     */
    @Test
    public final void testSetAddress() {
        String address = "New York";
        this.testEvent.setAddress(address);
        Assert.assertEquals(address, this.testEvent.getAddress());
    }

    /**
     * Test method for
     * {@link ugportal.model.Event#setAuthor(ugportal.model.User)}.
     */
    @Test
    public final void testSetAuthor() {
        User author = new User();
        this.testEvent.setAuthor(author);
        Assert.assertEquals(author, this.testEvent.getAuthor());
    }

    /**
     * Test method for {@link ugportal.model.Event#setDate(java.util.Date)}.
     */
    @Test
    public final void testSetDate() {
        Date date = new Date();
        this.testEvent.setDate(date);
        Assert.assertEquals(date, this.testEvent.getDate());
    }

    /**
     * Test method for
     * {@link ugportal.model.Event#setDescription(java.lang.String)}.
     */
    @Test
    public final void testSetDescription() {
        String description = "description...";
        this.testEvent.setDescription(description);
        Assert.assertEquals(description, this.testEvent.getDescription());
    }

    /**
     * Test method for
     * {@link ugportal.model.Event#setEventType(ugportal.model.EventType)}.
     */
    @Test
    public final void testSetEventType() {
        EventType eventType = new EventType();
        this.testEvent.setEventType(eventType);
        Assert.assertEquals(eventType, this.testEvent.getEventType());
    }

    /**
     * Test method for {@link ugportal.model.Event#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "EVN010";
        this.testEvent.setId(id);
        Assert.assertEquals(id, this.testEvent.getId());
    }

    /**
     * Test method for
     * {@link ugportal.model.Event#setLink(com.google.appengine.api.datastore.Link)}
     * .
     */
    @Test
    public final void testSetLink() {
        Link link = new Link("www.google.com");
        this.testEvent.setLink(link);
        Assert.assertEquals(link, this.testEvent.getLink());
    }

    /**
     * Test method for
     * {@link ugportal.model.Event#setParticipants(java.util.List)}.
     */
    @Test
    public final void testSetParticipants() {
        List<User> participants = new ArrayList<User>();
        this.testEvent.setParticipants(participants);
        Assert.assertEquals(participants, this.testEvent.getParticipants());
    }

    /**
     * Test method for
     * {@link ugportal.model.Event#setSourceMaterials(java.util.List)}.
     */
    @Test
    public final void testSetSourceMaterials() {
        List<SourceMaterial> sourceMaterial = new ArrayList<SourceMaterial>();
        this.testEvent.setSourceMaterials(sourceMaterial);
        Assert.assertEquals(sourceMaterial, this.testEvent.getSourceMaterials());
    }

}

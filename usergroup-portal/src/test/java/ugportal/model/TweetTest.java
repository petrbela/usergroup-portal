/**
 * TweetTest.java, 26.6.2011 19:15:22 
 */
package ugportal.model;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.appengine.api.datastore.Link;

/**
 * @author Tomas Vantuch
 */
public class TweetTest {

    private Tweet testTweet;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testTweet = new Tweet();
    }

    /**
     * Test method for {@link ugportal.model.Tweet#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "srghryfg35b4684d6f";
        this.testTweet.setId(id);
        Assert.assertEquals(id, this.testTweet.getId());
    }

    /**
     * Test method for {@link ugportal.model.Tweet#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "srghryfg35b4684d6f";
        this.testTweet.setId(id);
        Assert.assertEquals(id, this.testTweet.getId());
    }

    /**
     * Test method for {@link ugportal.model.Tweet#getDescription()}.
     */
    @Test
    public final void testGetDescription() {
        String description = "descr....";
        this.testTweet.setDescription(description);
        Assert.assertEquals(description, this.testTweet.getDescription());
    }

    /**
     * Test method for
     * {@link ugportal.model.Tweet#setDescription(java.lang.String)}.
     */
    @Test
    public final void testSetDescription() {
        String description = "descr....";
        this.testTweet.setDescription(description);
        Assert.assertEquals(description, this.testTweet.getDescription());
    }

    /**
     * Test method for {@link ugportal.model.Tweet#getTitle()}.
     */
    @Test
    public final void testGetTitle() {
        String title = "title";
        this.testTweet.setTitle(title);
        Assert.assertEquals(title, this.testTweet.getTitle());
    }

    /**
     * Test method for {@link ugportal.model.Tweet#setTitle(java.lang.String)}.
     */
    @Test
    public final void testSetTitle() {
        String title = "title";
        this.testTweet.setTitle(title);
        Assert.assertEquals(title, this.testTweet.getTitle());
    }

    /**
     * Test method for {@link ugportal.model.Tweet#getDateTime()}.
     */
    @Test
    public final void testGetDateTime() {
        Date dateTime = new Date();
        this.testTweet.setDateTime(dateTime);
        Assert.assertEquals(dateTime, this.testTweet.getDateTime());
    }

    /**
     * Test method for {@link ugportal.model.Tweet#setDateTime(java.util.Date)}.
     */
    @Test
    public final void testSetDateTime() {
        Date dateTime = new Date();
        this.testTweet.setDateTime(dateTime);
        Assert.assertEquals(dateTime, this.testTweet.getDateTime());
    }

    /**
     * Test method for {@link ugportal.model.Tweet#getLink()}.
     */
    @Test
    public final void testGetLink() {
        Link link = new Link("www.azet.sk");
        this.testTweet.setLink(link);
        Assert.assertEquals(link, this.testTweet.getLink());
    }

    /**
     * Test method for
     * {@link ugportal.model.Tweet#setLink(com.google.appengine.api.datastore.Link)}
     * .
     */
    @Test
    public final void testSetLink() {
        Link link = new Link("www.azet.sk");
        this.testTweet.setLink(link);
        Assert.assertEquals(link, this.testTweet.getLink());
    }

}

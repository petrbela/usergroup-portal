/**
 * BlogPostTest.java, 26.6.2011 19:28:10 
 */
package ugportal.model;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.google.appengine.api.datastore.Link;

/**
 * @author Tomas Vantuch
 */
public class BlogPostTest {

    private BlogPost blogPost;

    /**
     * Test method for {@link ugportal.model.BlogPost#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "srghryfg35b4684d6f";
        this.blogPost.setId(id);
        Assert.assertEquals(id, this.blogPost.getId());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "srghryfg35b4684d6f";
        this.blogPost.setId(id);
        Assert.assertEquals(id, this.blogPost.getId());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getDescription()}.
     */
    @Test
    public final void testGetDescription() {
        String description = "descr....";
        this.blogPost.setDescription(description);
        Assert.assertEquals(description, this.blogPost.getDescription());
    }

    /**
     * Test method for
     * {@link ugportal.model.BlogPost#setDescription(java.lang.String)}.
     */
    @Test
    public final void testSetDescription() {
        String description = "descr....";
        this.blogPost.setDescription(description);
        Assert.assertEquals(description, this.blogPost.getDescription());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getTitle()}.
     */
    @Test
    public final void testGetTitle() {
        String title = "title";
        this.blogPost.setTitle(title);
        Assert.assertEquals(title, this.blogPost.getTitle());
    }

    /**
     * Test method for
     * {@link ugportal.model.BlogPost#setTitle(java.lang.String)}.
     */
    @Test
    public final void testSetTitle() {
        String title = "title";
        this.blogPost.setTitle(title);
        Assert.assertEquals(title, this.blogPost.getTitle());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getDateTime()}.
     */
    @Test
    public final void testGetDateTime() {
        Date dateTime = new Date();
        this.blogPost.setDateTime(dateTime);
        Assert.assertEquals(dateTime, this.blogPost.getDateTime());
    }

    /**
     * Test method for
     * {@link ugportal.model.BlogPost#setDateTime(java.util.Date)}.
     */
    @Test
    public final void testSetDateTime() {
        Date dateTime = new Date();
        this.blogPost.setDateTime(dateTime);
        Assert.assertEquals(dateTime, this.blogPost.getDateTime());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getLink()}.
     */
    @Test
    public final void testGetLink() {
        Link link = new Link("www.azet.sk");
        this.blogPost.setLink(link);
        Assert.assertEquals(link, this.blogPost.getLink());
    }

    /**
     * Test method for
     * {@link ugportal.model.BlogPost#setLink(com.google.appengine.api.datastore.Link)}
     * .
     */
    @Test
    public final void testSetLink() {
        Link link = new Link("www.azet.sk");
        this.blogPost.setLink(link);
        Assert.assertEquals(link, this.blogPost.getLink());
    }
}

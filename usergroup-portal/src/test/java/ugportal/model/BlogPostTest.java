/**
 * BlogPostTest.java, 26.6.2011 19:28:10 
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
public class BlogPostTest {

    private BlogPost testBlogPost;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testBlogPost = new BlogPost();
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "srghryfg35b4684d6f";
        this.testBlogPost.setId(id);
        Assert.assertEquals(id, this.testBlogPost.getId());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "srghryfg35b4684d6f";
        this.testBlogPost.setId(id);
        Assert.assertEquals(id, this.testBlogPost.getId());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getDescription()}.
     */
    @Test
    public final void testGetDescription() {
        String description = "descr....";
        this.testBlogPost.setDescription(description);
        Assert.assertEquals(description, this.testBlogPost.getDescription());
    }

    /**
     * Test method for
     * {@link ugportal.model.BlogPost#setDescription(java.lang.String)}.
     */
    @Test
    public final void testSetDescription() {
        String description = "descr....";
        this.testBlogPost.setDescription(description);
        Assert.assertEquals(description, this.testBlogPost.getDescription());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getTitle()}.
     */
    @Test
    public final void testGetTitle() {
        String title = "title";
        this.testBlogPost.setTitle(title);
        Assert.assertEquals(title, this.testBlogPost.getTitle());
    }

    /**
     * Test method for
     * {@link ugportal.model.BlogPost#setTitle(java.lang.String)}.
     */
    @Test
    public final void testSetTitle() {
        String title = "title";
        this.testBlogPost.setTitle(title);
        Assert.assertEquals(title, this.testBlogPost.getTitle());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getDateTime()}.
     */
    @Test
    public final void testGetDateTime() {
        Date dateTime = new Date();
        this.testBlogPost.setDateTime(dateTime);
        Assert.assertEquals(dateTime, this.testBlogPost.getDateTime());
    }

    /**
     * Test method for
     * {@link ugportal.model.BlogPost#setDateTime(java.util.Date)}.
     */
    @Test
    public final void testSetDateTime() {
        Date dateTime = new Date();
        this.testBlogPost.setDateTime(dateTime);
        Assert.assertEquals(dateTime, this.testBlogPost.getDateTime());
    }

    /**
     * Test method for {@link ugportal.model.BlogPost#getLink()}.
     */
    @Test
    public final void testGetLink() {
        Link link = new Link("www.azet.sk");
        this.testBlogPost.setLink(link);
        Assert.assertEquals(link, this.testBlogPost.getLink());
    }

    /**
     * Test method for
     * {@link ugportal.model.BlogPost#setLink(com.google.appengine.api.datastore.Link)}
     * .
     */
    @Test
    public final void testSetLink() {
        Link link = new Link("www.azet.sk");
        this.testBlogPost.setLink(link);
        Assert.assertEquals(link, this.testBlogPost.getLink());
    }
}

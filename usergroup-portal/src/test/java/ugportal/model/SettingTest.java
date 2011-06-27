/**
 * SettingTest.java, 26.6.2011 19:53:20 
 */
package ugportal.model;

import org.junit.Assert;
import org.junit.Test;

import com.google.appengine.api.datastore.Link;

/**
 * @author Tomas Vantuch
 */
public class SettingTest {

    private Setting testSetting;

    /**
     * Test method for {@link ugportal.model.Setting#getLinkTwitter()}.
     */
    @Test
    public final void testGetLinkTwitter() {
        Link link = new Link("http://www.seznam.cz");
        this.testSetting.setLinkTwitter(link);
        Assert.assertEquals(link, this.testSetting.getLinkTwitter());
    }

    /**
     * Test method for
     * {@link ugportal.model.Setting#setLinkTwitter(com.google.appengine.api.datastore.Link)}
     * .
     */
    @Test
    public final void testSetLinkTwitter() {
        Link link = new Link("http://www.seznam.cz");
        this.testSetting.setLinkTwitter(link);
        Assert.assertEquals(link, this.testSetting.getLinkTwitter());
    }

    /**
     * Test method for {@link ugportal.model.Setting#getLinkBlogPost()}.
     */
    @Test
    public final void testGetLinkBlogPost() {
        Link link = new Link("http://www.seznam.cz");
        this.testSetting.setLinkBlogPost(link);
        Assert.assertEquals(link, this.testSetting.getLinkBlogPost());
    }

    /**
     * Test method for
     * {@link ugportal.model.Setting#setLinkBlogPost(com.google.appengine.api.datastore.Link)}
     * .
     */
    @Test
    public final void testSetLinkBlogPost() {
        Link link = new Link("http://www.seznam.cz");
        this.testSetting.setLinkBlogPost(link);
        Assert.assertEquals(link, this.testSetting.getLinkBlogPost());
    }
}

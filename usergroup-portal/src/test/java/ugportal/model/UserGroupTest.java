/**
 * UserGroupTest.java, 26.6.2011 19:32:26 
 */
package ugportal.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.appengine.api.datastore.Text;

/**
 * @author Tomas
 */
public class UserGroupTest {

    private UserGroup testUserGroup;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testUserGroup = new UserGroup();
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getName()}.
     */
    @Test
    public final void testGetName() {
        String name = "java";
        this.testUserGroup.setName(name);
        Assert.assertEquals(name, this.testUserGroup.getName());
    }

    /**
     * Test method for
     * {@link ugportal.model.UserGroup#setName(java.lang.String)}.
     */
    @Test
    public final void testSetName() {
        String name = "java";
        this.testUserGroup.setName(name);
        Assert.assertEquals(name, this.testUserGroup.getName());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getAbout()}.
     */
    @Test
    public final void testGetAbout() {
        Text about = new Text("about java");
        this.testUserGroup.setAbout(about);
        Assert.assertEquals(about, this.testUserGroup.getAbout());
    }

    /**
     * Test method for
     * {@link ugportal.model.UserGroup#setAbout(com.google.appengine.api.datastore.Text)
     * }
     * .
     */
    @Test
    public final void testSetAbout() {
        Text about = new Text("about java");
        this.testUserGroup.setAbout(about);
        Assert.assertEquals(about, this.testUserGroup.getAbout());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "sbgifsd5sv63";
        this.testUserGroup.setId(id);
        Assert.assertEquals(id, this.testUserGroup.getId());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#setId(java.lang.String)}
     * .
     */
    @Test
    public final void testSetId() {
        String id = "sbgifsd5sv63";
        this.testUserGroup.setId(id);
        Assert.assertEquals(id, this.testUserGroup.getId());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getTweets()}.
     */
    @Test
    public final void testGetTweets() {
        List<Tweet> tweets = new ArrayList<Tweet>();
        this.testUserGroup.setTweets(tweets);
        Assert.assertEquals(tweets, this.testUserGroup.getTweets());
    }

    /**
     * Test method for
     * {@link ugportal.model.UserGroup#setTweets(java.util.List)}.
     */
    @Test
    public final void testSetTweets() {
        List<Tweet> tweets = new ArrayList<Tweet>();
        this.testUserGroup.setTweets(tweets);
        Assert.assertEquals(tweets, this.testUserGroup.getTweets());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getBlogposts()}.
     */
    @Test
    public final void testGetBlogposts() {
        List<BlogPost> blogPosts = new ArrayList<BlogPost>();
        this.testUserGroup.setBlogposts(blogPosts);
        Assert.assertEquals(blogPosts, this.testUserGroup.getBlogposts());
    }

    /**
     * Test method for
     * {@link ugportal.model.UserGroup#setBlogposts(java.util.List)}.
     */
    @Test
    public final void testSetBlogposts() {
        List<BlogPost> blogPosts = new ArrayList<BlogPost>();
        this.testUserGroup.setBlogposts(blogPosts);
        Assert.assertEquals(blogPosts, this.testUserGroup.getBlogposts());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getSetting()}.
     */
    @Test
    public final void testGetSetting() {
        Setting setting = new Setting();
        this.testUserGroup.setSetting(setting);
        Assert.assertEquals(setting, this.testUserGroup.getSetting());
    }

    /**
     * Test method for
     * {@link ugportal.model.UserGroup#setSetting(ugportal.model.Setting)}.
     */
    @Test
    public final void testSetSetting() {
        Setting setting = new Setting();
        this.testUserGroup.setSetting(setting);
        Assert.assertEquals(setting, this.testUserGroup.getSetting());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getInvitations()}.
     */
    @Test
    public final void testGetInvitations() {
        List<Invitation> invitations = new ArrayList<Invitation>();
        this.testUserGroup.setInvitations(invitations);
        Assert.assertEquals(invitations, this.testUserGroup.getInvitations());
    }

    /**
     * Test method for
     * {@link ugportal.model.UserGroup#setInvitations(java.util.List)}.
     */
    @Test
    public final void testSetInvitations() {
        List<Invitation> invitations = new ArrayList<Invitation>();
        this.testUserGroup.setInvitations(invitations);
        Assert.assertEquals(invitations, this.testUserGroup.getInvitations());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getUsers()} .
     */
    @Test
    public final void testGetUsers() {
        List<User> users = new ArrayList<User>();
        this.testUserGroup.setUsers(users);
        Assert.assertEquals(users, this.testUserGroup.getUsers());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#setUsers(java.util.List)}
     * .
     */
    @Test
    public final void testSetUsers() {
        List<User> users = new ArrayList<User>();
        this.testUserGroup.setUsers(users);
        Assert.assertEquals(users, this.testUserGroup.getUsers());
    }

    /**
     * Test method for {@link ugportal.model.UserGroup#getEvents()} .
     */
    @Test
    public final void testGetEvents() {
        List<Event> events = new ArrayList<Event>();
        this.testUserGroup.setEvents(events);
        Assert.assertEquals(events, this.testUserGroup.getEvents());
    }

    /**
     * Test method for
     * {@link ugportal.model.UserGroup#setEvents(java.util.List)} .
     */
    @Test
    public final void testSetEvents() {
        List<Event> events = new ArrayList<Event>();
        this.testUserGroup.setEvents(events);
        Assert.assertEquals(events, this.testUserGroup.getEvents());
    }

}

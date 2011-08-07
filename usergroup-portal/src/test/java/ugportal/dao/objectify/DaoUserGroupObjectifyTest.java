/**
 * DaoUserGroupObjectifyTest.java, 25.7.2011 18:57:46 
 */
package ugportal.dao.objectify;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.BlogPost;
import ugportal.model.Event;
import ugportal.model.Invitation;
import ugportal.model.Rank;
import ugportal.model.Setting;
import ugportal.model.Tweet;
import ugportal.model.User;
import ugportal.model.UserGroup;

import com.google.appengine.api.datastore.Link;
import com.google.appengine.api.datastore.Text;

/**
 * @author Tomas Vantuch
 */
public class DaoUserGroupObjectifyTest {

    private final DaoUserGroupObjectify daoUserGroupObjectify = (DaoUserGroupObjectify) DaoFactory.getInstance()
            .getDaoUserGroup();

    @Before
    public void setUp() throws Exception {
        LocalDataStoreInitializer.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        LocalDataStoreInitializer.tearDown();
    }

    @Test
    public void testGet() {
        /**
         * usergroup entity created
         */
        UserGroup userGroup = UserGroup.getInstance();
        userGroup.setName("Java-Ostrava");
        userGroup.setAbout(new Text("about java"));
        /**
         * setting to usergoup
         */
        Setting setting = new Setting();
        setting.setLinkTwitter(new Link("www.twitter.com"));
        setting.setLinkBlogPost(new Link("blogpost.com"));
        /**
         * some tweets to usergroup
         */
        Tweet tweet = new Tweet();
        tweet.setDateTime(new Date());
        Tweet tweet2 = new Tweet();
        tweet2.setDateTime(new Date());
        /**
         * some blogposts to usergroup
         */
        BlogPost blogPost = new BlogPost();
        blogPost.setDateTime(new Date());
        BlogPost blogPost2 = new BlogPost();
        blogPost2.setDateTime(new Date());
        /**
         * user as invitator, usergoup member, event participant and creator
         */
        User user = new User();
        user.setFirstname("anton");
        Rank rank = new Rank();
        rank.setLabel("boss");
        user.setRank(rank);
        /**
         * invitation into usergroup
         */
        Invitation invitation = new Invitation();
        invitation.setInvitedByUser(user);
        invitation.setRegisteredUser(user);

        /**
         * event of usergroup
         */
        Event event = new Event();
        event.setDate(new Date());
        event.addParticipant(user);
        event.setAuthor(user);
        /**
         * all entities added to usergroup
         */
        userGroup.addEvent(event);
        userGroup.setSetting(setting);
        userGroup.addTweet(tweet);
        userGroup.addTweet(tweet2);
        userGroup.addBlogPost(blogPost);
        userGroup.addBlogPost(blogPost2);
        userGroup.addInvitation(invitation);
        userGroup.addUser(user);
        /**
         * whole usergroup saved
         */
        this.daoUserGroupObjectify.put(userGroup);
        UserGroup userGroup2 = this.daoUserGroupObjectify.get();
        /**
         * checking of all conditions
         */
        Assert.assertNotNull(userGroup2);
        idTestCondition(userGroup.getId(), userGroup2.getId());
        nameTestCondition(userGroup.getName(), userGroup2.getName());
        aboutTestCondition(userGroup.getAbout(), userGroup2.getAbout());
        settingTestCondition(userGroup.getSetting(), userGroup2.getSetting());
        blogPostTestCondition(userGroup.getBlogposts().get(0), userGroup2.getBlogposts().get(0));
        eventTestCondition(userGroup.getEvents(), userGroup2.getEvents());
        invitationTestCondition(userGroup.getInvitations(), userGroup2.getInvitations());
        tweetTestCondition(userGroup.getTweets(), userGroup2.getTweets());
        usersTestCondition(userGroup.getUsers(), userGroup2.getUsers());

    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void nameTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void settingTestCondition(Setting a, Setting b) {
        DaoSettingObjectifyTest.linkBlogPostTestCondition(a.getLinkBlogPost(), b.getLinkBlogPost());
        DaoSettingObjectifyTest.linkTwitterTestCondition(a.getLinkTwitter(), b.getLinkTwitter());
    }

    public static void blogPostTestCondition(BlogPost a, BlogPost b) {
        DaoBlogPostObjectifyTest.dateTestCondition(a.getDateTime(), b.getDateTime());
        DaoBlogPostObjectifyTest.authorLinkTestCondition(a.getAuthorLink(), b.getAuthorLink());
        DaoBlogPostObjectifyTest.authorTestCondition(a.getAuthor(), b.getAuthor());
        DaoBlogPostObjectifyTest.descriptionTestCondition(a.getDescription(), b.getDescription());
        DaoBlogPostObjectifyTest.idTestCondition(a.getId(), b.getId());
        DaoBlogPostObjectifyTest.linkTestCondition(a.getLink(), b.getLink());
        DaoBlogPostObjectifyTest.titleTestCondition(a.getTitle(), b.getTitle());
    }

    public static void aboutTestCondition(Text a, Text b) {
        Assert.assertEquals(a, b);
    }

    public static void blogPostTestCondition(List<BlogPost> a, List<BlogPost> b) {
        Assert.assertEquals(a, b);
    }

    public static void eventTestCondition(List<Event> a, List<Event> b) {
        for (Event e : a) {
            DaoEventObjectifyTest.authorTestCondition(e.getAuthor(), b.get(a.indexOf(e)).getAuthor());
        }
    }

    public static void invitationTestCondition(List<Invitation> a, List<Invitation> b) {
        for (Invitation i : a) {
            DaoInvitationObjectifyTest.idTestCondition(i.getId(), b.get(a.indexOf(i)).getId());
            DaoInvitationObjectifyTest.invitedByUserTestCondition(i.getInvitedByUser(), b.get(a.indexOf(i))
                    .getInvitedByUser());
            DaoInvitationObjectifyTest.registeredUserTestCondition(i.getRegisteredUser(), b.get(a.indexOf(i))
                    .getRegisteredUser());
        }
    }

    public static void usersTestCondition(List<User> a, List<User> b) {
        for (User u : a) {
            DaoUserObjectifyTest.idTestCondition(u.getId(), b.get(a.indexOf(u)).getId());
            DaoUserObjectifyTest.firstNameTestCondition(u.getFirstname(), b.get(a.indexOf(u)).getFirstname());
            DaoUserObjectifyTest.surNameTestCondition(u.getSurname(), b.get(a.indexOf(u)).getSurname());
            DaoUserObjectifyTest.emailTestCondition(u.getEmail(), b.get(a.indexOf(u)).getEmail());
            DaoUserObjectifyTest.roleTestCondition(u.getRole(), b.get(a.indexOf(u)).getRole());
            DaoUserObjectifyTest.passwordTestCondition(u.getPassword(), b.get(a.indexOf(u)).getPassword());
            DaoUserObjectifyTest.rankTestCondition(u.getRank(), b.get(a.indexOf(u)).getRank());
            DaoUserObjectifyTest.photoTestCondition(u.getPhoto(), b.get(a.indexOf(u)).getPhoto());
            DaoUserObjectifyTest.visibleNameTestCondition(u.getVisibleName(), b.get(a.indexOf(u)).getVisibleName());
        }
    }

    public static void tweetTestCondition(List<Tweet> a, List<Tweet> b) {
        for (Tweet t : a) {
            DaoTweetObjectifyTest.idTestCondition(t.getId(), b.get(a.indexOf(t)).getId());
            DaoTweetObjectifyTest.dateTimeTestCondition(t.getDateTime(), b.get(a.indexOf(t)).getDateTime());
            DaoTweetObjectifyTest.titleTestCondition(t.getTitle(), b.get(a.indexOf(t)).getTitle());
            DaoTweetObjectifyTest.descriptionTestCondition(t.getDescription(), b.get(a.indexOf(t)).getDescription());
            DaoTweetObjectifyTest.linkTestCondition(t.getLink(), b.get(a.indexOf(t)).getLink());
        }
    }
}

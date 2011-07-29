/**
 * DaoUserGroupObjectifyTest.java, 25.7.2011 18:57:46 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.model.BlogPost;
import ugportal.model.Event;
import ugportal.model.Invitation;
import ugportal.model.Setting;
import ugportal.model.Tweet;
import ugportal.model.User;
import ugportal.model.UserGroup;

import com.google.appengine.api.datastore.Text;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

/**
 * @author Tomas Vantuch
 */
public class DaoUserGroupObjectifyTest {

    private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());
    private final DaoUserGroupObjectify dugo = (DaoUserGroupObjectify) DaoFactoryObjectify.getInstance()
            .getDaoUserGroup();

    @Before
    public void setUp() throws Exception {
        helper.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        helper.tearDown();
    }

    @Test
    public void testGet() {
        UserGroup userGroup = new UserGroup();
        userGroup.setName("Java-Ostrava");
        userGroup.setAbout(new Text("about java"));
        userGroup.setSetting(new Setting());
        userGroup.setBlogposts(new ArrayList<BlogPost>());
        userGroup.setEvents(new ArrayList<Event>());
        userGroup.setInvitations(new ArrayList<Invitation>());
        userGroup.setTweets(new ArrayList<Tweet>());
        userGroup.setUsers(new ArrayList<User>());

        this.dugo.put(userGroup);

        UserGroup userGroup2 = this.dugo.get(userGroup.getId());

    }

    public void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public void nameTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public void settingTestCondition(Setting a, Setting b) {
        Assert.assertEquals(a, b);
    }

    public void aboutTestCondition(Text a, Text b) {
        Assert.assertEquals(a, b);
    }

    public void blogPostTestCondition(List<BlogPost> a, List<BlogPost> b) {
        Assert.assertEquals(a, b);
    }

    public void eventTestCondition(List<Event> a, List<Event> b) {
        Assert.assertArrayEquals(a.toArray(), b.toArray());
    }

    public void invitationTestCondition(List<Invitation> a, List<Invitation> b) {
        Assert.assertArrayEquals(a.toArray(), b.toArray());
    }

    public void usersTestCondition(List<User> a, List<User> b) {
        Assert.assertArrayEquals(a.toArray(), b.toArray());
    }

    public void tweetTestCondition(List<Tweet> a, List<Tweet> b) {
        Assert.assertArrayEquals(a.toArray(), b.toArray());
    }
}

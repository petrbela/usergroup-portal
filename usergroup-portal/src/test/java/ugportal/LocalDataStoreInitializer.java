/**
 * LocalDataStoreInitializer.java, 1.8.2011 10:06:48 
 */
package ugportal;

import ugportal.model.Blog;
import ugportal.model.BlogPost;
import ugportal.model.Event;
import ugportal.model.EventType;
import ugportal.model.Invitation;
import ugportal.model.InvitationState;
import ugportal.model.Rank;
import ugportal.model.Role;
import ugportal.model.Setting;
import ugportal.model.SourceMaterial;
import ugportal.model.Tweet;
import ugportal.model.User;
import ugportal.model.UserGroup;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.googlecode.objectify.ObjectifyService;

/**
 * @author Tomas Vantuch
 */
public class LocalDataStoreInitializer {

    private final static LocalServiceTestHelper helper = new LocalServiceTestHelper(
            new LocalDatastoreServiceTestConfig());

    static {
        ObjectifyService.register(UserGroup.class);
        ObjectifyService.register(User.class);
        ObjectifyService.register(Rank.class);
        ObjectifyService.register(Tweet.class);
        ObjectifyService.register(Setting.class);
        ObjectifyService.register(BlogPost.class);
        ObjectifyService.register(SourceMaterial.class);
        ObjectifyService.register(Event.class);
        ObjectifyService.register(EventType.class);
        ObjectifyService.register(Invitation.class);
        ObjectifyService.register(Blog.class);
        ObjectifyService.register(Role.class);
        ObjectifyService.register(InvitationState.class);
    }

    public static void setUp() {
        helper.setUp();
    }

    public static void tearDown() {
        helper.tearDown();
    }
}

/**
 * ContextInitializer.java, 13.7.2011 8:55:24 
 */
package ugportal;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

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

import com.googlecode.objectify.ObjectifyService;

/**
 * @author Ondrej Kvasnovsky
 */
public class ContextInitializer implements ServletContextListener {

    /**
     * {@inheritDoc}
     * 
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

    }

    /**
     * {@inheritDoc}
     * 
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
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

}

/**
 * ContextInitializer.java, 13.7.2011 8:55:24 
 */
package ugportal;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import ugportal.model.User;

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
        ObjectifyService.register(User.class);
        // TODO:
    }

}

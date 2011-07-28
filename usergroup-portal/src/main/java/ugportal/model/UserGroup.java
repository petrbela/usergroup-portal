package ugportal.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import com.google.appengine.api.datastore.Text;

/**
 * @{link UserGroup} the usergroup class represents the user group and
 * 
 * @author Tomas Vantuch
 * 
 */
public class UserGroup implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 7345000550438905459L;

    /**
     * name of user group
     */
    private String name;
    /**
     * id of user group
     */
    @Id
    private Long id;
    /**
     * description of user group
     */
    private Text about;
    /**
     * collection of user's tweets
     */
    private List<Tweet> tweets;
    /**
     * collection of user's blogposts
     */
    private List<BlogPost> blogposts;
    /**
     * settings of user group
     */
    private Setting setting;
    /**
     * collection of invitations
     */
    private List<Invitation> invitations;
    /**
     * collection of users
     */
    private List<User> users;
    /**
     * collection of events
     */
    private List<Event> events;

    /**
     * Returns the name
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     * 
     * @param name
     *            to set name of user group
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Returns id
     * 
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Returns about
     * 
     * @return about
     */
    public Text getAbout() {
        return about;
    }

    /**
     * Sets about
     * 
     * @param about
     *            to set what is it about.
     */
    public void setAbout(final Text about) {
        this.about = about;
    }

    /**
     * Returns the tweets
     * 
     * @return the tweets
     */
    public List<Tweet> getTweets() {
        return tweets;
    }

    /**
     * Sets the tweest
     * 
     * @param the
     *            tweets
     */
    public void setTweets(final List<Tweet> tweets) {
        this.tweets = tweets;
    }

    /**
     * Return the blogposts
     * 
     * return the blogposts
     */
    public List<BlogPost> getBlogposts() {
        return blogposts;
    }

    /**
     * Sets the BlogPosts
     * 
     * @param blogposts
     *            the blogposts to set
     */
    public void setBlogposts(final List<BlogPost> blogposts) {
        this.blogposts = blogposts;
    }

    /**
     * Returns the setting
     * 
     * @return the setting
     */
    public Setting getSetting() {
        return setting;
    }

    /**
     * Sets the setting
     * 
     * @param setting
     *            the setting to set
     */
    public void setSetting(final Setting setting) {
        this.setting = setting;
    }

    /**
     * Returns the invitations
     * 
     * @return the invitation
     */
    public List<Invitation> getInvitations() {
        return invitations;
    }

    /**
     * Sets the invitations
     * 
     * @param invitations
     *            to setting the invitations
     */
    public void setInvitations(final List<Invitation> invitations) {
        this.invitations = invitations;
    }

    /**
     * Returns the users
     * 
     * @return the users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Sets the users
     * 
     * @param users
     *            to set the users
     */
    public void setUsers(final List<User> users) {
        this.users = users;
    }

    /**
     * Returns the events
     * 
     * @return the events
     */
    public List<Event> getEvents() {
        return events;
    }

    /**
     * Sets the events
     * 
     * @param events
     *            to set the events
     */
    public void setEvents(final List<Event> events) {
        this.events = events;
    }

}

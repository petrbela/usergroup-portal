package ugportal.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import ugportal.dao.DaoFactory;
import ugportal.dao.objectify.DaoBlogPostObjectify;
import ugportal.dao.objectify.DaoEventObjectify;
import ugportal.dao.objectify.DaoInvitationObjectify;
import ugportal.dao.objectify.DaoSettingObjectify;
import ugportal.dao.objectify.DaoTweetObjectify;
import ugportal.dao.objectify.DaoUserObjectify;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Parent;

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
    private final DaoSettingObjectify daoSettingObjectify = (DaoSettingObjectify) DaoFactory.getInstance()
            .getDaoSetting();
    private final DaoTweetObjectify daoTweetObjectify = (DaoTweetObjectify) DaoFactory.getInstance().getDaoTweet();
    private final DaoBlogPostObjectify blogPostObjectify = (DaoBlogPostObjectify) DaoFactory.getInstance()
            .getDaoBlogPost();

    private final DaoInvitationObjectify daoInvitationObjectify = (DaoInvitationObjectify) DaoFactory.getInstance()
            .getDaoInvitation();
    private final DaoEventObjectify daoEventObjectify = (DaoEventObjectify) DaoFactory.getInstance().getDaoEvent();
    private final DaoUserObjectify daoUserObjectify = (DaoUserObjectify) DaoFactory.getInstance().getDaoUser();

    /**
     * name of user group
     */
    private String name;
    /**
     * id of user group
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * description of user group
     */
    private Text about;
    /**
     * collection of user's tweets
     */
    private List<Key<Tweet>> tweets = new ArrayList<Key<Tweet>>();
    /**
     * collection of user's blogposts
     */
    private List<Key<BlogPost>> blogposts = new ArrayList<Key<BlogPost>>();
    /**
     * settings of user group
     */
    @Parent
    private Key<Setting> setting;
    /**
     * collection of invitations
     */
    private List<Key<Invitation>> invitations = new ArrayList<Key<Invitation>>();
    /**
     * collection of users
     */
    private List<Key<User>> users = new ArrayList<Key<User>>();
    /**
     * collection of events
     */
    private List<Key<Event>> events = new ArrayList<Key<Event>>();

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
     * Sets the id.
     * 
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * Sets the tweest
     * 
     * @param the
     *            tweets
     */
    public void setTweets(final List<Tweet> tweets) {
        for (Tweet t : tweets) {
            this.tweets.add(this.daoTweetObjectify.put(t));
        }
    }

    public void addTweet(Tweet tweet) {
        this.tweets.add(this.daoTweetObjectify.put(tweet));
    }

    public Tweet getTweetAt(int index) {
        return this.daoTweetObjectify.get(this.tweets.get(index));
    }

    /**
     * Returns the tweets
     * 
     * @return the tweets
     */
    public List<Tweet> getTweets() {
        List<Tweet> list = new ArrayList<Tweet>();
        for (Key<Tweet> k : this.tweets) {
            list.add(this.daoTweetObjectify.get(k));
        }
        return list;
    }

    /**
     * Return the blogposts
     * 
     * return the blogposts
     */
    public List<BlogPost> getBlogposts() {
        return new ArrayList<BlogPost>(this.blogPostObjectify.getAllByKey(this.blogposts));
    }

    /**
     * Sets the BlogPosts
     * 
     * @param blogposts
     *            the blogposts to set
     */
    public void setBlogposts(final List<BlogPost> blogposts) {
        this.blogposts = new ArrayList<Key<BlogPost>>(this.blogPostObjectify.putAll(blogposts));
    }

    /**
     * Returns the setting
     * 
     * @return the setting
     */
    public Setting getSetting() {
        return this.daoSettingObjectify.get(setting);
    }

    /**
     * Sets the setting
     * 
     * @param setting
     *            the setting to set
     */
    public void setSetting(Setting setting) {

        this.setting = this.daoSettingObjectify.put(setting);
    }

    /**
     * Returns the invitations
     * 
     * @return the invitation
     */
    public List<Invitation> getInvitations() {
        return this.daoInvitationObjectify.getAllByKeys(this.invitations);
    }

    /**
     * Sets the invitations
     * 
     * @param invitations
     *            to setting the invitations
     */
    public void setInvitations(final List<Invitation> invitations) {
        this.invitations = this.daoInvitationObjectify.putAll(invitations);
    }

    /**
     * Returns the users
     * 
     * @return the users
     */
    public List<User> getUsers() {
        return this.daoUserObjectify.getAllByKeys(this.users);
    }

    /**
     * Sets the users
     * 
     * @param users
     *            to set the users
     */
    public void setUsers(final List<User> users) {
        this.users = this.daoUserObjectify.putAll(users);
    }

    /**
     * Returns the events
     * 
     * @return the events
     */
    public List<Event> getEvents() {
        return this.daoEventObjectify.getAllByKeys(this.events);
    }

    /**
     * Sets the events
     * 
     * @param events
     *            to set the events
     */
    public void setEvents(final List<Event> events) {
        this.events = this.daoEventObjectify.putAll(events);
    }

    public void addEvent(Event event) {
        this.events.add(this.daoEventObjectify.put(event));
    }

    public void addInvitation(Invitation invitation) {
        this.invitations.add(this.daoInvitationObjectify.put(invitation));
    }

    /**
     * @param user
     */
    public void addUser(User user) {
        this.users.add(this.daoUserObjectify.put(user));
    }

    /**
     * @param blogPost
     */
    public void addBlogPost(BlogPost blogPost) {
        this.blogposts.add(this.blogPostObjectify.put(blogPost));
    }
}

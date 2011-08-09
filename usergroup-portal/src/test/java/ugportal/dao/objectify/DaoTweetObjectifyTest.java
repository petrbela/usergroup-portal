/**
 * DaoTweetObjectifyTest.java, 31.7.2011 18:43:17 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.Tweet;

import com.google.appengine.api.datastore.Link;
import com.googlecode.objectify.Key;

/**
 * @author Tomas Vantuch
 */
public class DaoTweetObjectifyTest {

    private final DaoTweetObjectify daoTweetObjectify = (DaoTweetObjectify) DaoFactory.getInstance().getDaoTweet();

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
        Tweet tweet = getOneTweet();

        Key<Tweet> key = this.daoTweetObjectify.put(tweet);

        Tweet tweet2 = this.daoTweetObjectify.get(key);

        idTestCondition(tweet.getId(), tweet2.getId());
        titleTestCondition(tweet.getTitle(), tweet2.getTitle());
        descriptionTestCondition(tweet.getDescription(), tweet2.getDescription());
        linkTestCondition(tweet.getLink(), tweet2.getLink());
        dateTimeTestCondition(tweet.getDateTime(), tweet2.getDateTime());

        this.daoTweetObjectify.delete(tweet);
    }

    @Test
    public void testPut() {
        Tweet tweet = getOneTweet();

        Key<Tweet> key = this.daoTweetObjectify.put(tweet);

        Tweet tweet2 = this.daoTweetObjectify.get(key);

        idTestCondition(tweet.getId(), tweet2.getId());
        titleTestCondition(tweet.getTitle(), tweet2.getTitle());
        descriptionTestCondition(tweet.getDescription(), tweet2.getDescription());
        linkTestCondition(tweet.getLink(), tweet2.getLink());
        dateTimeTestCondition(tweet.getDateTime(), tweet2.getDateTime());

        this.daoTweetObjectify.delete(tweet);
    }

    @Test
    public void testGetById() {
        Tweet tweet = getOneTweet();

        this.daoTweetObjectify.put(tweet);

        Tweet tweet2 = this.daoTweetObjectify.getById(tweet.getId());

        idTestCondition(tweet.getId(), tweet2.getId());
        titleTestCondition(tweet.getTitle(), tweet2.getTitle());
        descriptionTestCondition(tweet.getDescription(), tweet2.getDescription());
        linkTestCondition(tweet.getLink(), tweet2.getLink());
        dateTimeTestCondition(tweet.getDateTime(), tweet2.getDateTime());

        this.daoTweetObjectify.delete(tweet);
    }

    @Test
    public void testGetByDateTime() {
        Tweet tweet = getOneTweet();

        this.daoTweetObjectify.put(tweet);

        Tweet tweet2 = this.daoTweetObjectify.getByDate(tweet.getDateTime()).get(0);

        idTestCondition(tweet.getId(), tweet2.getId());
        titleTestCondition(tweet.getTitle(), tweet2.getTitle());
        descriptionTestCondition(tweet.getDescription(), tweet2.getDescription());
        linkTestCondition(tweet.getLink(), tweet2.getLink());
        dateTimeTestCondition(tweet.getDateTime(), tweet2.getDateTime());

        this.daoTweetObjectify.delete(tweet);
    }

    @Test
    public void testDelete() {
        Tweet tweet = getOneTweet();

        this.daoTweetObjectify.put(tweet);

        Tweet tweet2 = this.daoTweetObjectify.getById(tweet.getId());
        Assert.assertNotNull(tweet2);

        this.daoTweetObjectify.delete(tweet);
        tweet2 = this.daoTweetObjectify.getById(tweet.getId());
        Assert.assertNull(tweet2);
    }

    @Test
    public void testPutAll() {

        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(getOneTweet());
        tweets.add(getOneTweet());
        tweets.add(getOneTweet());

        List<Key<Tweet>> keys = this.daoTweetObjectify.putAll(tweets);

        List<Tweet> tweets2 = this.daoTweetObjectify.getAllByKeys(keys);

        for (Tweet tweet : tweets) {
            Tweet tweet2 = tweets2.get(tweets.indexOf(tweet));

            idTestCondition(tweet.getId(), tweet2.getId());
            titleTestCondition(tweet.getTitle(), tweet2.getTitle());
            descriptionTestCondition(tweet.getDescription(), tweet2.getDescription());
            linkTestCondition(tweet.getLink(), tweet2.getLink());
            dateTimeTestCondition(tweet.getDateTime(), tweet2.getDateTime());

            this.daoTweetObjectify.delete(tweet);
        }
    }

    @Test
    public void testGetAllByKey() {

        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(getOneTweet());
        tweets.add(getOneTweet());
        tweets.add(getOneTweet());

        List<Key<Tweet>> keys = this.daoTweetObjectify.putAll(tweets);

        List<Tweet> tweets2 = this.daoTweetObjectify.getAllByKeys(keys);

        for (Tweet tweet : tweets) {
            Tweet tweet2 = tweets2.get(tweets.indexOf(tweet));

            idTestCondition(tweet.getId(), tweet2.getId());
            titleTestCondition(tweet.getTitle(), tweet2.getTitle());
            descriptionTestCondition(tweet.getDescription(), tweet2.getDescription());
            linkTestCondition(tweet.getLink(), tweet2.getLink());
            dateTimeTestCondition(tweet.getDateTime(), tweet2.getDateTime());

            this.daoTweetObjectify.delete(tweet);
        }
    }

    public static Tweet getOneTweet() {
        Tweet tweet = new Tweet();
        tweet.setDateTime(new Date());
        tweet.setDescription("description");
        tweet.setLink(new Link("www.google.com"));
        tweet.setTitle("title");
        return tweet;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void titleTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void dateTimeTestCondition(Date a, Date b) {
        Assert.assertEquals(a, b);
    }

    public static void descriptionTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void linkTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

}

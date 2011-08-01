/**
 * DaoTweetObjectify.java, 28.7.2011 16:07:45 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ugportal.dao.DaoTweet;
import ugportal.model.Tweet;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoTweetObjectify extends DAOBase implements DaoTweet {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoTweet#getById(java.lang.Long)
     */
    @Override
    public Tweet getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoTweet#getByDate(java.util.Date)
     */
    @Override
    public List<Tweet> getByDate(Date date) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoTweet#put(ugportal.model.Tweet)
     */
    @Override
    public Key<Tweet> put(Tweet tweet) {
        return ofy().put(tweet);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoTweet#delete(ugportal.model.Tweet)
     */
    @Override
    public void delete(Tweet Tweet) {
        // TODO Auto-generated method stub

    }

    /**
     * @param key
     * @return
     */
    public Tweet get(Key<Tweet> key) {
        return ofy().find(key);
    }

    /**
     * @param tweets
     * @return
     */
    public List<Key<Tweet>> putAll(List<Tweet> tweets) {
        return new ArrayList<Key<Tweet>>(ofy().put(tweets).keySet());
    }

    /**
     * @param tweets
     * @return
     */
    public List<Tweet> getAllByKeys(List<Key<Tweet>> tweets) {
        return new ArrayList<Tweet>(ofy().get(tweets).values());
    }

}

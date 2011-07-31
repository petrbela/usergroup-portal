/**
 * DaoTweet.java, 28.7.2011 15:55:39 
 */
package ugportal.dao;

import java.util.Date;
import java.util.List;

import ugportal.model.Tweet;

import com.googlecode.objectify.Key;

/**
 * Dao object for {@link Tweet}
 * 
 * @author Tomas Vantuch
 */
public interface DaoTweet {
    /**
     * Returns {@link Tweet} by it's id.
     * 
     * @param id
     *            id of Tweet
     * @return fetched Tweet or null
     */

    Tweet getById(Long id);

    /**
     * Returns collection of {@link Tweet} by date
     * 
     * @param date
     *            date of Tweet
     * 
     * @return fetched collection of Tweets or empty collection
     */

    List<Tweet> getByDate(Date date);

    /**
     * Saves or updates {@link Tweet}
     * 
     * @param Tweet
     *            {@link Tweet} to save or update
     */
    Key<Tweet> put(Tweet Tweet);

    /**
     * Deletes {@link Tweet}
     * 
     * @param Tweet
     *            {@link Tweet} to delete
     */
    void delete(Tweet Tweet);

}

/**
 * DaoTweet.java, 28.7.2011 15:55:39 
 */
package ugportal.dao;

import java.util.Date;
import java.util.List;

import ugportal.model.Tweet;

/**
 * Dao object for {@link Tweet}
 * 
 * @author Tomas Vantuch
 */
public interface DaoTweet {
    /**
     * Returns {@link DaoTweet} by it's id.
     * 
     * @param id
     *            id of daoTweet
     * @return fetched daoTweet or null
     */

    DaoTweet getById(Long id);

    /**
     * Returns collection of {@link DaoTweet} by date
     * 
     * @param date
     *            date of daoTweet
     * 
     * @return fetched collection of daoTweets or empty collection
     */

    List<DaoTweet> getByDate(Date date);

    /**
     * Saves or updates {@link DaoTweet}
     * 
     * @param daoTweet
     *            {@link DaoTweet} to save or update
     */
    void put(DaoTweet daoTweet);

    /**
     * Deletes {@link DaoTweet}
     * 
     * @param daoTweet
     *            {@link DaoTweet} to delete
     */
    void delete(DaoTweet daoTweet);

}

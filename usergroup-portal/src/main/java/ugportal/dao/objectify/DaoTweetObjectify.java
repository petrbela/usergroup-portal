/**
 * DaoTweetObjectify.java, 28.7.2011 16:07:45 
 */
package ugportal.dao.objectify;

import java.util.Date;
import java.util.List;

import ugportal.dao.DaoTweet;

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
    public DaoTweet getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoTweet#getByDate(java.util.Date)
     */
    @Override
    public List<DaoTweet> getByDate(Date date) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoTweet#put(ugportal.dao.DaoTweet)
     */
    @Override
    public void put(DaoTweet daoTweet) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoTweet#delete(ugportal.dao.DaoTweet)
     */
    @Override
    public void delete(DaoTweet daoTweet) {
        // TODO Auto-generated method stub

    }

}

/**
 * DaoRankObjectify.java, 28.7.2011 16:05:51 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoRank;
import ugportal.model.Rank;

import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoRankObjectify extends DAOBase implements DaoRank {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRank#getById(java.lang.Long)
     */
    @Override
    public Rank getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRank#getByLabel(java.lang.String)
     */
    @Override
    public Rank getByLabel(String label) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRank#put(ugportal.model.Rank)
     */
    @Override
    public void put(Rank rank) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRank#delete(ugportal.model.Rank)
     */
    @Override
    public void delete(Rank rank) {
        // TODO Auto-generated method stub

    }

}

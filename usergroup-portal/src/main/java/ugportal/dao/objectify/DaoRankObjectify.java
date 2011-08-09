/**
 * DaoRankObjectify.java, 28.7.2011 16:05:51 
 */
package ugportal.dao.objectify;

import java.util.List;

import ugportal.dao.DaoRank;
import ugportal.model.Rank;

import com.googlecode.objectify.Key;
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
        return ofy().find(Rank.class, id);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRank#getByLabel(java.lang.String)
     */
    @Override
    public List<Rank> getByLabel(String label) {
        return ofy().query(Rank.class).filter("label =", label).list();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRank#put(ugportal.model.Rank)
     */
    @Override
    public Key<Rank> put(Rank rank) {
        return ofy().put(rank);

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRank#delete(ugportal.model.Rank)
     */
    @Override
    public void delete(Rank rank) {
        ofy().delete(rank);
    }

    /**
     * @param rank
     * @return
     */
    public Rank get(Key<Rank> rank) {
        return ofy().find(rank);
    }

}

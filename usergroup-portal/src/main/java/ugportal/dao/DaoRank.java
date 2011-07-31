/**
 * DaoRank.java, 28.7.2011 15:55:16 
 */
package ugportal.dao;

import ugportal.model.Rank;

import com.googlecode.objectify.Key;

/**
 * Dao object for {@link Rank}
 * 
 * @author Tomas Vantuch
 */
public interface DaoRank {
    /**
     * Returns {@link Rank} by it's id.
     * 
     * @param id
     *            id of Rank
     * 
     * @return fetched Rank or null.
     */
    Rank getById(Long id);

    /**
     * Returns {@link Rank} by it's label.
     * 
     * @param label
     *            label of Rank
     * 
     */
    Rank getByLabel(String label);

    /**
     * Saves or updates {@link Rank}
     * 
     * @param Rank
     *            Rank to save or update
     */
    Key<Rank> put(Rank rank);

    /**
     * Deletes {@link Rank}
     * 
     * @param Rank
     *            Rank to delete
     */
    void delete(Rank rank);
}

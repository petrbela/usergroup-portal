/**
 * DaoSourceMaterial.java, 28.7.2011 15:55:34 
 */
package ugportal.dao;

import java.util.List;

import ugportal.model.SourceMaterial;

import com.googlecode.objectify.Key;

/**
 * Dao object for {@link SourceMaterial}
 * 
 * @author Tomas Vantuch
 */
public interface DaoSourceMaterial {
    /**
     * Returns {@link SourceMaterial} by it's id.
     * 
     * @param id
     *            id of SourceMaterial
     * 
     * @return fetched SourceMaterial or null.
     */

    public SourceMaterial getById(Long id);

    /**
     * Saves or updates {@link SourceMaterial}
     * 
     * @param sourceMaterial
     *            sourceMaterial to save or update
     */
    Key<SourceMaterial> put(SourceMaterial sourceMaterial);

    /**
     * Deletes {@link SourceMaterial}
     * 
     * @param sourceMaterial
     *            sourceMaterial to delete
     */
    void delete(SourceMaterial sourceMaterial);

    /**
     * Returns collection of {@link SourceMaterial} by it's keys
     * 
     * @param sourceMaterials
     *            keys of sourcematerials
     * @return fetched collection of sourceMaterials or empty collection
     */
    List<SourceMaterial> getByAllKeys(List<Key<SourceMaterial>> sourceMaterials);

    /**
     * Puts collecion of {@link SourceMaterial}
     * 
     * @param sourceMaterials
     *            {@link SourceMaterial} to put
     * @return collection of keys
     */
    List<Key<SourceMaterial>> putAll(List<SourceMaterial> sourceMaterials);

}

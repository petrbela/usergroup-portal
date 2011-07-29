/**
 * DaoSourceMaterial.java, 28.7.2011 15:55:34 
 */
package ugportal.dao;

import ugportal.model.SourceMaterial;

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
    void put(SourceMaterial sourceMaterial);

    /**
     * Deletes {@link SourceMaterial}
     * 
     * @param sourceMaterial
     *            sourceMaterial to delete
     */
    void delete(SourceMaterial sourceMaterial);

}

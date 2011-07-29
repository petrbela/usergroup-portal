/**
 * DaoSourceMaterialObjecitfy.java, 28.7.2011 16:07:19 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoSourceMaterial;
import ugportal.model.SourceMaterial;

import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoSourceMaterialObjecitfy extends DAOBase implements DaoSourceMaterial {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoSourceMaterial#getById(java.lang.Long)
     */
    @Override
    public SourceMaterial getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoSourceMaterial#put(ugportal.model.SourceMaterial)
     */
    @Override
    public void put(SourceMaterial sourceMaterial) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoSourceMaterial#delete(ugportal.model.SourceMaterial)
     */
    @Override
    public void delete(SourceMaterial sourceMaterial) {
        // TODO Auto-generated method stub

    }

}

/**
 * DaoRoleObjectify.java, 28.7.2011 16:06:24 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoRole;
import ugportal.model.Role;

import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoRoleObjectify extends DAOBase implements DaoRole {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRole#getById(java.lang.Long)
     */
    @Override
    public Role getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRole#getByLabel(java.lang.String)
     */
    @Override
    public Role getByLabel(String label) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRole#put(ugportal.model.Role)
     */
    @Override
    public void put(Role role) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRole#delete(ugportal.model.Role)
     */
    @Override
    public void delete(Role role) {
        // TODO Auto-generated method stub

    }

}

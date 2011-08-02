/**
 * DaoRoleObjectify.java, 28.7.2011 16:06:24 
 */
package ugportal.dao.objectify;

import java.util.List;

import ugportal.dao.DaoRole;
import ugportal.model.Role;

import com.googlecode.objectify.Key;
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
        return ofy().find(Role.class, id);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRole#getByLabel(java.lang.String)
     */
    @Override
    public List<Role> getByLabel(String label) {
        return ofy().query(Role.class).filter("label =", label).list();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRole#put(ugportal.model.Role)
     */
    @Override
    public Key<Role> put(Role role) {
        return ofy().put(role);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoRole#delete(ugportal.model.Role)
     */
    @Override
    public void delete(Role role) {
        ofy().delete(role);
    }

}

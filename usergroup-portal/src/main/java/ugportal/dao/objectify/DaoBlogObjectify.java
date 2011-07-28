/**
 * DaoBlogObjectify.java, 28.7.2011 15:57:04 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoBlog;
import ugportal.model.Blog;

import com.google.appengine.api.datastore.Email;

/**
 * @author Tomas
 */
public class DaoBlogObjectify extends DaoFactoryObjectify implements DaoBlog {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#getByBlogId(java.lang.Long)
     */
    @Override
    public Blog getByBlogId(Long blogId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#getByEmail(com.google.appengine.api.datastore.Email)
     */
    @Override
    public Blog getByEmail(Email blogEmail) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#save(ugportal.model.Blog)
     */
    @Override
    public void save(Blog blog) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#delete(ugportal.model.Blog)
     */
    @Override
    public void delete(Blog blog) {
        // TODO Auto-generated method stub

    }

}

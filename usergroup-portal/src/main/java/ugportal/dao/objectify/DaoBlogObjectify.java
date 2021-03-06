/**
 * DaoBlogObjectify.java, 28.7.2011 15:57:04 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoBlog;
import ugportal.model.Blog;

import com.google.appengine.api.datastore.Email;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoBlogObjectify extends DAOBase implements DaoBlog {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#getByBlogId(java.lang.Long)
     */
    @Override
    public Blog getByBlogId(String blogId) {
        return ofy().query(Blog.class).filter("blogId =", blogId).list().get(0);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#getByEmail(com.google.appengine.api.datastore.Email)
     */
    @Override
    public Blog getByEmail(Email blogEmail) {
        return ofy().query(Blog.class).filter("email =", blogEmail).list().get(0);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#save(ugportal.model.Blog)
     */
    @Override
    public Key<Blog> put(Blog blog) {
        return ofy().put(blog);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#delete(ugportal.model.Blog)
     */
    @Override
    public void delete(Blog blog) {
        ofy().delete(blog);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#getByKey(com.googlecode.objectify.Key)
     */
    @Override
    public Blog getByKey(Key<Blog> key) {
        return ofy().find(key);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlog#getById(java.lang.Long)
     */
    @Override
    public Blog getById(Long id) {
        return ofy().find(Blog.class, id);
    }
}

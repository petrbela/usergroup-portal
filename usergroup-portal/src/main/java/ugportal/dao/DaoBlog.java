/**
 * DaoBlog.java, 28.7.2011 15:54:38 
 */
package ugportal.dao;

import ugportal.model.Blog;

import com.google.appengine.api.datastore.Email;

/**
 * @author Tomas Vantuch
 */
public interface DaoBlog {
    /**
     * Returns {@link Blog} by it's id.
     * 
     * @param id
     *            blog id
     * @return fetched blog, or null
     */
    Blog getByBlogId(Long blogId);

    /**
     * Returns {@link Blog} by it's email.
     * 
     * @param blogEmail
     *            blog email
     * @return fetched blog, or null
     */
    Blog getByEmail(Email blogEmail);

    /**
     * saves or updates {@link Blog}
     * 
     * @param blog
     *            blog to save or update
     */
    void save(Blog blog);

    /**
     * deletes {@link Blog}
     * 
     * @param blog
     *            blog to delete
     */
    void delete(Blog blog);

}

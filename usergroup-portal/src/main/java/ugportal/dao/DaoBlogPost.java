/**
 * DaoBlogPost.java, 28.7.2011 15:54:48 
 */
package ugportal.dao;

import java.util.Date;

import ugportal.model.BlogPost;

import com.googlecode.objectify.Key;

/**
 * Dao object for {@link BlogPost}
 * 
 * @author Tomas Vantuch
 */
public interface DaoBlogPost {
    /**
     * Returns {@link BlogPost} by it's id.
     * 
     * @param id
     *            blogPosts id
     * @return fetched BlogPost, or null
     */

    BlogPost getById(Long id);

    /**
     * Returns {@link BlogPost} by it's datas.
     * 
     * @param datetime
     *            {@link BlogPost} dateTime
     * @param title
     *            {@link BlogPost} title
     * @param autor
     *            {@link BlogPost} autor
     * @return fetched {@link BlogPost}, or null
     */
    BlogPost getBySearchDatas(Date datetime, String title, String autor);

    /**
     * Saves or updates {@link BlogPost}
     * 
     * @param blogPost
     *            blogpost to save or update
     */
    Key<BlogPost> put(BlogPost blogPost);

    /**
     * Deletes {@link BlogPost}
     * 
     * @param blogPost
     *            blogpost to delete
     */
    void delete(BlogPost blogPost);

}

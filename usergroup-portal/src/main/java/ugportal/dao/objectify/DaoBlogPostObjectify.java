/**
 * DaoBlogPostObjectify.java, 28.7.2011 16:03:05 
 */
package ugportal.dao.objectify;

import java.util.Date;

import ugportal.dao.DaoBlogPost;
import ugportal.model.BlogPost;

import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoBlogPostObjectify extends DAOBase implements DaoBlogPost {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlogPost#getById(java.lang.Long)
     */
    @Override
    public BlogPost getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlogPost#getBySearchDatas(java.util.Date,
     *      java.lang.String, java.lang.String)
     */
    @Override
    public BlogPost getBySearchDatas(Date datetime, String title, String autor) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlogPost#put(ugportal.model.BlogPost)
     */
    @Override
    public void put(BlogPost blogPost) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoBlogPost#delete(ugportal.model.BlogPost)
     */
    @Override
    public void delete(BlogPost blogPost) {
        // TODO Auto-generated method stub

    }

}

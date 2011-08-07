/**
 * DaoBlogPostObjectifyTest.java, 31.7.2011 12:38:50 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.BlogPost;

import com.google.appengine.api.datastore.Link;
import com.googlecode.objectify.Key;

/**
 * @author Tomas
 */
public class DaoBlogPostObjectifyTest {

    private final DaoBlogPostObjectify blogPostObjectify = (DaoBlogPostObjectify) DaoFactory.getInstance()
            .getDaoBlogPost();

    @Before
    public void setUp() throws Exception {
        LocalDataStoreInitializer.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        LocalDataStoreInitializer.tearDown();
    }

    @Test
    public void testGetById() {

        BlogPost blogPost = getOneBlogPost();

        this.blogPostObjectify.put(blogPost);

        BlogPost blogPost2 = this.blogPostObjectify.getById(blogPost.getId());

        idTestCondition(blogPost.getId(), blogPost2.getId());
        dateTestCondition(blogPost.getDateTime(), blogPost2.getDateTime());
        titleTestCondition(blogPost.getTitle(), blogPost2.getTitle());
        descriptionTestCondition(blogPost.getDescription(), blogPost2.getDescription());
        authorLinkTestCondition(blogPost.getAuthorLink(), blogPost2.getAuthorLink());
        linkTestCondition(blogPost.getLink(), blogPost2.getLink());
        authorTestCondition(blogPost.getAuthor(), blogPost2.getAuthor());

    }

    @Test
    public void testDelete() {
        BlogPost blogPost = getOneBlogPost();

        this.blogPostObjectify.put(blogPost);

        BlogPost blogPost2 = this.blogPostObjectify.getById(blogPost.getId());

        this.blogPostObjectify.delete(blogPost);

        blogPost2 = this.blogPostObjectify.getById(blogPost.getId());

        Assert.assertNull(blogPost2);
    }

    @Test
    public void testPutAll() {
        List<BlogPost> blogPosts = new ArrayList<BlogPost>();
        blogPosts.add(getOneBlogPost());
        blogPosts.add(getOneBlogPost());
        blogPosts.add(getOneBlogPost());

        List<Key<BlogPost>> keys = this.blogPostObjectify.putAll(blogPosts);

        List<BlogPost> blogPosts2 = this.blogPostObjectify.getAllByKey(keys);

        for (BlogPost blogPost : blogPosts) {
            BlogPost blogPost2 = blogPosts2.get(blogPosts.indexOf(blogPost));

            idTestCondition(blogPost.getId(), blogPost2.getId());
            dateTestCondition(blogPost.getDateTime(), blogPost2.getDateTime());
            titleTestCondition(blogPost.getTitle(), blogPost2.getTitle());
            descriptionTestCondition(blogPost.getDescription(), blogPost2.getDescription());
            authorLinkTestCondition(blogPost.getAuthorLink(), blogPost2.getAuthorLink());
            linkTestCondition(blogPost.getLink(), blogPost2.getLink());
            authorTestCondition(blogPost.getAuthor(), blogPost2.getAuthor());
        }

    }

    @Test
    public void testGetAllByKeys() {
        List<BlogPost> blogPosts = new ArrayList<BlogPost>();
        blogPosts.add(getOneBlogPost());
        blogPosts.add(getOneBlogPost());
        blogPosts.add(getOneBlogPost());

        List<Key<BlogPost>> keys = this.blogPostObjectify.putAll(blogPosts);

        List<BlogPost> blogPosts2 = this.blogPostObjectify.getAllByKey(keys);

        for (BlogPost blogPost : blogPosts) {
            BlogPost blogPost2 = blogPosts2.get(blogPosts.indexOf(blogPost));

            idTestCondition(blogPost.getId(), blogPost2.getId());
            dateTestCondition(blogPost.getDateTime(), blogPost2.getDateTime());
            titleTestCondition(blogPost.getTitle(), blogPost2.getTitle());
            descriptionTestCondition(blogPost.getDescription(), blogPost2.getDescription());
            authorLinkTestCondition(blogPost.getAuthorLink(), blogPost2.getAuthorLink());
            linkTestCondition(blogPost.getLink(), blogPost2.getLink());
            authorTestCondition(blogPost.getAuthor(), blogPost2.getAuthor());
        }

    }

    @Test
    public void testGetBySearchDatas() {
        BlogPost blogPost = getOneBlogPost();

        this.blogPostObjectify.put(blogPost);

        List<BlogPost> blogPosts = this.blogPostObjectify.getBySearchDatas(new Date(), new Date(), null, null);

        for (BlogPost blogPost2 : blogPosts) {
            idTestCondition(blogPost.getId(), blogPost2.getId());
            dateTestCondition(blogPost.getDateTime(), blogPost2.getDateTime());
            titleTestCondition(blogPost.getTitle(), blogPost2.getTitle());
            descriptionTestCondition(blogPost.getDescription(), blogPost2.getDescription());
            authorLinkTestCondition(blogPost.getAuthorLink(), blogPost2.getAuthorLink());
            linkTestCondition(blogPost.getLink(), blogPost2.getLink());
            authorTestCondition(blogPost.getAuthor(), blogPost2.getAuthor());
        }

        blogPosts = this.blogPostObjectify.getBySearchDatas(null, null, "title", null);

        for (BlogPost blogPost2 : blogPosts) {
            idTestCondition(blogPost.getId(), blogPost2.getId());
            dateTestCondition(blogPost.getDateTime(), blogPost2.getDateTime());
            titleTestCondition(blogPost.getTitle(), blogPost2.getTitle());
            descriptionTestCondition(blogPost.getDescription(), blogPost2.getDescription());
            authorLinkTestCondition(blogPost.getAuthorLink(), blogPost2.getAuthorLink());
            linkTestCondition(blogPost.getLink(), blogPost2.getLink());
            authorTestCondition(blogPost.getAuthor(), blogPost2.getAuthor());
        }

        blogPosts = this.blogPostObjectify.getBySearchDatas(null, null, null, "author");

        for (BlogPost blogPost2 : blogPosts) {
            idTestCondition(blogPost.getId(), blogPost2.getId());
            dateTestCondition(blogPost.getDateTime(), blogPost2.getDateTime());
            titleTestCondition(blogPost.getTitle(), blogPost2.getTitle());
            descriptionTestCondition(blogPost.getDescription(), blogPost2.getDescription());
            authorLinkTestCondition(blogPost.getAuthorLink(), blogPost2.getAuthorLink());
            linkTestCondition(blogPost.getLink(), blogPost2.getLink());
            authorTestCondition(blogPost.getAuthor(), blogPost2.getAuthor());
        }

        blogPosts = this.blogPostObjectify.getBySearchDatas(new Date(), new Date(), "title", "author");

        for (BlogPost blogPost2 : blogPosts) {
            idTestCondition(blogPost.getId(), blogPost2.getId());
            dateTestCondition(blogPost.getDateTime(), blogPost2.getDateTime());
            titleTestCondition(blogPost.getTitle(), blogPost2.getTitle());
            descriptionTestCondition(blogPost.getDescription(), blogPost2.getDescription());
            authorLinkTestCondition(blogPost.getAuthorLink(), blogPost2.getAuthorLink());
            linkTestCondition(blogPost.getLink(), blogPost2.getLink());
            authorTestCondition(blogPost.getAuthor(), blogPost2.getAuthor());
        }
    }

    public static BlogPost getOneBlogPost() {
        BlogPost blogPost = new BlogPost();
        blogPost.setAuthor("author");
        blogPost.setAuthorLink(new Link("www.google.com"));
        blogPost.setDateTime(new Date());
        blogPost.setDescription("description");
        blogPost.setLink(new Link("www.gmail.com"));
        blogPost.setTitle("title");
        return blogPost;
    }

    public static void dateTestCondition(Date a, Date b) {
        Assert.assertEquals(a, b);
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void titleTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void descriptionTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void linkTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

    public static void authorTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void authorLinkTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

}

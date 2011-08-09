/**
 * DaoBlogObjectifyTest.java, 8.8.2011 11:15:07 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.Blog;

import com.google.appengine.api.datastore.Email;
import com.googlecode.objectify.Key;

/**
 * @author Tomas Vantuch
 */
public class DaoBlogObjectifyTest {

    private final DaoBlogObjectify blogObjectify = (DaoBlogObjectify) DaoFactory.getInstance().getDaoBlog();

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

        Blog blog = getOneBlog();

        this.blogObjectify.put(blog);

        Blog blog2 = this.blogObjectify.getById(blog.getId());

        idTestCondtion(blog.getId(), blog2.getId());
        passwordTestCondition(blog.getPassword(), blog2.getPassword());
        blogIddTestCondtion(blog.getBlogId(), blog2.getBlogId());
        emailTestCondtion(blog.getEmail(), blog2.getEmail());

        this.blogObjectify.delete(blog);
    }

    @Test
    public void testGetByBlogId() {

        Blog blog = getOneBlog();

        this.blogObjectify.put(blog);

        Blog blog2 = this.blogObjectify.getByBlogId(blog.getBlogId());

        idTestCondtion(blog.getId(), blog2.getId());
        passwordTestCondition(blog.getPassword(), blog2.getPassword());
        blogIddTestCondtion(blog.getBlogId(), blog2.getBlogId());
        emailTestCondtion(blog.getEmail(), blog2.getEmail());

        this.blogObjectify.delete(blog);
    }

    @Test
    public void testGetByEmail() {

        Blog blog = getOneBlog();

        this.blogObjectify.put(blog);

        Blog blog2 = this.blogObjectify.getByEmail(blog.getEmail());

        idTestCondtion(blog.getId(), blog2.getId());
        passwordTestCondition(blog.getPassword(), blog2.getPassword());
        blogIddTestCondtion(blog.getBlogId(), blog2.getBlogId());
        emailTestCondtion(blog.getEmail(), blog2.getEmail());

        this.blogObjectify.delete(blog);
    }

    @Test
    public void testGetByKey() {

        Blog blog = getOneBlog();

        Key<Blog> key = this.blogObjectify.put(blog);

        Blog blog2 = this.blogObjectify.getByKey(key);

        idTestCondtion(blog.getId(), blog2.getId());
        passwordTestCondition(blog.getPassword(), blog2.getPassword());
        blogIddTestCondtion(blog.getBlogId(), blog2.getBlogId());
        emailTestCondtion(blog.getEmail(), blog2.getEmail());

        this.blogObjectify.delete(blog);
    }

    @Test
    public void testPut() {

        Blog blog = getOneBlog();

        Blog blog2 = this.blogObjectify.getByKey(this.blogObjectify.put(blog));

        idTestCondtion(blog.getId(), blog2.getId());
        passwordTestCondition(blog.getPassword(), blog2.getPassword());
        blogIddTestCondtion(blog.getBlogId(), blog2.getBlogId());
        emailTestCondtion(blog.getEmail(), blog2.getEmail());

        this.blogObjectify.delete(blog);
    }

    @Test
    public void testDelete() {

        Blog blog = getOneBlog();

        this.blogObjectify.put(blog);

        Blog blog2 = this.blogObjectify.getById(blog.getId());

        this.blogObjectify.delete(blog);

        blog2 = this.blogObjectify.getById(blog.getId());

        Assert.assertNull(blog2);
    }

    public static Blog getOneBlog() {
        Blog blog = new Blog();
        blog.setBlogId("sfugdfo");
        blog.setEmail(new Email("email"));
        blog.setPassword("asdfg");
        return blog;
    }

    public static void idTestCondtion(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void blogIddTestCondtion(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void emailTestCondtion(Email a, Email b) {
        Assert.assertEquals(a, b);
    }

    public static void passwordTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

}

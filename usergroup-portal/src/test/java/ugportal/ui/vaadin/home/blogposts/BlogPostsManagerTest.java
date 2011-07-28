/**
 * BlogPostsManagerTest.java, 27.7.2011 21:24:17 
 */
package ugportal.ui.vaadin.home.blogposts;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Any;

import ugportal.model.Blog;

import com.google.appengine.api.datastore.Email;
import com.google.gdata.client.GoogleService;
import com.google.gdata.client.Query;
import com.google.gdata.data.Entry;
import com.google.gdata.data.Feed;
import com.google.gdata.util.ServiceException;

/**
 * @author Ondrej Kvasnovsky
 */
public class BlogPostsManagerTest {
    @Mock
    private GoogleService googleService;
    @Mock
    private Feed resultFeed;
    @Mock
    private List<Entry> entries;
    @Mock
    private Query query;
    @Mock
    private Entry entry;
    private BlogPostsManager blogPostManager;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        Blog blog = new Blog();
        blog.setEmail(new Email(""));
        blog.setBlogId("");
        blog.setPassword("");
        this.blogPostManager = new BlogPostsManager(blog);
        this.blogPostManager.setGoogleService(googleService);
    }

    /**
     * Test method for
     * {@link ugportal.ui.vaadin.home.blogposts.BlogPostsManager#getBlogPosts(int)}
     * .
     * 
     * @throws ServiceException
     * @throws IOException
     */
    @Test
    public void testGetBlogPosts() throws IOException, ServiceException {
        // Mockito.when(googleService.query(Mockito.any(Query.class),
        // Feed.class)).thenReturn(resultFeed);
        // Mockito.when(resultFeed.getEntries()).thenReturn(entries);
        // Mockito.when(entries.size()).thenReturn(1);
        // Mockito.when(entries.get(0)).thenReturn(entry);
        // this.blogPostManager.getBlogPosts(1);
    }
}

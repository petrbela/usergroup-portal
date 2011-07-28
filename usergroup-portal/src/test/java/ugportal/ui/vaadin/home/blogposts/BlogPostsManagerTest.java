/**
 * BlogPostsManagerTest.java, 27.7.2011 21:24:17 
 */
package ugportal.ui.vaadin.home.blogposts;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import ugportal.model.Blog;
import ugportal.model.BlogPost;

import com.google.appengine.api.datastore.Email;
import com.google.gdata.client.GoogleService;
import com.google.gdata.client.Query;
import com.google.gdata.data.Entry;
import com.google.gdata.data.Feed;
import com.google.gdata.data.TextConstruct;
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
    @Mock
    private TextConstruct textConstruct;
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
        // mock what is needed to be mocked
        @SuppressWarnings("unchecked")
        final Class<Feed> anyFeed = Mockito.any(Feed.class.getClass());
        final Query anyQuery = Mockito.any(Query.class);
        Mockito.when(googleService.query(anyQuery, anyFeed)).thenReturn(resultFeed);
        Mockito.when(entries.iterator()).thenReturn(new Iterator<Entry>() {
            private boolean onlyOneItem = true;

            @Override
            public void remove() {
            }

            @Override
            public Entry next() {
                return new Entry();
            }

            @Override
            public boolean hasNext() {
                boolean ret = onlyOneItem;
                onlyOneItem = false;
                return ret;
            }
        });
        Mockito.when(resultFeed.getEntries()).thenReturn(entries);
        Mockito.when(entries.size()).thenReturn(1);
        Mockito.when(entries.get(0)).thenReturn(entry);
        Mockito.when(entry.getTitle()).thenReturn(textConstruct);
        // test it
        final List<BlogPost> blogPosts = this.blogPostManager.getBlogPosts(1);
        Assert.assertNotNull(blogPosts);
        Assert.assertEquals(1, blogPosts.size());
    }
}

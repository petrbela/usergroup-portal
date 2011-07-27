/**
 * BlogPostsManager.java, 27.7.2011 19:17:06 
 */
package ugportal.ui.vaadin.home.blogposts;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ugportal.model.Blog;
import ugportal.model.BlogPost;

import com.google.appengine.api.datastore.Link;
import com.google.gdata.client.GoogleService;
import com.google.gdata.client.Query;
import com.google.gdata.client.blogger.BlogPostQuery;
import com.google.gdata.client.blogger.BlogPostQuery.OrderBy;
import com.google.gdata.data.Entry;
import com.google.gdata.data.Feed;
import com.google.gdata.util.ServiceException;

/**
 * @author Ondrej Kvasnovsky
 */
public class BlogPostsManager {

    private final Blog blog;
    private GoogleService googleService = new GoogleService("blogger", "exampleCo-exampleApp-1");

    public BlogPostsManager(final Blog blog) {
        this.blog = blog;
    }

    public List<BlogPost> getBlogPosts(final int maxResults) throws IOException, ServiceException {
        List<BlogPost> ret = new ArrayList<BlogPost>();

        googleService.setUserCredentials(this.blog.getEmail(), this.blog.getPassword());
        // Request the feed
        URL feedUrl = new URL("http://www.blogger.com/feeds/" + this.blog.getBlogId() + "/posts/default");
        BlogPostQuery myQuery = new BlogPostQuery(feedUrl);
        myQuery.setMaxResults(maxResults + maxResults);
        Feed resultFeed = googleService.query(myQuery, Feed.class);
        // Print the results
        List<Entry> entries = resultFeed.getEntries();
        // there is a but in API - in ordering - so this hack is needed
        // let's copy only published entries
        List<Entry> publishedEntries = new ArrayList<Entry>();
        for (Entry entry : entries) {
            if (!entry.isDraft()) {
                publishedEntries.add(entry);
            }
        }
        int size;
        if (publishedEntries.size() > maxResults) {
            size = maxResults;
        } else {
            size = publishedEntries.size();
        }
        for (int i = 0; i < size; i++) {
            Entry entry = publishedEntries.get(i);
            BlogPost blogPost = new BlogPost();
            blogPost.setDescription(entry.getTitle().getPlainText());
            blogPost.setDateTime(new Date(entry.getPublished().getValue()));
            blogPost.setLink(new Link(entry.getHtmlLink().getHref()));
            blogPost.setAuthor(entry.getAuthors().get(0).getName());
            blogPost.setAuthorLink(new Link(entry.getAuthors().get(0).getUri()));
            ret.add(blogPost);
        }
        return ret;
    }

    /**
     * Sets the myService.
     * 
     * @param myService
     *            the myService to set
     */
    protected void setGoogleService(GoogleService googleService) {
        this.googleService = googleService;
    }
}

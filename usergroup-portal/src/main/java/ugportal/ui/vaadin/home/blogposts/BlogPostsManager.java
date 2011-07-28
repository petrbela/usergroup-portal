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
import com.google.gdata.client.blogger.BlogPostQuery;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.Entry;
import com.google.gdata.data.Feed;
import com.google.gdata.data.Person;
import com.google.gdata.data.TextConstruct;
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

        this.googleService.setUserCredentials(this.blog.getEmail().getEmail(), this.blog.getPassword());
        // Request the feed
        URL feedUrl = new URL("http://www.blogger.com/feeds/" + this.blog.getBlogId() + "/posts/default");
        BlogPostQuery myQuery = new BlogPostQuery(feedUrl);
        myQuery.setMaxResults(maxResults + maxResults);
        Feed resultFeed = this.googleService.query(myQuery, Feed.class);
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
            final TextConstruct title = entry.getTitle();
            if (title != null) {
                blogPost.setDescription(title.getPlainText());
            }
            final DateTime published = entry.getPublished();
            if (published != null) {
                blogPost.setDateTime(new Date(published.getValue()));
            }
            final com.google.gdata.data.Link htmlLink = entry.getHtmlLink();
            if (htmlLink != null) {
                blogPost.setLink(new Link(htmlLink.getHref()));
            }
            final List<Person> authors = entry.getAuthors();
            if (authors != null && authors.size() > 0) {
                blogPost.setAuthor(authors.get(0).getName());
                blogPost.setAuthorLink(new Link(authors.get(0).getUri()));
            }
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

/**
 * BlogPostsPanel.java, 27.7.2011 13:04:45 
 */
package ugportal.ui.vaadin.home.blogposts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ugportal.model.Blog;
import ugportal.model.BlogPost;
import ugportal.ui.vaadin.component.UgPanel;

import com.google.appengine.api.datastore.Email;
import com.google.appengine.api.datastore.Link;
import com.google.gdata.util.ServiceException;
import com.vaadin.ui.Label;

/**
 * @author Ondrej Kvasnovsky
 */
public class BlogPostsPanel extends UgPanel {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2991931688786507107L;

    /**
     * Creates new instance.
     * 
     * @param caption
     */
    public BlogPostsPanel(String caption) {
        super(caption);
        Blog blog = new Blog();
        // blog.setBlogId("4472509081073057152");
        // blog.setEmail(new Email("jug.ostrava@gmail.com"));
        // blog.setPassword("fdsf");
        // BlogPostsManager blogPostsManager = new BlogPostsManager(blog);
        // try {
        // List<BlogPost> blogPosts = blogPostsManager.getBlogPosts(5);
        // dummy data
        List<BlogPost> blogPosts = new ArrayList<BlogPost>();
        BlogPost blogPost1 = new BlogPost();
        blogPost1.setAuthor("Ondrej Kvasnovsky");
        blogPost1.setAuthorLink(new Link(""));
        blogPost1.setDateTime(new Date());
        blogPost1.setDescription("");
        blogPost1.setLink(new Link(""));
        blogPost1.setTitle("");
        blogPosts.add(blogPost1);
        for (BlogPost blogPost : blogPosts) {
            Label lblTitle = new Label(blogPost.getDescription());
            this.addComponent(lblTitle);
        }
        // } catch (IOException e) {
        // e.printStackTrace();
        // } catch (ServiceException e) {
        // e.printStackTrace();
        // }

    }

}

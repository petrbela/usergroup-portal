/**
 * BlogPostsPanel.java, 27.7.2011 13:04:45 
 */
package ugportal.ui.vaadin.home.blogposts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import ugportal.model.Blog;
import ugportal.model.BlogPost;
import ugportal.ui.vaadin.component.UgPanel;

import com.google.appengine.api.datastore.Email;
import com.google.appengine.api.datastore.Link;
import com.google.gdata.util.ServiceException;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

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
        // Blog blog = new Blog();
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
        blogPost1.setAuthorLink(new Link("http://www.blogger.com/profile/00751854008976756290"));
        blogPost1.setDateTime(new Date());
        blogPost1.setLink(new Link("http://jug-ostrava.blogspot.com/2011/07/planujeme-dalsi-jug-na-tema-java-7.html"));
        blogPost1.setTitle("Plánujeme další JUG na téma Java 7");
        blogPosts.add(blogPost1);
        BlogPost blogPost2 = new BlogPost();
        blogPost2.setAuthor("Ondrej Kvasnovsky");
        blogPost2.setAuthorLink(new Link("http://www.blogger.com/profile/00751854008976756290"));
        blogPost2.setDateTime(new Date());
        blogPost2.setLink(new Link("http://jug-ostrava.blogspot.com/2011/06/java-7-lunch-kits.html"));
        blogPost2.setTitle("Java 7 - lunch kits");
        blogPosts.add(blogPost2);
        // end of dummy data
        for (BlogPost blogPost : blogPosts) {
            VerticalLayout layout = new VerticalLayout();
            layout.setStyleName("layout-blogpost");
            com.vaadin.ui.Link linkTitle = new com.vaadin.ui.Link(blogPost.getTitle(), new ExternalResource(blogPost
                    .getLink().getValue()));
            layout.addComponent(linkTitle);
            layout.setComponentAlignment(linkTitle, Alignment.TOP_LEFT);
            com.vaadin.ui.Link linkAuthor = new com.vaadin.ui.Link(blogPost.getAuthor(), new ExternalResource(blogPost
                    .getAuthorLink().getValue()));
            layout.addComponent(linkAuthor);
            layout.setComponentAlignment(linkAuthor, Alignment.BOTTOM_RIGHT);
            this.addComponent(layout);
        }
        // } catch (IOException e) {
        // e.printStackTrace();
        // } catch (ServiceException e) {
        // e.printStackTrace();
        // }

    }
}

/**
 * HomePanel.java, Jul 26, 2011 5:56:51 PM 
 */
package ugportal.ui.vaadin.home;

import ugportal.ui.vaadin.component.UgPanel;
import ugportal.ui.vaadin.home.blogposts.BlogPostsPanel;
import ugportal.ui.vaadin.home.events.EventsPanel;
import ugportal.ui.vaadin.home.twitter.TwitterPanel;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.GridLayout;

/**
 * @author Ondrej Kvasnovsky
 */
public class HomePanel extends UgPanel {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3663031940629380280L;

    /**
     * Creates new instance.
     * 
     * @param caption
     */
    public HomePanel(String caption) {
        super(caption);
        initHomePanel();
    }

    /**
     * 
     */
    public void initHomePanel() {
        GridLayout layoutMain = new GridLayout(3, 1);
        layoutMain.setSizeFull();
        TwitterPanel twitterPanel = new TwitterPanel("Twitter");
        layoutMain.addComponent(twitterPanel, 0, 0);
        layoutMain.setComponentAlignment(twitterPanel, Alignment.TOP_LEFT);
        BlogPostsPanel lblBlogNews = new BlogPostsPanel("Blog posts");
        layoutMain.addComponent(lblBlogNews, 1, 0);
        layoutMain.setComponentAlignment(lblBlogNews, Alignment.TOP_CENTER);
        EventsPanel lblEvents = new EventsPanel("Events", this);
        layoutMain.addComponent(lblEvents, 2, 0);
        layoutMain.setComponentAlignment(lblEvents, Alignment.TOP_RIGHT);
        setContent(layoutMain);
    }

}

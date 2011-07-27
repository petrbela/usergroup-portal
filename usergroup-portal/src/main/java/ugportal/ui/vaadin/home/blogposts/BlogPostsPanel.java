/**
 * BlogPostsPanel.java, 27.7.2011 13:04:45 
 */
package ugportal.ui.vaadin.home.blogposts;

import com.vaadin.ui.Label;

import ugportal.ui.vaadin.component.UgPanel;

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
        Label lblTitle = new Label("Blog posts");
        addComponent(lblTitle);
    }

}

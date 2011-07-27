/**
 * EventsPanel.java, 27.7.2011 13:04:31 
 */
package ugportal.ui.vaadin.home.events;

import com.vaadin.ui.Label;

import ugportal.ui.vaadin.component.UgPanel;

/**
 * @author Ondrej Kvasnovsky
 */
public class EventsPanel extends UgPanel {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5460100070350560381L;

    /**
     * Creates new instance.
     * 
     * @param caption
     */
    public EventsPanel(String caption) {
        super(caption);
        Label lblTitle = new Label("Events");
        addComponent(lblTitle);
    }

}

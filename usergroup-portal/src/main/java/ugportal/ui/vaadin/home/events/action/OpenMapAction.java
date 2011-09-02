/**
 * CheckLinkAction.java, 17.8.2011 20:12:04 
 */
package ugportal.ui.vaadin.home.events.action;

import ugportal.ui.vaadin.home.events.DetailEventView;

import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * @author Tomas
 */
public class OpenMapAction implements ClickListener {

    private DetailEventView detailEventView;

    /**
     * Creates new instance.
     * 
     * @param eventsPanel
     * @param detailEventView
     */
    public OpenMapAction(DetailEventView detailEventView) {
        this.detailEventView = detailEventView;
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 488061441624268916L;

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        detailEventView.getWindow().open(new ExternalResource("/map"));
    }
}

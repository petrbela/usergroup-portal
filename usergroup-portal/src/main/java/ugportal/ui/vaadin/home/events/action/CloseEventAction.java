/**
 * CloseEventAction.java, 20.8.2011 13:41:16 
 */
package ugportal.ui.vaadin.home.events.action;

import ugportal.ui.vaadin.home.events.EventsPanel;

import com.vaadin.ui.Button.ClickEvent;

/**
 * @author Tomas
 */
public class CloseEventAction extends AbstractEventAction {

    /**
     * Creates new instance.
     * 
     * @param eventsPanel
     */
    public CloseEventAction(EventsPanel eventsPanel) {
        super(eventsPanel);
        // TODO Auto-generated constructor stub
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -9076718306234277310L;

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        getEventsPanel().getHomePanel().removeAllComponents();
        getEventsPanel().getHomePanel().initHomePanel();

    }

}

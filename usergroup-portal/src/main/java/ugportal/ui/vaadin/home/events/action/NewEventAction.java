/**
 * NewEventAction.java, 17.8.2011 20:10:09 
 */
package ugportal.ui.vaadin.home.events.action;

import ugportal.model.Event;
import ugportal.ui.vaadin.home.events.DetailEventView;
import ugportal.ui.vaadin.home.events.EventsPanel;
import ugportal.ui.vaadin.home.events.state.EventStateHolder;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;

/**
 * @author Tomas
 */
public class NewEventAction extends AbstractEventAction {

    private DetailEventView detailEventView;

    // private Event event = new Event();

    /**
     * Creates new instance.
     * 
     * @param eventsPanel
     */
    public NewEventAction(EventsPanel eventsPanel) {
        super(eventsPanel);
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2018436032745653589L;

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        Panel homepanel = this.getEventsPanel().getHomePanel();
        homepanel.removeAllComponents();
        detailEventView = new DetailEventView("New Event", getEventsPanel(), new Event(),
                EventStateHolder.NEW_EVENT_STATE);
        HorizontalLayout layout = new HorizontalLayout();
        homepanel.addComponent(layout);
        layout.addComponent(detailEventView);

    }
}

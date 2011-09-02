/**
 * OpenEventAction.java, 31.8.2011 20:23:59 
 */
package ugportal.ui.vaadin.home.events.action;

import ugportal.model.Event;
import ugportal.ui.vaadin.home.events.DetailEventView;
import ugportal.ui.vaadin.home.events.EventsPanel;
import ugportal.ui.vaadin.home.events.state.EventStateHolder;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;

/**
 * @author Tomas
 */
public class OpenEventAction extends AbstractEventAction implements ClickListener {

    private Event event = new Event();

    private DetailEventView detailEventView;

    /**
     * Creates new instance.
     * 
     * @param eventsPanel
     */
    public OpenEventAction(EventsPanel eventsPanel, Event event) {
        super(eventsPanel);
        this.event = event;
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2700237015375782925L;

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        detailEventView = new DetailEventView("Event", getEventsPanel(), this.event, EventStateHolder.SHOW_EVENT_STATE);
        Panel homepanel = this.getEventsPanel().getHomePanel();
        homepanel.removeAllComponents();

        HorizontalLayout layout = new HorizontalLayout();
        homepanel.addComponent(layout);
        layout.addComponent(detailEventView);
    }
}

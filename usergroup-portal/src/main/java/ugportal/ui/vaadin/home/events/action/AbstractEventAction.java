/**
 * AbstractEventAction.java, 17.8.2011 20:16:14 
 */
package ugportal.ui.vaadin.home.events.action;

import ugportal.ui.vaadin.home.events.EventsPanel;

import com.vaadin.ui.Button.ClickListener;

/**
 * @author Tomas
 */

public abstract class AbstractEventAction implements ClickListener {

    EventsPanel eventsPanel;

    public AbstractEventAction(final EventsPanel eventsPanel) {
        this.eventsPanel = eventsPanel;
    }

    public EventsPanel getEventsPanel() {
        return this.eventsPanel;
    }

}

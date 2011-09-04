/**
 * ParticipationEventAction.java, 3.9.2011 10:39:06 
 */
package ugportal.ui.vaadin.home.events.action;

import ugportal.model.Event;
import ugportal.ui.vaadin.home.events.DetailEventView;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * @author Tomas
 */
public class ParticipationEventAction implements ClickListener {

    private Event event;

    private DetailEventView eventView;

    /**
     * Creates new instance.
     * 
     * @param eventsPanel
     */
    public ParticipationEventAction(DetailEventView eventView, Event event) {
        this.eventView = eventView;
        this.event = event;
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -676948894549979404L;

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        // TODO add participated user to event

    }
}

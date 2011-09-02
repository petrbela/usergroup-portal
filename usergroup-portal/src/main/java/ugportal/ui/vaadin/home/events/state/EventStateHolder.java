/**
 * EventStateHolder.java, 31.8.2011 13:08:42 
 */
package ugportal.ui.vaadin.home.events.state;

import ugportal.ui.vaadin.home.events.DetailEventView;

/**
 * @author Tomas
 */
public final class EventStateHolder {

    public static NewEventState NEW_EVENT_STATE = new NewEventState();
    public static ShowEventState SHOW_EVENT_STATE = new ShowEventState();

    private DetailEventView detailEventView;

    public EventStateHolder(DetailEventView detailEventView) {
        this.detailEventView = detailEventView;
    }

    /**
     * @param eventState
     */
    public void setState(AbstractEventState eventState) {
        eventState.initInputEventForm(detailEventView);
        eventState.initActionButtons(detailEventView);

    }

}

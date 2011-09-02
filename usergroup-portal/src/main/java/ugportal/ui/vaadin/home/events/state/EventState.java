/**
 * EventState.java, 31.8.2011 13:00:10 
 */
package ugportal.ui.vaadin.home.events.state;

import ugportal.ui.vaadin.home.events.DetailEventView;

/**
 * @author Tomas
 */
public interface EventState {

    void initInputEventForm(DetailEventView detailEventView);

    void initActionButtons(DetailEventView detailEventView);

}

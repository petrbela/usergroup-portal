/**
 * AbstractEventState.java, 31.8.2011 12:57:23 
 */
package ugportal.ui.vaadin.home.events.state;

import ugportal.ui.vaadin.home.events.DetailEventView;

/**
 * @author Tomas
 */
public abstract class AbstractEventState implements EventState {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.ui.vaadin.home.events.state.EventState#initInputEventForm(ugportal.ui.vaadin.home.events.DetailEventView)
     */
    @Override
    public void initInputEventForm(DetailEventView detailEventView) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.ui.vaadin.home.events.state.EventState#initActionButtons(ugportal.ui.vaadin.home.events.DetailEventView)
     */
    @Override
    public void initActionButtons(DetailEventView detailEventView) {
    }

}

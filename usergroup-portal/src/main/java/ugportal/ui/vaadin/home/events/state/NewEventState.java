/**
 * NewEventState.java, 31.8.2011 13:06:12 
 */
package ugportal.ui.vaadin.home.events.state;

import ugportal.ui.vaadin.home.events.DetailEventView;

/**
 * @author Tomas
 */
public class NewEventState extends AbstractEventState {

    @Override
    public void initInputEventForm(DetailEventView detailEventView) {
        detailEventView.getTxtEventTitle().setVisible(true);
        detailEventView.getTxtEventAddres().setVisible(true);
        detailEventView.getTxtEventDescription().setVisible(true);
        detailEventView.getTxtEventLink().setVisible(true);
        detailEventView.getDfdEventDate().setVisible(true);
        detailEventView.getCmbEventTypes().setVisible(true);
        detailEventView.getLblInputMap().setVisible(true);
        detailEventView.getLblTitle().setVisible(false);
        detailEventView.getLblAddress().setVisible(false);
        detailEventView.getLblAuthor().setVisible(false);
        detailEventView.getLblClikableMap().setVisible(false);
        detailEventView.getLblDate().setVisible(false);
        detailEventView.getLblDescription().setVisible(false);
    }

    public void initActionButtons(DetailEventView detailEventView) {
        detailEventView.getBtnParticipation().setVisible(false);
    }

}

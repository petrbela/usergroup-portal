/**
 * ShowEventState.java, 31.8.2011 13:29:50 
 */
package ugportal.ui.vaadin.home.events.state;

import ugportal.ui.vaadin.home.events.DetailEventView;

/**
 * @author Tomas
 */
public class ShowEventState extends AbstractEventState {

    public void initInputEventForm(DetailEventView detailEventView) {
        detailEventView.getTxtEventAddres().setVisible(false);
        detailEventView.getTxtEventDescription().setVisible(false);
        detailEventView.getTxtEventTitle().setVisible(false);
        detailEventView.getTxtEventLink().setVisible(false);
        detailEventView.getLblInputMap().setVisible(false);
        detailEventView.getDfdEventDate().setVisible(false);
        detailEventView.getCmbEventTypes().setVisible(false);
        detailEventView.getLblTitle().setVisible(true);
        detailEventView.getLblAddress().setVisible(true);
        detailEventView.getLblAuthor().setVisible(true);
        detailEventView.getLblClikableMap().setVisible(true);
        detailEventView.getLblDate().setVisible(true);
        detailEventView.getLblDescription().setVisible(true);

    }

}

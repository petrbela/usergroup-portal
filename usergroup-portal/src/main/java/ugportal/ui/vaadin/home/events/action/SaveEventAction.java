/**
 * SaveEventAction.java, 4.9.2011 11:36:55 
 */
package ugportal.ui.vaadin.home.events.action;

import java.util.Date;

import ugportal.model.Event;
import ugportal.model.User;
import ugportal.ui.vaadin.home.events.DetailEventView;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * @author Tomas
 */
public class SaveEventAction implements ClickListener {

    private DetailEventView detailEventView;

    /**
     * Creates new instance.
     * 
     * @param detailEventView
     */
    public SaveEventAction(DetailEventView detailEventView) {
        this.detailEventView = detailEventView;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        Event entityEvent = new Event();

        entityEvent.setAddress((String) detailEventView.getTxtEventAddres().getValue());
        entityEvent.setLabel((String) detailEventView.getTxtEventTitle().getValue());
        entityEvent.setDate((Date) detailEventView.getDfdEventDate().getValue());
        // TODO set to loged user
        entityEvent.setAuthor(new User());

    }

}

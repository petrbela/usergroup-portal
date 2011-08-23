/**
 * EventsPanel.java, 27.7.2011 13:04:31 
 */
package ugportal.ui.vaadin.home.events;

import java.util.ArrayList;
import java.util.List;

import ugportal.dao.DaoFactory;
import ugportal.ui.vaadin.component.UgPanel;
import ugportal.ui.vaadin.home.HomePanel;
import ugportal.ui.vaadin.home.events.action.NewEventAction;

import com.google.appengine.api.datastore.Link;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

/**
 * @author Ondrej Kvasnovsky
 */
public class EventsPanel extends UgPanel {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5460100070350560381L;
    private HomePanel homePanel;

    /**
     * Creates new instance.
     * 
     * @param caption
     */
    public EventsPanel(String caption, HomePanel homePanel) {
        super(caption);
        this.homePanel = homePanel;

        // saveSomeEvents();
        List<ugportal.model.Event> events = new ArrayList<ugportal.model.Event>();
        ugportal.model.Event event = new ugportal.model.Event();
        event.setLink(new Link("http://srazy.info/test2/1389"));
        event.setLabel("Testovaci event1");
        events.add(event);
        ugportal.model.Event event2 = new ugportal.model.Event();
        event2.setLink(new Link("http://srazy.info/testtt/1367"));
        event2.setLabel("Testovaci event2");
        events.add(event2);
        for (ugportal.model.Event e : events) {
            addComponent(new Label(e.getLabel()));
        }
        Button btnNewEvent = new Button("new event >", new NewEventAction(this));
        addComponent(btnNewEvent);
    }

    /**
     * 
     */
    private void saveSomeEvents() {
        ugportal.model.Event event = new ugportal.model.Event();
        event.setLink(new Link("http://srazy.info/test2/1389"));
        event.setLabel("Testovaci event1");
        DaoFactory.getInstance().getDaoEvent().put(event);
        ugportal.model.Event event2 = new ugportal.model.Event();
        event2.setLink(new Link("http://srazy.info/test2/1389"));
        event2.setLabel("Testovaci event1");
        DaoFactory.getInstance().getDaoEvent().put(event2);
    }

    public HomePanel getHomePanel() {
        return this.homePanel;
    }

}

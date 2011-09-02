/**
 * EventsPanel.java, 27.7.2011 13:04:31 
 */
package ugportal.ui.vaadin.home.events;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ugportal.model.User;
import ugportal.ui.vaadin.component.UgPanel;
import ugportal.ui.vaadin.home.HomePanel;
import ugportal.ui.vaadin.home.events.action.NewEventAction;
import ugportal.ui.vaadin.home.events.action.OpenEventAction;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

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

        // dummy data
        ugportal.model.Event event = new ugportal.model.Event();
        event.setLabel("Setkání JUG Ostrava");
        event.setDate(new Date());
        User user = new User();
        user.setFirstname("Ondrej");
        user.setSurname("Kvasnovsky");
        event.setAuthor(user);
        event.setAddress("11, 708 00 Ostrava-Poruba, Èesko");
        event.setAddressDescription("NA2 VŠB-TUO");
        event.setDirectionA(49.83073);
        event.setDirectionB(18.162804);
        event.setDescription("Program \n"
                + "17:45 Registrace \n"
                + "18:00 - 19:00 Pøednáška o Java7 (Jan Lahoda z Oracle) \n"
                + "19:00 - 19:15 Pøestávka \n"
                + "19:15 - 20:15 Workshopy + Java 7 trièka \n"
                + "Více info o workshopech \n"
                + "Bude probíhat nìkolik workshopù na téma Java 7. Cílem je nasdílet co je v nové verzi, ukázky a diskuse.\n "
                + "Sponzoøi:" + "Oracle, Tieto ");
        User user2 = new User();
        user2.setFirstname("Tomas");
        user2.setSurname("Vantuch");
        User user3 = new User();
        user3.setFirstname("Petr");
        user3.setSurname("Bela");
        event.addParticipant(user);
        event.addParticipant(user2);
        event.addParticipant(user3);

        List<ugportal.model.Event> events = new ArrayList<ugportal.model.Event>();
        events.add(event);

        for (ugportal.model.Event e : events) {
            addComponent(getEventBar(e));
        }

        Button btnNewEvent = new Button("new event >", new NewEventAction(this));
        addComponent(btnNewEvent);
    }

    /**
     * @param e
     * @return
     */
    private Component getEventBar(ugportal.model.Event e) {
        VerticalLayout layout = new VerticalLayout();
        layout.addComponent(new Label(e.getLabel()));
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy-hh:mm");
        layout.addComponent(new Label(sdf.format(e.getDate())));
        HorizontalLayout subLayout = new HorizontalLayout();
        subLayout.addComponent(new Label(e.getParticipants().size() + " persons going to..."));
        Button openButton = new Button("open >", new OpenEventAction(this, e));
        subLayout.addComponent(openButton);
        subLayout.setComponentAlignment(openButton, Alignment.MIDDLE_RIGHT);
        layout.addComponent(subLayout);
        return layout;
    }

    public HomePanel getHomePanel() {
        return this.homePanel;
    }

}

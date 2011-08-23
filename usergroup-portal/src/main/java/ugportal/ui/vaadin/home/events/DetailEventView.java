/**
 * DetailEventView.java, 17.8.2011 20:08:46 
 */
package ugportal.ui.vaadin.home.events;

import org.vaadin.hezamu.googlemapwidget.GoogleMap;

import ugportal.ui.vaadin.component.UgPanel;
import ugportal.ui.vaadin.home.events.action.CheckLinkAction;
import ugportal.ui.vaadin.home.events.action.CloseEventAction;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Tomas
 */
public class DetailEventView extends UgPanel {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3794586415449061918L;

    private TextField txtEventTitle = new TextField();

    private TextField txtEventLink = new TextField();

    private TextField txtEventDescription = new TextField();

    private PopupDateField dfdEventDate = new PopupDateField();

    private TextField txtEventAddres = new TextField();

    private ComboBox cmbEventTypes = new ComboBox();

    private Button btnLinkCheck = new Button("check link", new CheckLinkAction(this));

    private EventsPanel eventsPanel;

    // private Button btnSourceMaterials = new Button("add source materials",
    // new AddSourceMaterialFormAction(ev));

    public DetailEventView(String caption, EventsPanel eventsPanel) {
        super(caption);
        this.eventsPanel = eventsPanel;
    }

    public TextField getTxtEventTitle() {
        return txtEventTitle;
    }

    public void setTxtEventTitle(TextField txtEventTitle) {
        this.txtEventTitle = txtEventTitle;
    }

    public PopupDateField getDfdEventDate() {
        return dfdEventDate;
    }

    public void setDfdEventDate(PopupDateField dfdEventDate) {
        this.dfdEventDate = dfdEventDate;
    }

    public TextField getTxtEventAddres() {
        return txtEventAddres;
    }

    public void setTxtEventAddres(TextField txtEventAddres) {
        this.txtEventAddres = txtEventAddres;
    }

    public ComboBox getCmbEventTypes() {
        return cmbEventTypes;
    }

    public void setCmbEventTypes(ComboBox cmbEventTypes) {
        this.cmbEventTypes = cmbEventTypes;
    }

    public EventsPanel getEventsPanel() {
        return eventsPanel;
    }

    public void setEventsPanel(EventsPanel eventsPanel) {
        this.eventsPanel = eventsPanel;
    }

    public Button getBtnLinkCheck() {
        return btnLinkCheck;
    }

    public void setBtnLinkCheck(Button btnLinkCheck) {
        this.btnLinkCheck = btnLinkCheck;
    }

    public TextField getTxtEventLink() {
        return txtEventLink;
    }

    public void setTxtEventLink(TextField txtEventLink) {
        this.txtEventLink = txtEventLink;
    }

    public TextField getTxtEventDescription() {
        return txtEventDescription;
    }

    public void setTxtEventDescription(TextField txtEventDescription) {
        this.txtEventDescription = txtEventDescription;
    }

    public PopupDateField getDateField() {
        return dfdEventDate;
    }

    public void setDateField(PopupDateField dateField) {
        this.dfdEventDate = dateField;
    }

    /**
     * 
     */
    @Override
    public void attach() {
        super.attach();
        //
        // EventType eventType1 = new EventType();
        // eventType1.setLabel("normal");
        // EventType eventType2 = new EventType();
        // eventType2.setLabel("optional");
        // ((DaoEventTypeObjectify)
        // DaoFactory.getInstance().getDaoEventType()).put(eventType1);
        // ((DaoEventTypeObjectify)
        // DaoFactory.getInstance().getDaoEventType()).put(eventType2);
        // List<EventType> eventTypes = ((DaoEventTypeObjectify)
        // DaoFactory.getInstance().getDaoEventType()).getAll();
        // for (EventType eventType : eventTypes) {
        // this.cmbEventTypes.addItem(eventType.getLabel());
        // }
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        GridLayout gridMain = new GridLayout(3, 7);
        gridMain.setSpacing(true);
        gridMain.addComponent(new Label("Title of event :"), 0, 0);
        gridMain.addComponent(txtEventTitle, 1, 0);
        gridMain.addComponent(new Label("Link to srazy.info :"), 0, 1);
        gridMain.addComponent(txtEventLink, 1, 1);
        gridMain.addComponent(btnLinkCheck, 2, 1);
        gridMain.addComponent(new Label("Description :"), 0, 2);
        gridMain.addComponent(txtEventDescription, 1, 2);
        gridMain.addComponent(new Label("Date :"), 0, 3);
        gridMain.addComponent(dfdEventDate, 1, 3);
        gridMain.addComponent(new Label("Addres :"), 0, 4);
        gridMain.addComponent(txtEventAddres, 1, 4);
        gridMain.addComponent(new Label("Type of event :"), 0, 5);
        gridMain.addComponent(cmbEventTypes, 1, 5);
        gridMain.addComponent(new Button("close", new CloseEventAction(eventsPanel)), 2, 6);
        layout.addComponent(gridMain);
        layout.setComponentAlignment(gridMain, Alignment.MIDDLE_CENTER);

        GoogleMap googleMap = new GoogleMap(getApplication());

        layout.addComponent(googleMap);

        setContent(layout);
    }
}

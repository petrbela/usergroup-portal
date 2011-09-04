/**
 * DetailEventView.java, 17.8.2011 20:08:46 
 */
package ugportal.ui.vaadin.home.events;

import java.util.Map;

import ugportal.ui.vaadin.component.UgPanel;
import ugportal.ui.vaadin.home.events.action.AddSourceMaterialsAction;
import ugportal.ui.vaadin.home.events.action.CloseEventAction;
import ugportal.ui.vaadin.home.events.action.OpenMapAction;
import ugportal.ui.vaadin.home.events.action.ParticipationEventAction;
import ugportal.ui.vaadin.home.events.action.SaveEventAction;
import ugportal.ui.vaadin.home.events.state.AbstractEventState;
import ugportal.ui.vaadin.home.events.state.EventStateHolder;

import com.vaadin.terminal.ParameterHandler;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Tomas
 */
public class DetailEventView extends UgPanel implements ParameterHandler {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3794586415449061918L;

    private final String COMPONENT_WIDTH = "350px";

    private HorizontalLayout layout;

    private TextField txtEventTitle = new TextField("Title :");

    private TextField txtEventLink = new TextField("Link :");

    private RichTextArea txtEventDescription = new RichTextArea("Description :");

    private PopupDateField dfdEventDate = new PopupDateField("Date :");

    private TextArea txtEventAddres = new TextArea("Address :");

    private ComboBox cmbEventTypes = new ComboBox("Type :");

    private Button btnLinkCheck = new Button("check link", new OpenMapAction(this));

    private Label lblInputMap = new Label();

    private EventsPanel eventsPanel;

    private ugportal.model.Event event;

    private Label lblTitle = new Label();

    private Label lblDate = new Label();

    private Label lblAuthor = new Label();

    private Label lblAddress = new Label();

    private Label lblDescription = new Label();

    private Label lblClikableMap = new Label();

    private Label map;

    private Button btnParticipation;

    private VerticalLayout rightLayout = new VerticalLayout();

    private VerticalLayout leftLayout = new VerticalLayout();

    private Button btnSaveEvent = new Button("save", new SaveEventAction(this));

    private Button btnAddSourceMaterials = new Button("add source materials", new AddSourceMaterialsAction(this));

    public DetailEventView(String caption, EventsPanel eventsPanel, ugportal.model.Event event,
            AbstractEventState eventState) {

        super(caption);
        this.eventsPanel = eventsPanel;
        this.event = event;

        init();

        EventStateHolder stateHolder = new EventStateHolder(this);
        stateHolder.setState(eventState);
    }

    public void init() {
        eventsPanel.getHomePanel().getMainPanel().getMainWindow().addParameterHandler(this);
        try {
            lblTitle = new Label(event.getLabel());
            lblAddress = new Label(event.getAddress() + "\n" + event.getAddressDescription());
            lblAuthor = new Label(event.getAuthor().getFirstname() + " " + event.getAuthor().getSurname());
            lblDate = new Label(event.getDate().toString());
            lblDescription = new Label(event.getDescription(), Label.UNITS_CM);
            lblClikableMap = new Label("<a href=\"http://maps.google.sk/maps?q=" + event.getDirectionA() + ","
                    + event.getDirectionB() + "\" target=\"_blank\">"
                    + "<img src=\"http://maps.googleapis.com/maps/api/staticmap?center=" + event.getDirectionA() + ","
                    + event.getDirectionB() + "&zoom=15&size=375x400&markers=color:blue%7Clabel:A%7C"
                    + event.getDirectionA() + "," + event.getDirectionB() + "&maptype=hybrid&sensor=false\" /></a>",
                    Label.CONTENT_XHTML);
        } catch (NullPointerException exception) {

        }

        btnParticipation = new Button("Attend", new ParticipationEventAction(this, event));

        layout = new HorizontalLayout();
        layout.setSizeFull();

        leftLayout.setSpacing(true);
        leftLayout.setMargin(true);
        leftLayout.setWidth("450px");
        txtEventTitle.setWidth(COMPONENT_WIDTH);
        leftLayout.addComponent(txtEventTitle);
        txtEventLink.setWidth(COMPONENT_WIDTH);
        txtEventLink.setValue("=");
        txtEventLink.setDescription("Link of this event for placing on social networks or sending by email...");
        leftLayout.addComponent(txtEventLink);

        HorizontalLayout dateAndTypeBar = new HorizontalLayout();
        dateAndTypeBar.setWidth(COMPONENT_WIDTH);
        dateAndTypeBar.setSpacing(true);
        dateAndTypeBar.addComponent(dfdEventDate);
        cmbEventTypes.setSizeFull();
        dateAndTypeBar.addComponent(cmbEventTypes);
        leftLayout.addComponent(dateAndTypeBar);

        txtEventAddres.setWidth(COMPONENT_WIDTH);
        txtEventAddres.setRows(3);
        leftLayout.addComponent(txtEventAddres);
        txtEventDescription.setWidth(COMPONENT_WIDTH);
        leftLayout.addComponent(txtEventDescription);

        lblInputMap = new Label(
                "<a href=\"/map\">"
                        + "<img src=\"http://maps.googleapis.com/maps/api/staticmap?center=40.713956,20.742188&zoom=2&size=375x400&markers=color:blue%7Clabel:A%7C"
                        + "40.713956,20.742188&maptype=hybrid&sensor=false\" /></a>", Label.CONTENT_XHTML);

        leftLayout.addComponent(lblTitle);
        leftLayout.addComponent(lblAuthor);
        leftLayout.addComponent(lblDate);
        leftLayout.addComponent(lblAddress);
        leftLayout.addComponent(lblDescription);
        leftLayout.addComponent(btnParticipation);
        leftLayout.addComponent(new Button("close", new CloseEventAction(eventsPanel)));
        leftLayout.addComponent(btnSaveEvent);
        leftLayout.addComponent(btnAddSourceMaterials);
        rightLayout.setSpacing(true);
        rightLayout.setMargin(true);
        rightLayout.setSizeFull();
        layout.addComponent(leftLayout);
        lblClikableMap.setCaption("Place of event :");
        rightLayout.addComponent(lblClikableMap);
        lblInputMap.setCaption("Pick a place of event :");
        rightLayout.addComponent(lblInputMap);
        layout.addComponent(rightLayout);

        setContent(layout);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.terminal.ParameterHandler#handleParameters(java.util.Map)
     */
    @Override
    public void handleParameters(Map<String, String[]> parameters) {
        if (parameters.containsKey("address")) {
            rightLayout.removeComponent(lblInputMap);
            if (map != null)
                rightLayout.removeComponent(map);
            txtEventAddres.setValue(parameters.get("address")[0]);
            String directions = parameters.get("directions")[0];
            map = new Label("<a href=\"/map?da=" + directions.split(",")[0] + "&db="
                    + directions.split(",")[1].replaceAll(" ", "")
                    + "\"><img src=\"http://maps.googleapis.com/maps/api/staticmap?center=" + directions
                    + "&zoom=15&size=375x400&markers=color:blue%7Clabel:A%7C" + directions
                    + "&maptype=hybrid&sensor=false\" /></a>", Label.CONTENT_XHTML);
            map.setCaption("Place of event :");
            rightLayout.addComponent(map);
        }
    }

    public Button getBtnParticipation() {
        return btnParticipation;
    }

    public void setBtnParticipation(Button btnParticipation) {
        this.btnParticipation = btnParticipation;
    }

    public Label getLblInputMap() {
        return lblInputMap;
    }

    public void setLblInputMap(Label lblInputMap) {
        this.lblInputMap = lblInputMap;
    }

    /**
     * Returns the layout.
     * 
     * @return the layout
     */
    public HorizontalLayout getLayout() {
        return layout;
    }

    /**
     * Returns the txtEventTitle.
     * 
     * @return the txtEventTitle
     */
    public TextField getTxtEventTitle() {
        return txtEventTitle;
    }

    /**
     * Returns the txtEventLink.
     * 
     * @return the txtEventLink
     */
    public TextField getTxtEventLink() {
        return txtEventLink;
    }

    /**
     * Returns the txtEventDescription.
     * 
     * @return the txtEventDescription
     */
    public RichTextArea getTxtEventDescription() {
        return txtEventDescription;
    }

    /**
     * Returns the dfdEventDate.
     * 
     * @return the dfdEventDate
     */
    public PopupDateField getDfdEventDate() {
        return dfdEventDate;
    }

    /**
     * Returns the txtEventAddres.
     * 
     * @return the txtEventAddres
     */
    public TextArea getTxtEventAddres() {
        return txtEventAddres;
    }

    /**
     * Returns the cmbEventTypes.
     * 
     * @return the cmbEventTypes
     */
    public ComboBox getCmbEventTypes() {
        return cmbEventTypes;
    }

    /**
     * Returns the btnLinkCheck.
     * 
     * @return the btnLinkCheck
     */
    public Button getBtnLinkCheck() {
        return btnLinkCheck;
    }

    /**
     * Returns the event.
     * 
     * @return the event
     */
    public ugportal.model.Event getEvent() {
        return event;
    }

    /**
     * Returns the lblTitle.
     * 
     * @return the lblTitle
     */
    public Label getLblTitle() {
        return lblTitle;
    }

    /**
     * Returns the lblDate.
     * 
     * @return the lblDate
     */
    public Label getLblDate() {
        return lblDate;
    }

    /**
     * Returns the lblAuthor.
     * 
     * @return the lblAuthor
     */
    public Label getLblAuthor() {
        return lblAuthor;
    }

    /**
     * Returns the lblAddress.
     * 
     * @return the lblAddress
     */
    public Label getLblAddress() {
        return lblAddress;
    }

    /**
     * Returns the lblDescription.
     * 
     * @return the lblDescription
     */
    public Label getLblDescription() {
        return lblDescription;
    }

    /**
     * Returns the lblClikableMap.
     * 
     * @return the lblClikableMap
     */
    public Label getLblClikableMap() {
        return lblClikableMap;
    }

    /**
     * Sets the layout.
     * 
     * @param layout
     *            the layout to set
     */
    public void setLayout(HorizontalLayout layout) {
        this.layout = layout;
    }

    /**
     * Sets the txtEventTitle.
     * 
     * @param txtEventTitle
     *            the txtEventTitle to set
     */
    public void setTxtEventTitle(TextField txtEventTitle) {
        this.txtEventTitle = txtEventTitle;
    }

    /**
     * Sets the txtEventLink.
     * 
     * @param txtEventLink
     *            the txtEventLink to set
     */
    public void setTxtEventLink(TextField txtEventLink) {
        this.txtEventLink = txtEventLink;
    }

    /**
     * Sets the txtEventDescription.
     * 
     * @param txtEventDescription
     *            the txtEventDescription to set
     */
    public void setTxtEventDescription(RichTextArea txtEventDescription) {
        this.txtEventDescription = txtEventDescription;
    }

    /**
     * Sets the dfdEventDate.
     * 
     * @param dfdEventDate
     *            the dfdEventDate to set
     */
    public void setDfdEventDate(PopupDateField dfdEventDate) {
        this.dfdEventDate = dfdEventDate;
    }

    /**
     * Sets the txtEventAddres.
     * 
     * @param txtEventAddres
     *            the txtEventAddres to set
     */
    public void setTxtEventAddres(TextArea txtEventAddres) {
        this.txtEventAddres = txtEventAddres;
    }

    /**
     * Sets the cmbEventTypes.
     * 
     * @param cmbEventTypes
     *            the cmbEventTypes to set
     */
    public void setCmbEventTypes(ComboBox cmbEventTypes) {
        this.cmbEventTypes = cmbEventTypes;
    }

    /**
     * Sets the btnLinkCheck.
     * 
     * @param btnLinkCheck
     *            the btnLinkCheck to set
     */
    public void setBtnLinkCheck(Button btnLinkCheck) {
        this.btnLinkCheck = btnLinkCheck;
    }

    /**
     * Sets the event.
     * 
     * @param event
     *            the event to set
     */
    public void setEvent(ugportal.model.Event event) {
        this.event = event;
    }

    /**
     * Sets the lblTitle.
     * 
     * @param lblTitle
     *            the lblTitle to set
     */
    public void setLblTitle(Label lblTitle) {
        this.lblTitle = lblTitle;
    }

    /**
     * Sets the lblDate.
     * 
     * @param lblDate
     *            the lblDate to set
     */
    public void setLblDate(Label lblDate) {
        this.lblDate = lblDate;
    }

    /**
     * Sets the lblAuthor.
     * 
     * @param lblAuthor
     *            the lblAuthor to set
     */
    public void setLblAuthor(Label lblAuthor) {
        this.lblAuthor = lblAuthor;
    }

    /**
     * Sets the lblAddress.
     * 
     * @param lblAddress
     *            the lblAddress to set
     */
    public void setLblAddress(Label lblAddress) {
        this.lblAddress = lblAddress;
    }

    /**
     * Sets the lblDescription.
     * 
     * @param lblDescription
     *            the lblDescription to set
     */
    public void setLblDescription(Label lblDescription) {
        this.lblDescription = lblDescription;
    }

    /**
     * Sets the lblClikableMap.
     * 
     * @param lblClikableMap
     *            the lblClikableMap to set
     */
    public void setLblClikableMap(Label lblClikableMap) {
        this.lblClikableMap = lblClikableMap;
    }

}

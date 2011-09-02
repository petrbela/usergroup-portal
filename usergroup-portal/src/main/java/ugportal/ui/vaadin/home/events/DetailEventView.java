/**
 * DetailEventView.java, 17.8.2011 20:08:46 
 */
package ugportal.ui.vaadin.home.events;

import java.util.Map;

import ugportal.ui.vaadin.component.UgPanel;
import ugportal.ui.vaadin.home.events.action.CloseEventAction;
import ugportal.ui.vaadin.home.events.action.OpenMapAction;
import ugportal.ui.vaadin.home.events.state.AbstractEventState;
import ugportal.ui.vaadin.home.events.state.EventStateHolder;

import com.vaadin.terminal.ParameterHandler;
import com.vaadin.ui.Alignment;
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
                    + event.getDirectionB() + "&zoom=15&size=400x400&markers=color:blue%7Clabel:A%7C"
                    + event.getDirectionA() + "," + event.getDirectionB() + "&maptype=hybrid&sensor=false\" /></a>",
                    Label.CONTENT_XHTML);
        } catch (NullPointerException exception) {

        }

        layout = new HorizontalLayout();
        layout.setSizeFull();

        VerticalLayout leftLayout = new VerticalLayout();
        leftLayout.setSpacing(true);
        leftLayout.setMargin(true);
        leftLayout.setWidth("450px");

        leftLayout.addComponent(txtEventTitle);
        leftLayout.addComponent(txtEventLink);
        leftLayout.addComponent(dfdEventDate);
        txtEventAddres.setColumns(30);
        txtEventAddres.setRows(3);
        leftLayout.addComponent(txtEventAddres);
        leftLayout.addComponent(cmbEventTypes);
        txtEventDescription.setWidth("400px");
        leftLayout.addComponent(txtEventDescription);

        lblInputMap = new Label(
                "<a href=\"/map\">"
                        + "<img src=\"http://maps.googleapis.com/maps/api/staticmap?center=40.713956,20.742188&zoom=2&size=400x400&markers=color:blue%7Clabel:A%7C"
                        + "40.713956,20.742188&maptype=hybrid&sensor=false\" /></a>", Label.CONTENT_XHTML);

        leftLayout.addComponent(lblTitle);
        leftLayout.addComponent(lblAuthor);
        leftLayout.addComponent(lblDate);
        leftLayout.addComponent(lblAddress);
        leftLayout.addComponent(lblDescription);

        leftLayout.addComponent(new Button("close", new CloseEventAction(eventsPanel)));

        layout.addComponent(leftLayout);
        layout.addComponent(lblClikableMap);
        layout.addComponent(lblInputMap);
        layout.setComponentAlignment(leftLayout, Alignment.MIDDLE_CENTER);
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
            layout.removeComponent(lblInputMap);
            if (map != null)
                layout.removeComponent(map);
            txtEventAddres.setValue(parameters.get("address")[0]);
            String directions = parameters.get("directions")[0];
            map = new Label("<a href=\"/map?da=" + directions.split(",")[0] + "&db="
                    + directions.split(",")[1].replaceAll(" ", "")
                    + "\"><img src=\"http://maps.googleapis.com/maps/api/staticmap?center=" + directions
                    + "&zoom=15&size=400x400&markers=color:blue%7Clabel:A%7C" + directions
                    + "&maptype=hybrid&sensor=false\" /></a>", Label.CONTENT_XHTML);
            layout.addComponent(map);
        }
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

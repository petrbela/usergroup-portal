/**
 * UgPortalMainPanel.java, Jul 26, 2011 5:14:08 PM 
 */
package ugportal.ui.vaadin;

import ugportal.ui.vaadin.about.AboutPanel;
import ugportal.ui.vaadin.home.HomePanel;
import ugportal.ui.vaadin.login.LoginPanel;
import ugportal.ui.vaadin.members.MembersPanel;

import com.vaadin.terminal.Sizeable;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.Runo;

/**
 * {@link UGPortalMainPanel} represents the main panel containing all the
 * components that are visible to users.
 * 
 * @author Ondrej Kvasnovsky
 */
public class UGPortalMainPanel extends CustomComponent {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8470244340421881450L;
    /**
     * pnlMain is the main or root panel
     */
    private Panel pnlMain;
    /**
     * tabSheetMain is the main menu, home, members and so on...
     */
    private TabSheet tabSheetMain;

    private Window mainWindow;

    /**
     * Creates new instance.
     */
    public UGPortalMainPanel(Window mainWindow) {
        this.mainWindow = mainWindow;
        buildPnlMain();
        setCompositionRoot(pnlMain);
        pnlMain.setWidth("900px");
        pnlMain.setHeight("100%");
        tabSheetMain.addTab(new HomePanel("Home", this));
        tabSheetMain.addTab(new MembersPanel("Members", this));
        tabSheetMain.addTab(new AboutPanel("About", this));
        tabSheetMain.addTab(new LoginPanel("Login", this));

    }

    /**
     * Builds the main panel.
     */
    private void buildPnlMain() {
        pnlMain = new Panel();
        pnlMain.setCaption("User Group portal");
        pnlMain.setImmediate(false);
        pnlMain.setSizeFull();
        final VerticalLayout tabSheetLayout = buildTabSheetLayout();
        pnlMain.setContent(tabSheetLayout);
        // build footer panel
        buildPnlFooter(tabSheetLayout);
    }

    /**
     * Builds the footer panel.
     * 
     * @param tabSheetLayout
     *            layout of the TabSheet
     */
    private void buildPnlFooter(final VerticalLayout tabSheetLayout) {
        // create footer panel
        final Panel pnlFooter = new Panel();
        pnlFooter.setStyleName(Runo.PANEL_LIGHT);
        // change vertical layout to horizontal
        final HorizontalLayout layoutFooter = new HorizontalLayout();
        layoutFooter.setWidth(100, Sizeable.UNITS_PERCENTAGE);
        layoutFooter.setHeight(15, Sizeable.UNITS_PIXELS);
        layoutFooter.setSpacing(true);
        pnlFooter.setContent(layoutFooter);
        final Label lblFooter = new Label("©2011 JUG Ostrava");
        lblFooter.setSizeUndefined();
        lblFooter.setStyleName(Runo.LABEL_SMALL);
        layoutFooter.addComponent(lblFooter);
        layoutFooter.setComponentAlignment(lblFooter, Alignment.MIDDLE_CENTER);
        tabSheetLayout.addComponent(pnlFooter);
    }

    /**
     * Builds and returns layout of the TabSheet.
     * 
     * @return layout of the TabSheet
     */
    private VerticalLayout buildTabSheetLayout() {
        VerticalLayout layout = new VerticalLayout();
        layout.setImmediate(false);
        layout.setSizeFull();
        layout.setMargin(true);
        tabSheetMain = new TabSheet();
        tabSheetMain.setSizeFull();
        layout.addComponent(tabSheetMain);
        return layout;
    }

    public Window getMainWindow() {
        return mainWindow;
    }

}

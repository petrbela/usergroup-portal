/**
 * UGPortalApplication.java, Jul 26, 2011 11:37:52 PM 
 */
package ugportal.ui.vaadin;

import com.vaadin.Application;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Window;

/**
 * {@link UGPortalApplication} represents the portal application.
 * 
 * @author Ondrej Kvasnovsky
 */
public class UGPortalApplication extends Application {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -5900332140878864315L;

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.Application#init()
     */
    @Override
    public void init() {
        setTheme("ugportal");
        final HorizontalLayout layout = new HorizontalLayout();
        layout.setWidth("100%");
        final UGPortalMainPanel loginComponent = new UGPortalMainPanel();
        layout.addComponent(loginComponent);
        loginComponent.setSizeUndefined();
        layout.setComponentAlignment(loginComponent, Alignment.MIDDLE_CENTER);
        // Create & place main window
        final Window mainWindow = new Window("Ug portal");
        mainWindow.addComponent(layout);
        setMainWindow(mainWindow);
    }
}

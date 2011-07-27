/**
 * UgPanel.java, Jul 26, 2011 6:03:48 PM 
 */
package ugportal.ui.vaadin.component;

import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.Panel;
import com.vaadin.ui.themes.Runo;

/**
 * @author Ondrej Kvasnovsky
 */
public class UgPanel extends Panel {

    /**
     * Creates new instance.
     */
    public UgPanel() {
        super();
        init();
    }

    /**
     * Creates new instance.
     * 
     * @param content
     */
    public UgPanel(ComponentContainer content) {
        super(content);
        init();
    }

    /**
     * Creates new instance.
     * 
     * @param caption
     */
    public UgPanel(String caption) {
        super(caption);
        init();
    }

    /**
     * Creates new instance.
     * 
     * @param caption
     * @param content
     */
    public UgPanel(String caption, ComponentContainer content) {
        super(caption, content);
        init();
    }

    private void init() {
        setStyleName(Runo.PANEL_LIGHT);
    }
}

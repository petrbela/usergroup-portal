/**
 * AddSourceMaterialsAction.java, 4.9.2011 11:38:46 
 */
package ugportal.ui.vaadin.home.events.action;

import ugportal.ui.vaadin.home.events.DetailEventView;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * @author Tomas
 */
public class AddSourceMaterialsAction implements ClickListener {

    private DetailEventView detailEventView;

    /**
     * Creates new instance.
     * 
     * @param detailEventView
     */
    public AddSourceMaterialsAction(DetailEventView detailEventView) {
        this.detailEventView = detailEventView;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        // TODO Auto-generated method stub

    }

}

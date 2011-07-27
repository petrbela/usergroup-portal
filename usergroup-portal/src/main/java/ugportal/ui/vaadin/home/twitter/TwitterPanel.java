/**
 * TwitterPanel.java, 27.7.2011 12:59:52 
 */
package ugportal.ui.vaadin.home.twitter;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import ugportal.ui.vaadin.component.UgPanel;

import com.vaadin.ui.CustomLayout;

/**
 * @author Ondrej Kvasnovsky
 */
public class TwitterPanel extends UgPanel {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1258239136644410258L;

    /**
     * Creates new instance.
     * 
     * @param caption
     */
    public TwitterPanel(final String caption) {
        super(caption);
        final String javaScript = "<div /><script src=\"http://widgets.twimg.com/j/2/widget.js\"></script>"
                + "<script> new TWTR.Widget({  version: 2,  type: 'faves',  rpp: 10,  interval: 6000,  title: 'Tweets by',  subject: 'Java User Group - Ostrava',"
                + "width: 'auto',  height: 300,  theme: {    shell: {      background: '#f14d1a',      color: '#ffffff'    },    tweets: {      background: '#ffffff',"
                + "color: '#444444',      links: '#f14d1a'    }  },  features: {    scrollbar: true,    loop: false,    live: true,    hashtags: true,    timestamp: true,"
                + "avatars: true,    behavior: 'all'  }}).render().setUser('@OstravaJUG').start();</script>";
        try {
            CustomLayout custom = new CustomLayout(new ByteArrayInputStream(javaScript.getBytes()));
            custom.setWidth("290px");
            custom.setHeight("390px");
            addComponent(custom);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

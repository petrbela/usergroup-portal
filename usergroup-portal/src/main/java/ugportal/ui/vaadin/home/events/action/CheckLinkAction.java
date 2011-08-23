/**
 * CheckLinkAction.java, 17.8.2011 20:12:04 
 */
package ugportal.ui.vaadin.home.events.action;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import ugportal.ui.vaadin.home.events.DetailEventView;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * @author Tomas
 */
public class CheckLinkAction implements ClickListener {

    private DetailEventView detailEventView;

    /**
     * Creates new instance.
     * 
     * @param eventsPanel
     * @param detailEventView
     */
    public CheckLinkAction(DetailEventView detailEventView) {
        this.detailEventView = detailEventView;
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 488061441624268916L;

    /**
     * {@inheritDoc}
     * 
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        // String inuptUrl =
        // detailEventView.getTxtEventLink().getValue().toString();
        //
        // URL url = null;
        // try {
        // url = new URL("http://srazy.info/test2/1389?state=not&do=attending");
        // } catch (MalformedURLException e) {
        // e.printStackTrace();
        // }
        //
        // try {
        // BufferedReader in = new BufferedReader(new
        // InputStreamReader(url.openStream()));
        // String line = "";
        // while (!(line += in.readLine()).equals(line)) {
        // }
        // in.close();
        // System.out.println(line);
        // detailEventView.addComponent(new Label(line, Label.CONTENT_XHTML));
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // try {
        try {
            sendRequest1("http://srazy.info/test2/1389");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // sendRequest("http://srazy.info/test2/1389");
    }

    /**
     * @param url
     */
    private void sendRequest(String rurl) {
        URL url = null;
        String urlParameters = "state=not&do=attending";
        try {
            url = new URL(rurl);
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
            URLConnection connection = url.openConnection();

            connection.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(urlParameters);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void sendRequest1(String rurl) throws IOException {
        URL url = new URL("http://srazy.info/test2/1389?state=not&do=attending");
        InputStream iStream = url.openStream();
        try {
        } finally {
            iStream.close();
        }
    }

}

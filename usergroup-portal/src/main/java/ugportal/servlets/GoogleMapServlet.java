/**
 * GoogleMapServlet.java, 28.8.2011 10:11:14 
 */
package ugportal.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Tomas
 */
public class GoogleMapServlet extends HttpServlet {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1411057027847648277L;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        double directionA;
        double directionB;
        try {
            directionA = Double.parseDouble(req.getParameterValues("da")[0]);
            directionB = Double.parseDouble(req.getParameterValues("db")[0]);

        } catch (NullPointerException exception) {
            directionA = 50.0710194761356;
            directionB = 14.46159643554688;
        }

        PrintWriter out = resp.getWriter();
        out.println("<html>"
                + "<head>"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />"
                + "<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" /> "
                + "<script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>"
                + "<script src=\"http://maps.googleapis.com/maps/api/js?sensor=false&libraries=places\"type=\"text/javascript\"></script>"
                + "<script type=\"text/javascript\">" + "var geocoder = new google.maps.Geocoder();"
                + "function geocodePosition(pos) {" + "geocoder.geocode({" + "latLng: pos" + "}, function(responses) {"
                + "if (responses && responses.length > 0) {" + "updateMarkerAddress(responses[0].formatted_address);"
                + "} else {" + "updateMarkerAddress('Cannot determine address at this location.');" + "}" + "});" + "}"
                + "function updateMarkerPosition(latLng) {" + "document.getElementById('info').value = ["
                + "latLng.lat()," + "latLng.lng()" + "].join(', ');" + "}" + "function updateMarkerAddress(str) {"
                + "document.getElementById('address').value = str;" + "}" + "function initialize() {"
                + "var latLng = new google.maps.LatLng("
                + directionA
                + ", "
                + directionB
                + ");"
                + "var map = new google.maps.Map(document.getElementById('mapCanvas'), {"
                + "zoom: 8,"
                + "center: latLng,"
                + "mapTypeId: google.maps.MapTypeId.ROADMAP"
                + "});"
                + "var marker = new google.maps.Marker({"
                + "position: latLng,"
                + "title: 'Point A',"
                + "map: map,"
                + "draggable: true"
                + "});"
                + "var input = document.getElementById('searchTextField');"
                + "var autocomplete = new google.maps.places.Autocomplete(input);"
                + "autocomplete.bindTo('bounds', map);"
                + "var infowindow = new google.maps.InfoWindow();"
                + "google.maps.event.addListener(autocomplete, 'place_changed', function() {"
                + "infowindow.close();"
                + "var place = autocomplete.getPlace();"
                + "if (place.geometry.viewport) {"
                + "map.fitBounds(place.geometry.viewport);"
                + "} else {"
                + " map.setCenter(place.geometry.location);"
                + " map.setZoom(17);"
                + "}"
                + "var image = new google.maps.MarkerImage("
                + " place.icon,"
                + "new google.maps.Size(71, 71),"
                + "new google.maps.Point(0, 0),"
                + "new google.maps.Point(17, 34),"
                + "new google.maps.Size(35, 35));"
                + "marker.setPosition(place.geometry.location);"
                + "marker.setDraggable(true);"
                + "marker.setClickable(true);"
                + "updateMarkerPosition(marker.getPosition());"
                + "});"
                + "updateMarkerPosition(latLng);"
                + "geocodePosition(latLng);"
                + "google.maps.event.addListener(marker, 'dragstart', function() {"
                + "updateMarkerAddress('Dragging...');"
                + "});"
                + "google.maps.event.addListener(marker, 'drag', function() {"
                + "updateMarkerPosition(marker.getPosition());"
                + "});"
                + "google.maps.event.addListener(marker, 'dragend', function() {"
                + "geocodePosition(marker.getPosition());"
                + "});"
                + "}"
                + "google.maps.event.addDomListener(window, 'load', initialize);"
                + "</script> "
                + "</head> "
                + "<body> "
                + "<style> "
                + "#mapCanvas {"
                + "width: 700px;"
                + "height: 500px;"
                + "}"
                + "#infoPanel {"
                + "width: 700px;"
                + "margin-left: 10px;"
                + "}"
                + "#infoPanel div {"
                + "margin-bottom: 5px;"
                + "}"
                + "</style> "
                + "<input id=\"searchTextField\" type=\"text\" size=\"50\">"
                + "<div id=\"mapCanvas\"></div> "
                + "<div id=\"infoPanel\">"
                + "<form method=\"POST\" action=\"/\" style=\"float:right\"> "
                + "<input id=\"info\" name=\"directions\" type=\"hidden\" />"
                + "Closest matching address: <input id=\"address\" name=\"address\" type=\"text\" size=\"50\" /><br />"
                + "Added description: <input id=\"address2\" name=\"description\" type=\"text\" size=\"50\" />"
                + "<br />" + "<input type=\"submit\" value=\"ok\"  />" + "</form>" + "</div> " + "</body> " + "</html>");

    }
}

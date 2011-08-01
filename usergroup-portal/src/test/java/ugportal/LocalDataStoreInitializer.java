/**
 * LocalDataStoreInitializer.java, 1.8.2011 10:06:48 
 */
package ugportal;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

/**
 * @author Tomas Vantuch
 */
public class LocalDataStoreInitializer {

    private final static LocalServiceTestHelper helper = new LocalServiceTestHelper(
            new LocalDatastoreServiceTestConfig());

    public static void setUp() {
        helper.setUp();
    }

    public static void tearDown() {
        helper.tearDown();
    }
}

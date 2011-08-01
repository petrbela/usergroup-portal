/**
 * DaoSettingObjectifyTest.java, 30.7.2011 11:21:34 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import ugportal.LocalDataStoreInitializer;

import com.google.appengine.api.datastore.Link;

/**
 * @author Tomas Vantuch
 */
public class DaoSettingObjectifyTest {

    @Before
    public void setUp() throws Exception {
        LocalDataStoreInitializer.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        LocalDataStoreInitializer.tearDown();
    }

    public static void linkTwitterTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

    public static void linkBlogPostTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

}

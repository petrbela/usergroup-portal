/**
 * DaoSettingObjectifyTest.java, 30.7.2011 11:21:34 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import com.google.appengine.api.datastore.Link;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

/**
 * @author Tomas Vantuch
 */
public class DaoSettingObjectifyTest {

    private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());

    @Before
    public void setUp() throws Exception {
        helper.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        helper.tearDown();
    }

    public static void linkTwitterTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

    public static void linkBlogPostTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

}

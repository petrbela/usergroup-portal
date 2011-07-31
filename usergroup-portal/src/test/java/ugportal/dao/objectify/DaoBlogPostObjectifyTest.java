/**
 * DaoBlogPostObjectifyTest.java, 31.7.2011 12:38:50 
 */
package ugportal.dao.objectify;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import com.google.appengine.api.datastore.Link;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

/**
 * @author Tomas
 */
public class DaoBlogPostObjectifyTest {

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

    public static void dateTestCondition(Date a, Date b) {
        Assert.assertEquals(a, b);
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void titleTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void descriptionTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void linkTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

    public static void authorTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void authorLinkTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

}

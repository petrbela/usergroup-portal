/**
 * DaoUserGroupObjectifyTest.java, 25.7.2011 18:57:46 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.model.UserGroup;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

/**
 * @author Tomas
 */
public class DaoUserGroupObjectifyTest {

    // private final LocalServiceTestHelper helper = new
    // LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());

    static {
        // ObjectifyService.register(UserGroup.class);
    }

    @Before
    public void setUp() throws Exception {
        // helper.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        // helper.tearDown();
    }

    @Test
    public void testGet() {
        // UserGroup userGroup = new UserGroup();
        // userGroup.setName("Java-Ostrava");
        // Objectify objectify = ObjectifyService.begin();
        // objectify.put(userGroup);
        // UserGroup us =
        // DaoFactoryObjectify.getInstance().getDaoUserGroup().get(userGroup.getId());
        // Assert.assertEquals(us, userGroup);
    }
}

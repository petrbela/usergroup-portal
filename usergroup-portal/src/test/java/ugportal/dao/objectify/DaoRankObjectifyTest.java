/**
 * DaoRankObjectifyTest.java, 30.7.2011 12:13:33 
 */
package ugportal.dao.objectify;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;

import ugportal.LocalDataStoreInitializer;

/**
 * @author Tomas
 */
public class DaoRankObjectifyTest {

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

    public static void labelTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

}

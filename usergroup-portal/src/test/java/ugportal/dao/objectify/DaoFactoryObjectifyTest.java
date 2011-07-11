/**
 * DaoFactoryObjectifyTest.java, 11.7.2011 13:12:13 
 */
package ugportal.dao.objectify;

import static org.junit.Assert.*;

import org.junit.Test;

import ugportal.dao.DaoUserGroup;

/**
 * Test for {@link DaoFactoryObjectifyTest}.
 * 
 * @author Ondrej Kvasnovsky
 */
public class DaoFactoryObjectifyTest {

    /**
     * Test method for
     * {@link ugportal.dao.objectify.DaoFactoryObjectify#getDaoUserGroup()}.
     */
    @Test
    public void testGetDaoUserGroup() {
        DaoFactoryObjectify dao = new DaoFactoryObjectify();
        DaoUserGroup daoUserGroup = dao.getDaoUserGroup();
        assertNotNull(daoUserGroup);
    }

}

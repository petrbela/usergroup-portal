/**
 * DaoFactoryTest.java, 11.7.2011 13:07:56 
 */
package ugportal.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ugportal.model.Invitation;

/**
 * Test for {@link DaoFactory}.
 * 
 * @author Ondrej Kvasnovsky
 */
public class DaoFactoryTest {

    private DaoFactory daoFactory;

    /**
     * Setup method.
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.daoFactory = Mockito.mock(DaoFactory.class);
    }

    /**
     * Test method for {@link ugportal.dao.DaoFactory#getInstance()}.
     */
    @Test
    public void testGetInstance() {
        DaoFactory instance = this.daoFactory.getInstance();
        assertNotNull(instance);
    }

}

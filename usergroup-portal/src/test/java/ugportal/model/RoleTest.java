/**
 * RoleTest.java, Jun 26, 2011 1:19:46 PM 
 */
package ugportal.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ondrej Kvasnovsky
 */
public class RoleTest {
    private Role testRole;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testRole = new Role();
    }

    /**
     * Test method for {@link ugportal.model.Role#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "ID001";
        this.testRole.setId(id);
        Assert.assertEquals(id, this.testRole.getId());
    }

    /**
     * Test method for {@link ugportal.model.Role#getLabel()}.
     */
    @Test
    public final void testGetLabel() {
        String label = "Admin";
        this.testRole.setLabel(label);
        Assert.assertEquals(label, this.testRole.getLabel());
    }

    /**
     * Test method for {@link ugportal.model.Role#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "ID001";
        this.testRole.setId(id);
        Assert.assertEquals(id, this.testRole.getId());
    }

    /**
     * Test method for {@link ugportal.model.Role#setLabel(java.lang.String)}.
     */
    @Test
    public final void testSetLabel() {
        String label = "Admin";
        this.testRole.setLabel(label);
        Assert.assertEquals(label, this.testRole.getLabel());
    }

}

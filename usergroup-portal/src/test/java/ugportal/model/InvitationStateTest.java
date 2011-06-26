/**
 * InvitationStateTest.java, Jun 26, 2011 1:21:06 PM 
 */
package ugportal.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ondrej Kvasnovsky
 */
public class InvitationStateTest {

    private InvitationState testInvitationState;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testInvitationState = new InvitationState();
    }

    /**
     * Test method for {@link ugportal.model.InvitationState#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "ID001";
        this.testInvitationState.setId(id);
        Assert.assertEquals(id, this.testInvitationState.getId());
    }

    /**
     * Test method for {@link ugportal.model.InvitationState#getLabel()}.
     */
    @Test
    public final void testGetLabel() {
        String label = "Leader";
        this.testInvitationState.setLabel(label);
        Assert.assertEquals(label, this.testInvitationState.getLabel());
    }

    /**
     * Test method for
     * {@link ugportal.model.InvitationState#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "ID001";
        this.testInvitationState.setId(id);
        Assert.assertEquals(id, this.testInvitationState.getId());
    }

    /**
     * Test method for
     * {@link ugportal.model.InvitationState#setLabel(java.lang.String)}.
     */
    @Test
    public final void testSetLabel() {
        String label = "Leader";
        this.testInvitationState.setLabel(label);
        Assert.assertEquals(label, this.testInvitationState.getLabel());
    }

}

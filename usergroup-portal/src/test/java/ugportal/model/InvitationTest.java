/**
 * InvitationTest.java, Jun 26, 2011 1:24:17 PM 
 */
package ugportal.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ondrej Kvasnovsky
 */
public class InvitationTest {

    private Invitation testInvitation;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testInvitation = new Invitation();
    }

    /**
     * Test method for {@link ugportal.model.Invitation#getId()}.
     */
    @Test
    public final void testSetId() {
        Long id = 564684l;
        this.testInvitation.setId(id);
        Assert.assertEquals(id, this.testInvitation.getId());
    }

    /**
     * Test method for {@link ugportal.model.Invitation#getInvitedByUser()}.
     */
    @Test
    public final void testGetInvitedByUser() {
        User invitedByUser = new User();
        this.testInvitation.setInvitedByUser(invitedByUser);
        Assert.assertEquals(invitedByUser, this.testInvitation.getInvitedByUser());
    }

    /**
     * Test method for {@link ugportal.model.Invitation#getRegisteredUser()}.
     */
    @Test
    public final void testGetRegisteredUser() {
        User registeredUser = new User();
        this.testInvitation.setRegisteredUser(registeredUser);
        Assert.assertEquals(registeredUser, this.testInvitation.getRegisteredUser());
    }

    /**
     * Test method for
     * {@link ugportal.model.Invitation#setInvitedByUser(ugportal.model.User)}.
     */
    @Test
    public final void testSetInvitedByUser() {
        User invitedByUser = new User();
        this.testInvitation.setInvitedByUser(invitedByUser);
        Assert.assertEquals(invitedByUser, this.testInvitation.getInvitedByUser());
    }

    /**
     * Test method for
     * {@link ugportal.model.Invitation#setRegisteredUser(ugportal.model.User)}.
     */
    @Test
    public final void testSetRegisteredUser() {
        User registeredUser = new User();
        this.testInvitation.setRegisteredUser(registeredUser);
        Assert.assertEquals(registeredUser, this.testInvitation.getRegisteredUser());
    }

}

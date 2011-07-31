/**
 * InvitationTest.java, Jun 26, 2011 1:24:17 PM 
 */
package ugportal.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.dao.objectify.DaoInvitationObjectifyTest;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

/**
 * @author Ondrej Kvasnovsky
 */
public class InvitationTest {

    private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());

    @Before
    public void setUp() throws Exception {
        helper.setUp();
        this.testInvitation = new Invitation();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        helper.tearDown();
    }

    private Invitation testInvitation;

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
        invitedByUser.setRank(new Rank());
        this.testInvitation.setInvitedByUser(invitedByUser);
        DaoInvitationObjectifyTest.invitedByUserTestCondition(invitedByUser, this.testInvitation.getInvitedByUser());
    }

    /**
     * Test method for {@link ugportal.model.Invitation#getRegisteredUser()}.
     */
    @Test
    public final void testGetRegisteredUser() {
        User registeredUser = new User();
        registeredUser.setRank(new Rank());
        this.testInvitation.setRegisteredUser(registeredUser);
        DaoInvitationObjectifyTest.registeredUserTestCondition(registeredUser, this.testInvitation.getRegisteredUser());
    }

    /**
     * Test method for
     * {@link ugportal.model.Invitation#setInvitedByUser(ugportal.model.User)}.
     */
    @Test
    public final void testSetInvitedByUser() {
        User invitedByUser = new User();
        invitedByUser.setRank(new Rank());
        this.testInvitation.setInvitedByUser(invitedByUser);
        DaoInvitationObjectifyTest.invitedByUserTestCondition(invitedByUser, this.testInvitation.getInvitedByUser());
    }

    /**
     * Test method for
     * {@link ugportal.model.Invitation#setRegisteredUser(ugportal.model.User)}.
     */
    @Test
    public final void testSetRegisteredUser() {
        User registeredUser = new User();
        registeredUser.setRank(new Rank());
        this.testInvitation.setRegisteredUser(registeredUser);
        DaoInvitationObjectifyTest.registeredUserTestCondition(registeredUser, this.testInvitation.getRegisteredUser());
    }

}

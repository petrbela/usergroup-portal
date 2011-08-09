/**
 * DaoInvitationStateObjectifyTest.java, 8.8.2011 18:44:26 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.InvitationState;

import com.googlecode.objectify.Key;

/**
 * @author Tomas
 */
public class DaoInvitationStateObjectifyTest {

    private final DaoInvitationStateObjectify daoInvitationStateObjectify = (DaoInvitationStateObjectify) DaoFactory
            .getInstance().getDaoInvitationState();

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

    @Test
    public void testGetById() {

        InvitationState invitationState = getOneInvitationState();

        this.daoInvitationStateObjectify.put(invitationState);

        InvitationState invitationState2 = this.daoInvitationStateObjectify.getById(invitationState.getId());

        idTestCondition(invitationState.getId(), invitationState2.getId());
        labelTestCondition(invitationState.getLabel(), invitationState2.getLabel());

        this.daoInvitationStateObjectify.delete(invitationState);

    }

    @Test
    public void testGetByLabel() {

        InvitationState invitationState = getOneInvitationState();

        this.daoInvitationStateObjectify.put(invitationState);

        InvitationState invitationState2 = this.daoInvitationStateObjectify.getByLabel(invitationState.getLabel()).get(
                0);

        idTestCondition(invitationState.getId(), invitationState2.getId());
        labelTestCondition(invitationState.getLabel(), invitationState2.getLabel());

        this.daoInvitationStateObjectify.delete(invitationState);

    }

    @Test
    public void testGet() {

        InvitationState invitationState = getOneInvitationState();

        Key<InvitationState> key = this.daoInvitationStateObjectify.put(invitationState);

        InvitationState invitationState2 = this.daoInvitationStateObjectify.get(key);

        idTestCondition(invitationState.getId(), invitationState2.getId());
        labelTestCondition(invitationState.getLabel(), invitationState2.getLabel());

        this.daoInvitationStateObjectify.delete(invitationState);

    }

    @Test
    public void testPut() {

        InvitationState invitationState = getOneInvitationState();

        Key<InvitationState> key = this.daoInvitationStateObjectify.put(invitationState);

        InvitationState invitationState2 = this.daoInvitationStateObjectify.get(key);

        idTestCondition(invitationState.getId(), invitationState2.getId());
        labelTestCondition(invitationState.getLabel(), invitationState2.getLabel());

        this.daoInvitationStateObjectify.delete(invitationState);

    }

    @Test
    public void testDelete() {

        InvitationState invitationState = getOneInvitationState();

        Key<InvitationState> key = this.daoInvitationStateObjectify.put(invitationState);

        InvitationState invitationState2 = this.daoInvitationStateObjectify.get(key);
        Assert.assertNotNull(invitationState2);

        this.daoInvitationStateObjectify.delete(invitationState);
        invitationState2 = this.daoInvitationStateObjectify.get(key);
        Assert.assertNull(invitationState2);

        invitationState2 = this.daoInvitationStateObjectify.getById(invitationState.getId());
        Assert.assertNull(invitationState2);

    }

    public static InvitationState getOneInvitationState() {
        InvitationState invitationState = new InvitationState();
        invitationState.setLabel("new label");
        return invitationState;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void labelTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

}

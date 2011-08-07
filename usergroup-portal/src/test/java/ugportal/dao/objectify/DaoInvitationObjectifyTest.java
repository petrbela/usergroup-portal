/**
 * DaoInvitationObjectifyTest.java, 31.7.2011 12:37:31 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.Invitation;
import ugportal.model.User;

import com.googlecode.objectify.Key;

/**
 * @author Tomas
 */
public class DaoInvitationObjectifyTest {

    private final DaoInvitationObjectify daoInvitationObjectify = (DaoInvitationObjectify) DaoFactory.getInstance()
            .getDaoInvitation();

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
        Invitation invitation = getOneInvitation();
        this.daoInvitationObjectify.put(invitation);

        Invitation invitation2 = this.daoInvitationObjectify.getById(invitation.getId());

        idTestCondition(invitation.getId(), invitation2.getId());
        invitedByUserTestCondition(invitation.getInvitedByUser(), invitation2.getInvitedByUser());
        registeredUserTestCondition(invitation.getRegisteredUser(), invitation2.getRegisteredUser());
    }

    @Test
    public void testDelete() {
        Invitation invitation = getOneInvitation();
        this.daoInvitationObjectify.put(invitation);

        Invitation invitation2 = this.daoInvitationObjectify.getById(invitation.getId());

        this.daoInvitationObjectify.delete(invitation);

        invitation2 = this.daoInvitationObjectify.getById(invitation.getId());

        Assert.assertNull(invitation2);
    }

    @Test
    public void testGetByRegistereduser() {
        Invitation invitation = getOneInvitation();
        this.daoInvitationObjectify.put(invitation);

        Invitation invitation2 = this.daoInvitationObjectify.getByRegisteredUser(invitation.getRegisteredUser()).get(0);

        idTestCondition(invitation.getId(), invitation2.getId());
        invitedByUserTestCondition(invitation.getInvitedByUser(), invitation2.getInvitedByUser());
        registeredUserTestCondition(invitation.getRegisteredUser(), invitation2.getRegisteredUser());
    }

    @Test
    public void testGetByInviteduser() {
        Invitation invitation = getOneInvitation();
        this.daoInvitationObjectify.put(invitation);

        Invitation invitation2 = this.daoInvitationObjectify.getByInvitatedUser(invitation.getInvitedByUser()).get(0);

        idTestCondition(invitation.getId(), invitation2.getId());
        invitedByUserTestCondition(invitation.getInvitedByUser(), invitation2.getInvitedByUser());
        registeredUserTestCondition(invitation.getRegisteredUser(), invitation2.getRegisteredUser());
    }

    @Test
    public void testGetAllByKeys() {
        List<Invitation> invitations = new ArrayList<Invitation>();
        invitations.add(getOneInvitation());
        invitations.add(getOneInvitation());
        invitations.add(getOneInvitation());

        List<Key<Invitation>> keys = this.daoInvitationObjectify.putAll(invitations);

        List<Invitation> invitations2 = this.daoInvitationObjectify.getAllByKeys(keys);

        for (Invitation invitation : invitations) {
            Invitation invitation2 = invitations2.get(invitations.indexOf(invitation));

            idTestCondition(invitation.getId(), invitation2.getId());
            invitedByUserTestCondition(invitation.getInvitedByUser(), invitation2.getInvitedByUser());
            registeredUserTestCondition(invitation.getRegisteredUser(), invitation2.getRegisteredUser());
        }
    }

    @Test
    public void testPutAll() {
        List<Invitation> invitations = new ArrayList<Invitation>();
        invitations.add(getOneInvitation());
        invitations.add(getOneInvitation());
        invitations.add(getOneInvitation());

        List<Key<Invitation>> keys = this.daoInvitationObjectify.putAll(invitations);

        List<Invitation> invitations2 = this.daoInvitationObjectify.getAllByKeys(keys);

        for (Invitation invitation : invitations) {
            Invitation invitation2 = invitations2.get(invitations.indexOf(invitation));

            idTestCondition(invitation.getId(), invitation2.getId());
            invitedByUserTestCondition(invitation.getInvitedByUser(), invitation2.getInvitedByUser());
            registeredUserTestCondition(invitation.getRegisteredUser(), invitation2.getRegisteredUser());
        }
    }

    public static Invitation getOneInvitation() {
        Invitation invitation = new Invitation();
        invitation.setInvitedByUser(DaoUserObjectifyTest.getOneUser());
        invitation.setRegisteredUser(DaoUserObjectifyTest.getOneUser());
        return invitation;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void invitedByUserTestCondition(User a, User b) {
        DaoUserObjectifyTest.idTestCondition(a.getId(), b.getId());
        DaoUserObjectifyTest.firstNameTestCondition(a.getFirstname(), b.getFirstname());
        DaoUserObjectifyTest.surNameTestCondition(a.getSurname(), b.getSurname());
        DaoUserObjectifyTest.emailTestCondition(a.getEmail(), b.getEmail());
        DaoUserObjectifyTest.roleTestCondition(a.getRole(), b.getRole());
        DaoUserObjectifyTest.passwordTestCondition(a.getPassword(), b.getPassword());
        DaoUserObjectifyTest.rankTestCondition(a.getRank(), b.getRank());
        DaoUserObjectifyTest.photoTestCondition(a.getPhoto(), b.getPhoto());
        DaoUserObjectifyTest.visibleNameTestCondition(a.getVisibleName(), b.getVisibleName());
    }

    public static void registeredUserTestCondition(User a, User b) {
        DaoUserObjectifyTest.idTestCondition(a.getId(), b.getId());
        DaoUserObjectifyTest.firstNameTestCondition(a.getFirstname(), b.getFirstname());
        DaoUserObjectifyTest.surNameTestCondition(a.getSurname(), b.getSurname());
        DaoUserObjectifyTest.emailTestCondition(a.getEmail(), b.getEmail());
        DaoUserObjectifyTest.roleTestCondition(a.getRole(), b.getRole());
        DaoUserObjectifyTest.passwordTestCondition(a.getPassword(), b.getPassword());
        DaoUserObjectifyTest.rankTestCondition(a.getRank(), b.getRank());
        DaoUserObjectifyTest.photoTestCondition(a.getPhoto(), b.getPhoto());
        DaoUserObjectifyTest.visibleNameTestCondition(a.getVisibleName(), b.getVisibleName());
    }

}

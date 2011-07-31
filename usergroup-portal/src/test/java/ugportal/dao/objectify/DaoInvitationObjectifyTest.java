/**
 * DaoInvitationObjectifyTest.java, 31.7.2011 12:37:31 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import ugportal.model.User;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

/**
 * @author Tomas
 */
public class DaoInvitationObjectifyTest {

    private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());

    @Before
    public void setUp() throws Exception {
        helper.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        helper.tearDown();
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

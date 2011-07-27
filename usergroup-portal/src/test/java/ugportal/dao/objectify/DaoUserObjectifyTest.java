/**
 * DaoUserObjectifyTest.java, 26.7.2011 21:50:01 
 */
package ugportal.dao.objectify;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.model.Rank;
import ugportal.model.Role;
import ugportal.model.User;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Email;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

/**
 * @author Tomas Vantuch
 */
public class DaoUserObjectifyTest {

    private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());
    private final DaoUserObjectify duo = (DaoUserObjectify) DaoFactoryObjectify.getInstance().getDaoUser();

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

    @Test
    public void testGetById() {
        User user = new User();
        user.setEmail(new Email("stevejobs@seznam.cz"));
        user.setFirstname("Steve");
        user.setSurname("Jobs");
        user.setPassword("jabko");
        DaoFactoryObjectify.getInstance().getDaoUser().persist(user);
        User user1 = DaoFactoryObjectify.getInstance().getDaoUser().getById(user.getId());

        idTestCondition(user.getId(), user1.getId());
        firstNameTestCondition(user.getFirstname(), user1.getFirstname());
        surNameTestCondition(user.getSurname(), user1.getSurname());
        emailTestCondition(user.getEmail(), user1.getEmail());
        roleTestCondition(user.getRole(), user1.getRole());
        passwordTestCondition(user.getPassword(), user1.getPassword());
        rankTestCondition(user.getRank(), user1.getRank());
        photoTestCondition(user.getPhoto(), user1.getPhoto());
        visibleNameTestCondition(user.getVisibleName(), user1.getVisibleName());
    }

    @Test
    public void testPersist() {

        User user1 = new User();
        user1.setEmail(new Email("billgates@seznam.cz"));
        user1.setFirstname("Bill");
        user1.setSurname("Gates");
        user1.setPassword("vokna");
        this.duo.persist(user1);

        User user2 = new User();
        user2.setEmail(new Email("stevejobs@seznam.cz"));
        user2.setFirstname("Steve");
        user2.setSurname("Jobs");
        user2.setPassword("jabko");
        this.duo.persist(user2);

        User user11 = this.duo.getById(user1.getId());
        User user22 = this.duo.getById(user2.getId());

        idTestCondition(user1.getId(), user11.getId());
        idTestCondition(user2.getId(), user22.getId());

        firstNameTestCondition(user1.getFirstname(), user11.getFirstname());
        firstNameTestCondition(user2.getFirstname(), user22.getFirstname());

        surNameTestCondition(user1.getSurname(), user11.getSurname());
        surNameTestCondition(user2.getSurname(), user22.getSurname());

        emailTestCondition(user1.getEmail(), user11.getEmail());
        emailTestCondition(user2.getEmail(), user22.getEmail());

        roleTestCondition(user1.getRole(), user11.getRole());
        roleTestCondition(user2.getRole(), user22.getRole());

        rankTestCondition(user1.getRank(), user11.getRank());
        rankTestCondition(user2.getRank(), user22.getRank());

        visibleNameTestCondition(user1.getVisibleName(), user11.getVisibleName());
        visibleNameTestCondition(user2.getVisibleName(), user22.getVisibleName());

        photoTestCondition(user1.getPhoto(), user11.getPhoto());
        photoTestCondition(user2.getPhoto(), user22.getPhoto());

        passwordTestCondition(user1.getPassword(), user11.getPassword());
        passwordTestCondition(user2.getPassword(), user22.getPassword());

    }

    @Test
    public void testGetByMail() {
        User user1 = new User();
        user1.setEmail(new Email("mail1@seznam.cz"));
        user1.setFirstname("Bill");
        user1.setSurname("Gates");
        user1.setPassword("vokna");
        this.duo.persist(user1);

        User user2 = new User();
        user2.setEmail(new Email("mail1@seznam.cz"));
        user2.setFirstname("Steve");
        user2.setSurname("Jobs");
        user2.setPassword("jabko");
        this.duo.persist(user2);

        List<User> users = this.duo.getByEmail(new Email("mail1@seznam.cz"));

        idTestCondition(user1.getId(), users.get(0).getId());
        idTestCondition(user2.getId(), users.get(1).getId());

        firstNameTestCondition(user1.getFirstname(), users.get(0).getFirstname());
        firstNameTestCondition(user2.getFirstname(), users.get(1).getFirstname());

        surNameTestCondition(user1.getSurname(), users.get(0).getSurname());
        surNameTestCondition(user2.getSurname(), users.get(1).getSurname());

        emailTestCondition(user1.getEmail(), users.get(0).getEmail());
        emailTestCondition(user2.getEmail(), users.get(1).getEmail());

        roleTestCondition(user1.getRole(), users.get(0).getRole());
        roleTestCondition(user2.getRole(), users.get(1).getRole());

        rankTestCondition(user1.getRank(), users.get(0).getRank());
        rankTestCondition(user2.getRank(), users.get(1).getRank());

        visibleNameTestCondition(user1.getVisibleName(), users.get(0).getVisibleName());
        visibleNameTestCondition(user2.getVisibleName(), users.get(1).getVisibleName());

        photoTestCondition(user1.getPhoto(), users.get(0).getPhoto());
        photoTestCondition(user2.getPhoto(), users.get(1).getPhoto());

        passwordTestCondition(user1.getPassword(), users.get(0).getPassword());
        passwordTestCondition(user2.getPassword(), users.get(1).getPassword());
    }

    @Test
    public void testGetByName() {
        User user = new User();
        user.setEmail(new Email("stevejobs@seznam.cz"));
        user.setFirstname("Steve");
        user.setSurname("Jobs");
        user.setPassword("jabko");

        this.duo.persist(user);

        List<User> users1 = this.duo.getByName("Steve", null);
        List<User> users2 = this.duo.getByName(null, "Jobs");
        List<User> users3 = this.duo.getByName("Steve", "Jobs");

        idTestCondition(user.getId(), users1.get(0).getId());
        idTestCondition(user.getId(), users2.get(0).getId());
        idTestCondition(user.getId(), users3.get(0).getId());

        firstNameTestCondition(user.getFirstname(), users1.get(0).getFirstname());
        firstNameTestCondition(user.getFirstname(), users2.get(0).getFirstname());
        firstNameTestCondition(user.getFirstname(), users3.get(0).getFirstname());

        surNameTestCondition(user.getSurname(), users1.get(0).getSurname());
        surNameTestCondition(user.getSurname(), users2.get(0).getSurname());
        surNameTestCondition(user.getSurname(), users3.get(0).getSurname());

        emailTestCondition(user.getEmail(), users1.get(0).getEmail());
        emailTestCondition(user.getEmail(), users2.get(0).getEmail());
        emailTestCondition(user.getEmail(), users3.get(0).getEmail());

        roleTestCondition(user.getRole(), users1.get(0).getRole());
        roleTestCondition(user.getRole(), users2.get(0).getRole());
        roleTestCondition(user.getRole(), users3.get(0).getRole());

        rankTestCondition(user.getRank(), users1.get(0).getRank());
        rankTestCondition(user.getRank(), users2.get(0).getRank());
        rankTestCondition(user.getRank(), users3.get(0).getRank());

        visibleNameTestCondition(user.getVisibleName(), users1.get(0).getVisibleName());
        visibleNameTestCondition(user.getVisibleName(), users2.get(0).getVisibleName());
        visibleNameTestCondition(user.getVisibleName(), users3.get(0).getVisibleName());

        photoTestCondition(user.getPhoto(), users1.get(0).getPhoto());
        photoTestCondition(user.getPhoto(), users2.get(0).getPhoto());
        photoTestCondition(user.getPhoto(), users3.get(0).getPhoto());

        passwordTestCondition(user.getPassword(), users1.get(0).getPassword());
        passwordTestCondition(user.getPassword(), users2.get(0).getPassword());
        passwordTestCondition(user.getPassword(), users3.get(0).getPassword());
    }

    private void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    private void firstNameTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    private void surNameTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    private void passwordTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    private void photoTestCondition(Blob a, Blob b) {
        Assert.assertEquals(a, b);
    }

    private void emailTestCondition(Email a, Email b) {
        Assert.assertEquals(a, b);
    }

    private void roleTestCondition(Role a, Role b) {
        Assert.assertEquals(a, b);
    }

    private void visibleNameTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    private void rankTestCondition(Rank a, Rank b) {
        Assert.assertEquals(a, b);
    }
}

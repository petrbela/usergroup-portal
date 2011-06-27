/**
 * UserTest.java, Jun 26, 2011 12:48:40 PM 
 */
package ugportal.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Email;

/**
 * Test for {@link User}.
 * 
 * @author Ondrej Kvasnovsky
 */
public class UserTest {

    private User testUser;

    /**
     * Set up test data.
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testUser = new User();
    }

    /**
     * Test method for {@link ugportal.model.User#getEmail()}.
     */
    @Test
    public final void testGetEmail() {
        Email email = new Email("");
        this.testUser.setEmail(email);
        Assert.assertEquals(email, this.testUser.getEmail());
    }

    /**
     * Test method for {@link ugportal.model.User#getFirstname()}.
     */
    @Test
    public final void testGetFirstname() {
        String firstname = "John";
        this.testUser.setFirstname(firstname);
        Assert.assertEquals(firstname, this.testUser.getFirstname());
    }

    /**
     * Test method for {@link ugportal.model.User#getId()}.
     */
    @Test
    public final void testGetId() {
        String id = "JF001";
        this.testUser.setId(id);
        Assert.assertEquals(id, this.testUser.getId());
    }

    /**
     * Test method for {@link ugportal.model.User#getPassword()}.
     */
    @Test
    public final void testGetPassword() {
        String password = "password";
        this.testUser.setPassword(password);
        Assert.assertEquals(password, this.testUser.getPassword());
    }

    /**
     * Test method for {@link ugportal.model.User#getPhoto()}.
     */
    @Test
    public final void testGetPhoto() {
        byte[] bytes = {};
        Blob photo = new Blob(bytes);
        this.testUser.setPhoto(photo);
        Assert.assertEquals(photo, this.testUser.getPhoto());
    }

    /**
     * Test method for {@link ugportal.model.User#getRank()}.
     */
    @Test
    public final void testGetRank() {
        Rank rank = new Rank();
        this.testUser.setRank(rank);
        Assert.assertEquals(rank, this.testUser.getRank());
    }

    /**
     * Test method for {@link ugportal.model.User#getRole()}.
     */
    @Test
    public final void testGetRole() {
        Role role = new Role();
        this.testUser.setRole(role);
        Assert.assertEquals(role, this.testUser.getRole());
    }

    /**
     * Test method for {@link ugportal.model.User#getSurname()}.
     */
    @Test
    public final void testGetSurname() {
        String surname = "Felety";
        this.testUser.setSurname(surname);
        Assert.assertEquals(surname, this.testUser.getSurname());
    }

    /**
     * Test method for {@link ugportal.model.User#getVisibleName()}.
     */
    @Test
    public final void testGetVisibleName() {
        String visibleName = "JohnF";
        this.testUser.setVisibleName(visibleName);
        Assert.assertEquals(visibleName, this.testUser.getVisibleName());
    }

    /**
     * Test method for
     * {@link ugportal.model.User#setEmail(com.google.appengine.api.datastore.Email)}
     * .
     */
    @Test
    public final void testSetEmail() {
        Email email = new Email("");
        this.testUser.setEmail(email);
        Assert.assertEquals(email, this.testUser.getEmail());
    }

    /**
     * Test method for
     * {@link ugportal.model.User#setFirstname(java.lang.String)}.
     */
    @Test
    public final void testSetFirstname() {
        String firstname = "John";
        this.testUser.setFirstname(firstname);
        Assert.assertEquals(firstname, this.testUser.getFirstname());
    }

    /**
     * Test method for {@link ugportal.model.User#setId(java.lang.String)}.
     */
    @Test
    public final void testSetId() {
        String id = "JF001";
        this.testUser.setId(id);
        Assert.assertEquals(id, this.testUser.getId());
    }

    /**
     * Test method for {@link ugportal.model.User#setPassword(java.lang.String)}
     * .
     */
    @Test
    public final void testSetPassword() {
        String password = "password";
        this.testUser.setPassword(password);
        Assert.assertEquals(password, this.testUser.getPassword());
    }

    /**
     * Test method for
     * {@link ugportal.model.User#setPhoto(com.google.appengine.api.datastore.Blob)}
     * .
     */
    @Test
    public final void testSetPhoto() {
        byte[] bytes = {};
        Blob photo = new Blob(bytes);
        this.testUser.setPhoto(photo);
        Assert.assertEquals(photo, this.testUser.getPhoto());
    }

    /**
     * Test method for {@link ugportal.model.User#setRank(ugportal.model.Rank)}.
     */
    @Test
    public final void testSetRank() {
        Rank rank = new Rank();
        this.testUser.setRank(rank);
        Assert.assertEquals(rank, this.testUser.getRank());
    }

    /**
     * Test method for {@link ugportal.model.User#setRole(ugportal.model.Role)}.
     */
    @Test
    public final void testSetRole() {
        Role role = new Role();
        this.testUser.setRole(role);
        Assert.assertEquals(role, this.testUser.getRole());
    }

    /**
     * Test method for {@link ugportal.model.User#setSurname(java.lang.String)}.
     */
    @Test
    public final void testSetSurname() {
        String surname = "Felety";
        this.testUser.setSurname(surname);
        Assert.assertEquals(surname, this.testUser.getSurname());
    }

    /**
     * Test method for
     * {@link ugportal.model.User#setVisibleName(java.lang.String)}.
     */
    @Test
    public final void testSetVisibleName() {
        String visibleName = "JohnF";
        this.testUser.setVisibleName(visibleName);
        Assert.assertEquals(visibleName, this.testUser.getVisibleName());
    }

}

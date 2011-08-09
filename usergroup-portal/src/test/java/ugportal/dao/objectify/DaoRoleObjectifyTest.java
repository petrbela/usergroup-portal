/**
 * DaoRoleObjectifyTest.java, 8.8.2011 18:25:02 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.Role;

import com.googlecode.objectify.Key;

/**
 * @author Tomas Vantuch
 */
public class DaoRoleObjectifyTest {

    private final DaoRoleObjectify daoRoleObjectify = (DaoRoleObjectify) DaoFactory.getInstance().getDaoRole();

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
    public void testPut() {

        Role role = getOneRole();

        Key<Role> key = this.daoRoleObjectify.put(role);

        Role role2 = this.daoRoleObjectify.get(key);

        idTestCondition(role.getId(), role2.getId());
        labelTestCondition(role.getLabel(), role2.getLabel());

        this.daoRoleObjectify.delete(role);

    }

    @Test
    public void testGetById() {

        Role role = getOneRole();

        this.daoRoleObjectify.put(role);

        Role role2 = this.daoRoleObjectify.getById(role.getId());

        idTestCondition(role.getId(), role2.getId());
        labelTestCondition(role.getLabel(), role2.getLabel());

        this.daoRoleObjectify.delete(role);

    }

    @Test
    public void testGetByLabel() {

        Role role = getOneRole();

        this.daoRoleObjectify.put(role);

        Role role2 = this.daoRoleObjectify.getByLabel(role.getLabel()).get(0);

        idTestCondition(role.getId(), role2.getId());
        labelTestCondition(role.getLabel(), role2.getLabel());

        this.daoRoleObjectify.delete(role);

    }

    @Test
    public void testGet() {

        Role role = getOneRole();

        Key<Role> key = this.daoRoleObjectify.put(role);

        Role role2 = this.daoRoleObjectify.get(key);

        idTestCondition(role.getId(), role2.getId());
        labelTestCondition(role.getLabel(), role2.getLabel());

        this.daoRoleObjectify.delete(role);

    }

    @Test
    public void testDelete() {

        Role role = getOneRole();

        Key<Role> key = this.daoRoleObjectify.put(role);

        Role role2 = this.daoRoleObjectify.get(key);

        this.daoRoleObjectify.delete(role);
        Assert.assertNotNull(role2);
        role2 = this.daoRoleObjectify.get(key);
        Assert.assertNull(role2);
        role2 = this.daoRoleObjectify.getById(role.getId());
        Assert.assertNull(role2);
    }

    public static Role getOneRole() {
        Role role = new Role();
        role.setLabel("new label");
        return role;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void labelTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

}

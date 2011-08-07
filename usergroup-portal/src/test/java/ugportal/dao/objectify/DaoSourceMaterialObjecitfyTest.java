/**
 * DaoSourceMaterialObjecitfyTest.java, 7.8.2011 16:15:03 
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
import ugportal.model.SourceMaterial;

import com.google.appengine.api.datastore.Link;
import com.googlecode.objectify.Key;

/**
 * @author Tomas Vantuch
 */
public class DaoSourceMaterialObjecitfyTest {

    private final DaoSourceMaterialObjecitfy daoSourceMaterialObjecitfy = (DaoSourceMaterialObjecitfy) DaoFactory
            .getInstance().getDaoSourceMaterial();

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
        SourceMaterial material = getOneSourceMaterial();

        this.daoSourceMaterialObjecitfy.put(material);

        SourceMaterial material2 = this.daoSourceMaterialObjecitfy.getById(material.getId());

        idTestCondition(material.getId(), material2.getId());
        labelTestCondition(material.getLabel(), material2.getLabel());
        descriptionTestCondition(material.getDescription(), material2.getDescription());
        linkTestCondition(material.getLink(), material2.getLink());
    }

    @Test
    public void testDelete() {
        SourceMaterial material = getOneSourceMaterial();

        this.daoSourceMaterialObjecitfy.put(material);

        SourceMaterial material2 = this.daoSourceMaterialObjecitfy.getById(material.getId());

        this.daoSourceMaterialObjecitfy.delete(material);

        material2 = this.daoSourceMaterialObjecitfy.getById(material.getId());

        Assert.assertNull(material2);
    }

    @Test
    public void testPutAll() {
        List<SourceMaterial> materials = new ArrayList<SourceMaterial>();
        materials.add(getOneSourceMaterial());
        materials.add(getOneSourceMaterial());
        materials.add(getOneSourceMaterial());

        List<Key<SourceMaterial>> keys = this.daoSourceMaterialObjecitfy.putAll(materials);

        List<SourceMaterial> materials2 = this.daoSourceMaterialObjecitfy.getByAllKeys(keys);

        for (SourceMaterial material : materials) {
            SourceMaterial material2 = materials2.get(materials.indexOf(material));

            idTestCondition(material.getId(), material2.getId());
            labelTestCondition(material.getLabel(), material2.getLabel());
            descriptionTestCondition(material.getDescription(), material2.getDescription());
            linkTestCondition(material.getLink(), material2.getLink());
        }
    }

    @Test
    public void testGetAllByKeys() {
        List<SourceMaterial> materials = new ArrayList<SourceMaterial>();
        materials.add(getOneSourceMaterial());
        materials.add(getOneSourceMaterial());
        materials.add(getOneSourceMaterial());

        List<Key<SourceMaterial>> keys = this.daoSourceMaterialObjecitfy.putAll(materials);

        List<SourceMaterial> materials2 = this.daoSourceMaterialObjecitfy.getByAllKeys(keys);

        for (SourceMaterial material : materials) {
            SourceMaterial material2 = materials2.get(materials.indexOf(material));

            idTestCondition(material.getId(), material2.getId());
            labelTestCondition(material.getLabel(), material2.getLabel());
            descriptionTestCondition(material.getDescription(), material2.getDescription());
            linkTestCondition(material.getLink(), material2.getLink());
        }
    }

    public static SourceMaterial getOneSourceMaterial() {
        SourceMaterial material = new SourceMaterial();
        material.setDescription("description");
        material.setLabel("label");
        material.setLink(new Link("www.google.com"));

        return material;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void labelTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void descriptionTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void linkTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

}

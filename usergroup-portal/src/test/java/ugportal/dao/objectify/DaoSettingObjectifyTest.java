/**
 * DaoSettingObjectifyTest.java, 30.7.2011 11:21:34 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.Blog;
import ugportal.model.Setting;

import com.google.appengine.api.datastore.Link;
import com.googlecode.objectify.Key;

/**
 * @author Tomas Vantuch
 */
public class DaoSettingObjectifyTest {

    private final DaoSettingObjectify daoSettingObjectify = (DaoSettingObjectify) DaoFactory.getInstance()
            .getDaoSetting();

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
    public void testGet() {

        Setting setting = getOneSetting();

        Key<Setting> key = this.daoSettingObjectify.put(setting);

        Setting setting2 = this.daoSettingObjectify.get(key);

        idTestCondition(setting.getId(), setting2.getId());
        linkBlogPostTestCondition(setting.getLinkBlogPost(), setting2.getLinkBlogPost());
        blogTestCondition(setting.getBlog(), setting2.getBlog());
        linkTwitterTestCondition(setting.getLinkTwitter(), setting2.getLinkTwitter());

        this.daoSettingObjectify.delete(setting);
    }

    @Test
    public void testPut() {

        Setting setting = getOneSetting();

        Key<Setting> key = this.daoSettingObjectify.put(setting);

        Setting setting2 = this.daoSettingObjectify.get(key);

        idTestCondition(setting.getId(), setting2.getId());
        linkBlogPostTestCondition(setting.getLinkBlogPost(), setting2.getLinkBlogPost());
        blogTestCondition(setting.getBlog(), setting2.getBlog());
        linkTwitterTestCondition(setting.getLinkTwitter(), setting2.getLinkTwitter());

        this.daoSettingObjectify.delete(setting);
    }

    @Test
    public void testGetById() {

        Setting setting = getOneSetting();

        this.daoSettingObjectify.put(setting);

        Setting setting2 = this.daoSettingObjectify.getById(setting.getId());

        idTestCondition(setting.getId(), setting2.getId());
        linkBlogPostTestCondition(setting.getLinkBlogPost(), setting2.getLinkBlogPost());
        blogTestCondition(setting.getBlog(), setting2.getBlog());
        linkTwitterTestCondition(setting.getLinkTwitter(), setting2.getLinkTwitter());

        this.daoSettingObjectify.delete(setting);
    }

    @Test
    public void testDelete() {

        Setting setting = getOneSetting();

        Key<Setting> key = this.daoSettingObjectify.put(setting);

        Setting setting2 = this.daoSettingObjectify.get(key);
        Assert.assertNotNull(setting2);

        this.daoSettingObjectify.delete(setting);
        setting2 = this.daoSettingObjectify.get(key);
        Assert.assertNull(setting2);
        setting2 = this.daoSettingObjectify.getById(setting.getId());
        Assert.assertNull(setting2);
    }

    public static Setting getOneSetting() {
        Setting setting = new Setting();
        setting.setBlog(DaoBlogObjectifyTest.getOneBlog());
        setting.setLinkBlogPost(new Link("www.blog.com"));
        setting.setLinkTwitter(new Link("www.twitter.com"));
        return setting;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void linkTwitterTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

    public static void linkBlogPostTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

    public static void blogTestCondition(Blog a, Blog b) {
        DaoBlogObjectifyTest.blogIddTestCondtion(a.getBlogId(), b.getBlogId());
        DaoBlogObjectifyTest.emailTestCondtion(a.getEmail(), b.getEmail());
        DaoBlogObjectifyTest.idTestCondtion(a.getId(), b.getId());
        DaoBlogObjectifyTest.passwordTestCondition(a.getPassword(), b.getPassword());
    }
}

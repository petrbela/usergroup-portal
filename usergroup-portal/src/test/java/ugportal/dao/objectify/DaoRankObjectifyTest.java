/**
 * DaoRankObjectifyTest.java, 30.7.2011 12:13:33 
 */
package ugportal.dao.objectify;

import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.Rank;

import com.googlecode.objectify.Key;

/**
 * @author Tomas
 */
public class DaoRankObjectifyTest {

    private final DaoRankObjectify daoRankObjectify = (DaoRankObjectify) DaoFactory.getInstance().getDaoRank();

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
        Rank rank = getOneRank();
        this.daoRankObjectify.put(rank);

        Rank rank2 = this.daoRankObjectify.getById(rank.getId());

        idTestCondition(rank.getId(), rank2.getId());
        labelTestCondition(rank.getLabel(), rank2.getLabel());

        this.daoRankObjectify.delete(rank);
    }

    @Test
    public void testGet() {
        Rank rank = getOneRank();
        Key<Rank> key = this.daoRankObjectify.put(rank);

        Rank rank2 = this.daoRankObjectify.get(key);

        idTestCondition(rank.getId(), rank2.getId());
        labelTestCondition(rank.getLabel(), rank2.getLabel());

        this.daoRankObjectify.delete(rank);
    }

    @Test
    public void testPut() {
        Rank rank = getOneRank();
        Key<Rank> key = this.daoRankObjectify.put(rank);

        Rank rank2 = this.daoRankObjectify.get(key);

        idTestCondition(rank.getId(), rank2.getId());
        labelTestCondition(rank.getLabel(), rank2.getLabel());

        this.daoRankObjectify.delete(rank);
    }

    @Test
    public void testGetLabel() {
        Rank rank = getOneRank();
        this.daoRankObjectify.put(rank);

        List<Rank> ranks = this.daoRankObjectify.getByLabel(rank.getLabel());

        idTestCondition(rank.getId(), ranks.get(0).getId());
        labelTestCondition(rank.getLabel(), ranks.get(0).getLabel());

        this.daoRankObjectify.delete(rank);
    }

    @Test
    public void testDelete() {
        Rank rank = getOneRank();
        Key<Rank> key = this.daoRankObjectify.put(rank);

        Rank rank2 = this.daoRankObjectify.get(key);
        Assert.assertNotNull(rank2);

        this.daoRankObjectify.delete(rank);

        rank2 = this.daoRankObjectify.get(key);
        Assert.assertNull(rank2);

        rank2 = this.daoRankObjectify.getById(rank.getId());
        Assert.assertNull(rank2);
    }

    /**
     * @return
     */
    public static Rank getOneRank() {
        Rank rank = new Rank();
        rank.setLabel("big boss");
        return rank;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void labelTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

}

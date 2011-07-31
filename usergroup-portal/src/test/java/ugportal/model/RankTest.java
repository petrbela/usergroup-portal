/**
 * RankTest.java, Jun 26, 2011 1:17:54 PM 
 */
package ugportal.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ondrej Kvasnovsky
 */
public class RankTest {

    private Rank testRank;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testRank = new Rank();
    }

    /**
     * Test method for {@link ugportal.model.Rank#getId()}.
     */
    @Test
    public final void testGetId() {
        Long id = 4582l;
        this.testRank.setId(id);
        Assert.assertEquals(id, this.testRank.getId());
    }

    /**
     * Test method for {@link ugportal.model.Rank#getLabel()}.
     */
    @Test
    public final void testGetLabel() {
        String label = "Leader";
        this.testRank.setLabel(label);
        Assert.assertEquals(label, this.testRank.getLabel());
    }

    /**
     * Test method for {@link ugportal.model.Rank#setLabel(java.lang.String)}.
     */
    @Test
    public final void testSetLabel() {
        String label = "Leader";
        this.testRank.setLabel(label);
        Assert.assertEquals(label, this.testRank.getLabel());
    }

}

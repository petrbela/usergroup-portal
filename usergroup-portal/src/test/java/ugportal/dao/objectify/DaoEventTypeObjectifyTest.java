/**
 * DaoEventTypeObjectifyTest.java, 8.8.2011 16:39:40 
 */
package ugportal.dao.objectify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.EventType;

import com.googlecode.objectify.Key;

/**
 * @author Tomas
 */
public class DaoEventTypeObjectifyTest {

    private final DaoEventTypeObjectify daoEventTypeObjectify = (DaoEventTypeObjectify) DaoFactory.getInstance()
            .getDaoEventType();

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

        EventType eventType = getOneEventType();

        this.daoEventTypeObjectify.put(eventType);

        EventType eventType2 = this.daoEventTypeObjectify.getById(eventType.getId());

        idTestCondition(eventType.getId(), eventType2.getId());
        labelTestCondition(eventType.getLabel(), eventType2.getLabel());

        this.daoEventTypeObjectify.delete(eventType);

    }

    @Test
    public void testGet() {

        EventType eventType = getOneEventType();

        Key<EventType> key = this.daoEventTypeObjectify.put(eventType);

        EventType eventType2 = this.daoEventTypeObjectify.get(key);

        idTestCondition(eventType.getId(), eventType2.getId());
        labelTestCondition(eventType.getLabel(), eventType2.getLabel());

        this.daoEventTypeObjectify.delete(eventType);

    }

    @Test
    public void testPut() {

        EventType eventType = getOneEventType();

        Key<EventType> key = this.daoEventTypeObjectify.put(eventType);

        EventType eventType2 = this.daoEventTypeObjectify.get(key);

        idTestCondition(eventType.getId(), eventType2.getId());
        labelTestCondition(eventType.getLabel(), eventType2.getLabel());

        this.daoEventTypeObjectify.delete(eventType);

    }

    @Test
    public void testDelete() {

        EventType eventType = getOneEventType();

        Key<EventType> key = this.daoEventTypeObjectify.put(eventType);

        EventType eventType2 = this.daoEventTypeObjectify.get(key);

        this.daoEventTypeObjectify.delete(eventType);

        eventType2 = this.daoEventTypeObjectify.get(key);
        Assert.assertNull(eventType2);
        eventType2 = this.daoEventTypeObjectify.getById(eventType.getId());
        Assert.assertNull(eventType2);

    }

    public static EventType getOneEventType() {
        EventType eventType = new EventType();
        eventType.setLabel("new label");
        return eventType;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void labelTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

}

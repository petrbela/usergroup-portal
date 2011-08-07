/**
 * DaoEventTest.java, 31.7.2011 17:28:58 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ugportal.LocalDataStoreInitializer;
import ugportal.dao.DaoFactory;
import ugportal.model.Event;
import ugportal.model.SourceMaterial;
import ugportal.model.User;

import com.google.appengine.api.datastore.Link;
import com.googlecode.objectify.Key;

/**
 * @author Tomas Vantuch
 */
public class DaoEventObjectifyTest {

    private final DaoEventObjectify daoEventObjectify = (DaoEventObjectify) DaoFactory.getInstance().getDaoEvent();

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
        Event event = getOneEvent();

        this.daoEventObjectify.put(event);

        Event event2 = this.daoEventObjectify.getById(event.getId());

        authorTestCondition(event.getAuthor(), event2.getAuthor());
        addresTestCondition(event.getAddress(), event2.getAddress());
        dateTestCondition(event.getDate(), event2.getDate());
        participantsTestCondition(event.getParticipants(), event2.getParticipants());
        descriptionTestCondition(event.getDescription(), event2.getDescription());
        linkTestCondition(event.getLink(), event2.getLink());
        sourceMaterialsTestCondition(event.getSourceMaterials(), event2.getSourceMaterials());
        this.daoEventObjectify.delete(event);
    }

    @Test
    public void testPut() {
        Event event = getOneEvent();

        Key<Event> key = this.daoEventObjectify.put(event);

        Event event2 = this.daoEventObjectify.get(key);

        authorTestCondition(event.getAuthor(), event2.getAuthor());
        addresTestCondition(event.getAddress(), event2.getAddress());
        dateTestCondition(event.getDate(), event2.getDate());
        participantsTestCondition(event.getParticipants(), event2.getParticipants());
        descriptionTestCondition(event.getDescription(), event2.getDescription());
        linkTestCondition(event.getLink(), event2.getLink());
        sourceMaterialsTestCondition(event.getSourceMaterials(), event2.getSourceMaterials());
        this.daoEventObjectify.delete(event);
    }

    @Test
    public void testGet() {
        Event event = getOneEvent();

        Key<Event> key = this.daoEventObjectify.put(event);

        Event event2 = this.daoEventObjectify.get(key);

        authorTestCondition(event.getAuthor(), event2.getAuthor());
        addresTestCondition(event.getAddress(), event2.getAddress());
        dateTestCondition(event.getDate(), event2.getDate());
        participantsTestCondition(event.getParticipants(), event2.getParticipants());
        descriptionTestCondition(event.getDescription(), event2.getDescription());
        linkTestCondition(event.getLink(), event2.getLink());
        sourceMaterialsTestCondition(event.getSourceMaterials(), event2.getSourceMaterials());

        this.daoEventObjectify.delete(event);
    }

    @Test
    public void testDelete() {
        Event event = getOneEvent();

        Key<Event> key = this.daoEventObjectify.put(event);

        Event event2 = this.daoEventObjectify.get(key);

        authorTestCondition(event.getAuthor(), event2.getAuthor());
        addresTestCondition(event.getAddress(), event2.getAddress());
        dateTestCondition(event.getDate(), event2.getDate());
        participantsTestCondition(event.getParticipants(), event2.getParticipants());
        descriptionTestCondition(event.getDescription(), event2.getDescription());
        linkTestCondition(event.getLink(), event2.getLink());
        sourceMaterialsTestCondition(event.getSourceMaterials(), event2.getSourceMaterials());
        this.daoEventObjectify.delete(event);

        event2 = this.daoEventObjectify.get(key);

        Assert.assertNull(event2);
    }

    @Test
    public void testGetAllByKeys() {
        List<Event> events = new ArrayList<Event>();
        events.add(getOneEvent());
        events.add(getOneEvent());
        events.add(getOneEvent());

        List<Key<Event>> keys = this.daoEventObjectify.putAll(events);

        List<Event> events2 = this.daoEventObjectify.getAllByKeys(keys);

        for (Event event : events) {
            authorTestCondition(event.getAuthor(), events2.get(events.indexOf(event)).getAuthor());
            addresTestCondition(event.getAddress(), events2.get(events.indexOf(event)).getAddress());
            dateTestCondition(event.getDate(), events2.get(events.indexOf(event)).getDate());
            participantsTestCondition(event.getParticipants(), events2.get(events.indexOf(event)).getParticipants());
            descriptionTestCondition(event.getDescription(), events2.get(events.indexOf(event)).getDescription());
            linkTestCondition(event.getLink(), events2.get(events.indexOf(event)).getLink());
            sourceMaterialsTestCondition(event.getSourceMaterials(), events2.get(events.indexOf(event))
                    .getSourceMaterials());
            this.daoEventObjectify.delete(event);
        }

    }

    /**
     * @return
     */
    public static Event getOneEvent() {
        Event event = new Event();
        event.setAuthor(DaoUserObjectifyTest.getOneUser());
        event.setAddress("addres");
        event.setDate(new Date());
        event.addParticipant(DaoUserObjectifyTest.getOneUser());
        event.addParticipant(DaoUserObjectifyTest.getOneUser());
        event.addParticipant(DaoUserObjectifyTest.getOneUser());
        event.setDescription("description");
        event.setLink(new Link("www.google.com"));
        event.addSourceMaterial(DaoSourceMaterialObjecitfyTest.getOneSourceMaterial());
        event.addSourceMaterial(DaoSourceMaterialObjecitfyTest.getOneSourceMaterial());
        return event;
    }

    public static void idTestCondition(Long a, Long b) {
        Assert.assertEquals(a, b);
    }

    public static void authorTestCondition(User a, User b) {
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

    public static void sourceMaterialTestCondition(SourceMaterial a, SourceMaterial b) {
        DaoSourceMaterialObjecitfyTest.idTestCondition(a.getId(), b.getId());
        DaoSourceMaterialObjecitfyTest.descriptionTestCondition(a.getDescription(), b.getDescription());
        DaoSourceMaterialObjecitfyTest.labelTestCondition(a.getLabel(), b.getLabel());
        DaoSourceMaterialObjecitfyTest.linkTestCondition(a.getLink(), b.getLink());
    }

    public static void addresTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void descriptionTestCondition(String a, String b) {
        Assert.assertEquals(a, b);
    }

    public static void linkTestCondition(Link a, Link b) {
        Assert.assertEquals(a, b);
    }

    public static void dateTestCondition(Date a, Date b) {
        Assert.assertEquals(a, b);
    }

    public static void participantsTestCondition(List<User> a, List<User> b) {
        for (User u : a) {
            authorTestCondition(u, b.get(a.indexOf(u)));
        }
    }

    public static void sourceMaterialsTestCondition(List<SourceMaterial> a, List<SourceMaterial> b) {
        for (SourceMaterial material : a) {
            sourceMaterialTestCondition(material, b.get(a.indexOf(material)));
        }
    }

}

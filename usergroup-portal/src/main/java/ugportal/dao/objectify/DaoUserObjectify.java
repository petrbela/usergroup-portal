/**
 * DaoUserObjectify.java, 22.7.2011 10:43:51 
 */
package ugportal.dao.objectify;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ugportal.dao.DaoUser;
import ugportal.model.User;

import com.google.appengine.api.datastore.Email;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Query;
import com.googlecode.objectify.util.DAOBase;

/**
 * {@link DaoUserObjectify} implements access to the database via Objectify
 * framework.
 * 
 * @author Tomas Vantuch
 */
public class DaoUserObjectify extends DAOBase implements DaoUser {

    public User get(Key<User> key) {
        return ofy().find(key);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUser#getById(java.lang.String)
     */
    @Override
    public User getById(final Long id) {
        return ofy().find(User.class, id);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUser#getByName(java.lang.String, java.lang.String)
     */
    @Override
    public List<User> getByName(final String firstName, final String lastName) {
        Query<User> firstnameQuery = ofy().query(User.class).filter("firstname >=", firstName)
                .filter("firstname <=", firstName + "\uFFFD");
        Query<User> lastnameQuery = ofy().query(User.class).filter("lastname >=", lastName)
                .filter("lastname <=", lastName + "\uFFFD");
        Set<User> users = new HashSet<User>();
        users.addAll(firstnameQuery.list());
        users.addAll(lastnameQuery.list());
        return new ArrayList<User>(users);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUser#getByRole(java.lang.String)
     */
    @Override
    public List<User> getByRole(final String role) {
        Query<User> query = ofy().query(User.class).filter("role =", role);
        List<User> users = new ArrayList<User>();
        for (User u : query) {
            users.add(u);
        }
        return users;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUser#getByEmail(com.google.appengine.api.datastore.Email)
     */
    @Override
    public List<User> getByEmail(final Email email) {
        return ofy().query(User.class).filter("email =", email).list();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUser#save(ugportal.model.User)
     */
    @Override
    public Key<User> put(final User user) {
        return ofy().put(user);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoUser#delete(ugportal.model.User)
     */
    @Override
    public void delete(final User user) {
        ofy().delete(user);
    }

    /**
     * @param users
     * @return
     */
    public List<User> getAllByKeys(List<Key<User>> users) {
        return new ArrayList<User>(ofy().get(users).values());
    }

    /**
     * @param users
     */
    public List<Key<User>> putAll(List<User> users) {
        return new ArrayList<Key<User>>(ofy().put(users).keySet());

    }

    /**
     * @param i
     * @return
     */
    public List<User> getByCount(int from, int to) {
        List<Key<User>> keys = ofy().query(User.class).listKeys();
        return new ArrayList<User>(ofy().get(keys.subList(from, to)).values());

    }
}

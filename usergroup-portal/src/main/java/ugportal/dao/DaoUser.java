/**
 * DaoUser.java, 22.7.2011 10:32:42 
 */
package ugportal.dao;

import java.util.List;

import ugportal.model.User;

import com.google.appengine.api.datastore.Email;

/**
 * DAO object for {@link User}.
 * 
 * @author Tomas Vantuch
 */
public interface DaoUser {
    /**
     * Returns {@link User} by it's ID.
     * 
     * @param id
     *            user id
     * @return fetched user, or null
     */
    public abstract User getById(final Long id);

    /**
     * Returns collection of {@link User} by it's firstName or lastName.
     * 
     * @param firstName
     *            , lastName user firstName, lastName
     * @return fetched collection of users, or null
     */
    public abstract List<User> getByName(final String firstName, final String lastName);

    /**
     * Returns collection of {@link User} by it's role.
     * 
     * @param role
     *            user role
     * @return fetched collection of users, or null
     */
    public abstract List<User> getByRole(final String role);

    /**
     * Returns {@link User} by it's email.
     * 
     * @param email
     *            user email
     * @return fetched user, or null
     */
    public abstract List<User> getByEmail(final Email email);

    /**
     * to saving or updating users
     * 
     * @param user
     *            user to save or update
     */
    public abstract void save(final User user);

    /**
     * to deleting users
     * 
     * @param user
     *            user to delete
     */
    public abstract void delete(final User user);

}

package net.kindleit.gae.example.server;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import net.kindleit.gae.example.model.Message;
import net.kindleit.gae.example.model.Messages;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;

public class MessageRepository implements Messages {

    public MessageRepository() {
	ObjectifyService.register(Message.class);
    }

    /**
     * @see net.kindleit.gae.example.model.Messages#getAll()
     */
    public Collection<Message> getAll() {
	Objectify ofy = ObjectifyService.begin();
	List<Message> messages = new LinkedList<Message>();
	Query<Message> q = ofy.query(Message.class);
	for (Message m : q) {
	    messages.add(m);
	}
	return messages;
    }

    /**
     * @see net.kindleit.gae.example.model.Messages#create(net.kindleit.gae.example.model.Message)
     */
    public void create(final Message message) {
	Objectify ofy = ObjectifyService.begin();
	ofy.put(message);
    }

    /**
     * @see net.kindleit.gae.example.model.Messages#deleteById(java.lang.Long)
     */
    public void deleteById(final Long id) {
	Objectify ofy = ObjectifyService.begin();
	ofy.getDatastore().delete(new Key<Message>(Message.class, id).getRaw());
    }
}

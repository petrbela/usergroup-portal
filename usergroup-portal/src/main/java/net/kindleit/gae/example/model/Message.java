package net.kindleit.gae.example.model;

import java.io.Serializable;

import javax.persistence.Id;

public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String text;

    public Long getId() {
	return id;
    }

    public void setId(final Long id) {
	this.id = id;
    }

    public String getText() {
	return text;
    }

    public void setText(final String text) {
	this.text = text;
    }
}

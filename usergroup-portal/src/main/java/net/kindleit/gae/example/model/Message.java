package net.kindleit.gae.example.model;

import java.io.Serializable;

public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

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

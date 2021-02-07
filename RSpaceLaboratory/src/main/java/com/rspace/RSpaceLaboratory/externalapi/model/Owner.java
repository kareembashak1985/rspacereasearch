package com.rspace.RSpaceLaboratory.externalapi.model;

import java.util.ArrayList;

public class Owner {
	private float id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private float homeFolderId;
	ArrayList<link> _links = new ArrayList<link>();

	// Getter Methods

	public ArrayList<link> get_links() {
		return _links;
	}

	public void set_links(ArrayList<link> _links) {
		this._links = _links;
	}

	public float getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public float getHomeFolderId() {
		return homeFolderId;
	}

	// Setter Methods

	public void setId(float id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setHomeFolderId(float homeFolderId) {
		this.homeFolderId = homeFolderId;
	}
}

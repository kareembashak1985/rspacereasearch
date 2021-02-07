package com.rspace.RSpaceLaboratory.model;

import java.util.ArrayList;
import java.util.List;

public class UserLabReport {
	
	private Integer userId;
	private String  userName;
	private String  email;
	private String  firstName;
	private String  lastName;	
	
	
	private List<Sample> userSamples = new ArrayList<Sample>();
	
	private ErrorDetails errorDetails;
	
	public ErrorDetails getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(ErrorDetails errorDetails) {
		this.errorDetails = errorDetails;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", userSamples=" + userSamples + "]";
	}
	public List<Sample> getUserSamples() {
		return userSamples;
	}
	public void setUserSamples(Sample sample) {
		userSamples.add(sample);
	}
	
	
	
	
	
	
}

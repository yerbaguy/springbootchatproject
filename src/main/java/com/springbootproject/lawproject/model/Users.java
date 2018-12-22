package com.springbootproject.lawproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

	
	private @Id
	@GeneratedValue
	int id;
	
	String userName;
	String userSurname;
	String userNickname;
//	String userNname;
	String userEmail;
	String userPassword;
	
	
	
	
	public Users() {
		
		
	}
	
	public Users(String userName, String userSurname, String userNickname, String userEmail, String userPassword) {
		
		this.userName = userName;
		this.userSurname = userSurname;
		this.userNickname = userNickname;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserNickname() {
		return this.userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
}

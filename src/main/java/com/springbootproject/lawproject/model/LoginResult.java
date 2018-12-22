package com.springbootproject.lawproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class LoginResult {

	
	private @Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	int id;
	
//	private String result;
	private boolean success;
	private String usernickname;
//	private String resultNo;
	
	
	public LoginResult() {
		
		
	}
	
//	public LoginResult(String result) {
	public LoginResult(boolean succes, String usernickname) {	
			 
	//	this.result = result;
		this.success = success;
		this.usernickname = usernickname;
	//	this.resultNo = resultNo;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public String getResult() {
	public boolean getResult() {	
	//	return this.result;
		return this.success;
	}

//	public void setResult(String result) {
	public void setResult(boolean success) {	
	//	this.result = result;
		this.success = success;
	}
	
	public void setUserNickName(String usernickname) {
		
		this.usernickname = usernickname;
		
	}
	
	public String getUserNickName() {
		
		return this.usernickname;
	}
}

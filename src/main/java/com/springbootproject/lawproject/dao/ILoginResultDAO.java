package com.springbootproject.lawproject.dao;

import java.util.List;

import com.springbootproject.lawproject.model.LoginResult;


public interface ILoginResultDAO {
	
	void autoincrement(LoginResult loginResult);
	
	void delete(LoginResult loginResult);
	
	void logout();

}

package com.springbootproject.lawproject.service;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springbootproject.lawproject.dao.LoginResultDAO;
import com.springbootproject.lawproject.model.LoginResult;
import com.springbootproject.lawproject.model.Users;
import com.springbootproject.lawproject.repository.LoginResultRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginResultService {

	
	@Autowired
	private LoginResultRepository loginResultRepository;
	
	@Autowired
	private LoginResultDAO loginResultDAO;
	
	
    public LoginResult save(LoginResult loginResult) {
		
//		users.setUserPassword(bCryptPasswordEncoder.encode(users.getUserPassword()));
		
		return loginResultRepository.save(loginResult);
	}
    
    
    public void autoincrement(LoginResult loginResult) {
    	
    	loginResultDAO.autoincrement(loginResult);
    	
    }
    
    public void detele(LoginResult loginResult) {
    	
    	loginResultDAO.delete(loginResult);
    	
    }
    
  //  public void updloginresult(String resultt) {
    public void updloginresult(boolean success) {
  //  public void updloginresult() {	
    	
    //	success = false;
    	
 //   	loginResultRepository.updloginresult(resultt);
    	loginResultRepository.updloginresult(success);
  //  	loginResultRepository.updloginresult();
    }
    
  //  public String findResultLoginResult() {
   	public ArrayList<LoginResult> findResultLoginResult() {
    	
    //	return loginResultRepository.findResultLoginResult();
   		
//   		List<LoginResult> loginResult = new ArrayList<LoginResult>();
   		
   		ArrayList<LoginResult> loginResult = new ArrayList<LoginResult>(loginResultRepository.findResultLoginResult());
   		
   		
   		return loginResult;
    	
    }
    
}

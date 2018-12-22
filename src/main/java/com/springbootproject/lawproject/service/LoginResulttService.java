package com.springbootproject.lawproject.service;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springbootproject.lawproject.dao.LoginResultDAO;
import com.springbootproject.lawproject.model.LoginResultt;
import com.springbootproject.lawproject.model.Users;
import com.springbootproject.lawproject.repository.LoginResulttRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginResulttService {
	
	
	
	@Autowired
	private LoginResulttRepository loginResulttRepository;
	
	@Autowired
	private LoginResultDAO loginResultDAO;
	
	
    public LoginResultt save(LoginResultt loginResultt) {
		
//		users.setUserPassword(bCryptPasswordEncoder.encode(users.getUserPassword()));
		
		return loginResulttRepository.save(loginResultt);
	}
    
    
//    public void autoincrement(LoginResultt loginResult) {
//    	
//    	loginResultDAO.autoincrement(loginResult);
//    	
//    }
    
//    public void detele(LoginResult loginResult) {
//    	
//    	loginResultDAO.delete(loginResult);
//    	
//    }
    
  //  public void updloginresult(String resultt) {
    public void updloginresult(boolean success) {	
    	
 //   	loginResultRepository.updloginresult(resultt);
    	loginResulttRepository.updloginresult(success);
    }
    
  //  public String findResultLoginResult() {
   	public ArrayList<LoginResultt> findResultLoginResult() {
    	
    //	return loginResultRepository.findResultLoginResult();
   		
//   		List<LoginResult> loginResult = new ArrayList<LoginResult>();
   		
   		ArrayList<LoginResultt> loginResult = new ArrayList<LoginResultt>(loginResulttRepository.findResultLoginResult());
   		
   		
   		return loginResult;
    	
    }

}

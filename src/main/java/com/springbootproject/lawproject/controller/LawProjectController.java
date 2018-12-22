package com.springbootproject.lawproject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.lawproject.dao.LogoutResultDAO;
import com.springbootproject.lawproject.model.LoginResult;
import com.springbootproject.lawproject.model.Users;
import com.springbootproject.lawproject.service.LawProjectService;
//import com.springbootproject.lawproject.service.LawProjectService;
import com.springbootproject.lawproject.service.LoginResultService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class LawProjectController {
	
	
	
	@Autowired
	private LawProjectService lawProjectService;
	
	@Autowired
	private LoginResultService loginResultService;
	
	
	@Autowired
	private LogoutResultDAO logoutResultDAO;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	
	@RequestMapping(value = "/hallo", method = RequestMethod.GET)
	public void hallo() {
		
		
		String label = "lkjasdf";
		
		System.out.println("label" + label);
		
	}
	
	
  //	@RequestMapping(value = "/login-user", method = RequestMethod.GET)
    @RequestMapping(value = "/login-user")
//	@ResponseBody
	//public String loginUser(@RequestBody Users users) {
	//public boolean loginUser(@RequestBody Users users) {	
    public List<LoginResult> loginUser(@RequestBody Users users) {
	//public List<LoginResult> loginUser() {	
		//Users users = new Users();
		
		String rOk = "";
	    String rNo = "";
	    String resultt = "";
	    
	    boolean success = false;
		
		LoginResult lResult = new LoginResult();
		
		String usernickname = "";
		String userpassword = "";
		
		
	    System.out.println("usernickname in loginUser" + users.getUserNickname());
	    
	    usernickname = users.getUserNickname();
	    userpassword = users.getUserPassword();
		
		List<LoginResult> loginResult = new ArrayList<LoginResult>();
		
		
		if (lawProjectService.findByUserNicknameAndUserPassword(users.getUserNickname(), users.getUserPassword()) != null) {
			
			System.out.println("Yes");
		//	return true;
			rOk = "OK";
		//	resultt = rOk;
			success = true;
			
			String encryptPwd = passwordEncoder.encode(userpassword);
			users.setUserPassword(encryptPwd);
		    
		//	lResult.setResult("Yes");
			lResult.setUserNickName(usernickname);
		    lResult.setResult(success);
		//	loginResult.add(new LoginResult("rOK"));
			loginResult.add(new LoginResult(success, usernickname));
		//	loginResultService.detele(lResult);
		//	loginResultService.autoincrement(lResult);
		//	loginResultService.save(lResult);
			loginResultService.updloginresult(success);
			return loginResult;
		}
		
		rNo = "NO";
		resultt = rNo;
	//	success = false;
	//	lResult.setResult("NO");
		lResult.setUserNickName(usernickname);
		lResult.setResult(success);
	//	loginResult.add(new LoginResult("rNO"));
		loginResult.add(new LoginResult(success, usernickname));
		
	//	loginResultService.autoincrement(lResult);
		
	//	loginResultService.save(lResult);
		loginResultService.updloginresult(success);
		
		return loginResult;
		
//		String label = "lkjasdf";
//		
//	    return label;

	//	System.out.println("No");
		// return false;
		
//		return "No";
	}
	
	
    
//    @RequestMapping(value = "/loginuserResult", method = RequestMethod.GET)
//    //@RequestMapping(value = "/login-user")
//  	//@ResponseBody
//  	//public String loginUser(@RequestBody Users users) {
//  	//public boolean loginUser(@RequestBody Users users) {	
//      //public List<LoginResult> loginUser(@RequestBody Users users) {
//  	public List<LoginResult> loginuserResult(@RequestBody Users users) {	
// 
//    	
//    	String rOk = "";
//	    String rNo = "";
//	    String resultt = "";
//		
//		LoginResult lResult = new LoginResult();
//		
//		List<LoginResult> loginResult = new ArrayList<LoginResult>();
//
//        
//            if (lawProjectService.findByUserNicknameAndUserPassword(users.getUserNickname(), users.getUserPassword()) != null) {
//			
//			System.out.println("Yes");
//		//	return true;
//			rOk = "OK";
//			resultt = rOk;
//		//	lResult.setResult("Yes");
//		    lResult.setResult(resultt);
//		//	loginResult.add(new LoginResult("rOK"));
//			loginResult.add(new LoginResult(resultt));
//		//	loginResultService.detele(lResult);
//		//	loginResultService.autoincrement(lResult);
//		//	loginResultService.save(lResult);
//	//		loginResultService.updloginresult(resultt);
//			return loginResult;
//		}                  
//
//    rNo = "NO";
//		resultt = rNo;
//		
//	//	lResult.setResult("NO");
//		lResult.setResult(resultt);
//	//	loginResult.add(new LoginResult("rNO"));
//		loginResult.add(new LoginResult(resultt));
//		
//	//	loginResultService.autoincrement(lResult);
//		
//	//	loginResultService.save(lResult);
////		loginResultService.updloginresult(resultt);
//		
//		return loginResult;
//
//    	
//    	
//    	
//  	}
    
    
    
    
  @RequestMapping(value = "/login-user-result", method = RequestMethod.GET)
  //@RequestMapping(value = "/login-user")
	//@ResponseBody
	//public String loginUser(@RequestBody Users users) {
	//public boolean loginUser(@RequestBody Users users) {	
    //public List<LoginResult> loginUser(@RequestBody Users users) {
	public List<LoginResult> loginUserResult() {	
		//Users users = new Users();
		
		String rOk = "";
	    String rNo = "";
	    
	    String result = "";
	    boolean success = false;
	    
		
		LoginResult lResult = new LoginResult();
		
		List<LoginResult> loginResult = new ArrayList<LoginResult>();
		
		
		//result = loginResultService.findResultLoginResult();
		
		loginResult = loginResultService.findResultLoginResult();
		
//		if (lawProjectService.findByUserNicknameAndUserPassword(users.getUserNickname(), users.getUserPassword()) != null) {
			
		//	System.out.println("Yes");
			
		    System.out.println("result" + result);
		    
		//	return true;
//			rOk = "OK";
//			lResult.setResult("Yes");
//			loginResult.add(new LoginResult("OK"));
			return loginResult;
//		}
		
//		rNo = "NO";
		
//		lResult.setResult("NO");
//		loginResult.add(new LoginResult("rNO"));
		
//		return loginResult;
		
//		String label = "lkjasdf";
//		
//	    return label;

	//	System.out.println("No");
		// return false;
		
//		return "No";
	}
    
    
  //    @RequestMapping(value = "/logout-result")
        @RequestMapping(value = "/logout-result", method = RequestMethod.POST)
        @ResponseBody
  //   public void logoutResult() {
    	public String logoutResult(@RequestBody LoginResult loginResult ) {	
    	
    //	boolean success = false;
        	boolean success;
        	boolean showsuccess;
    	
    // 	logoutResultDAO.logout();
    //	loginResultService.updloginresult(success);
    	
    //	loginResult.setResult(success);
    	
    	
        	
    //	success =  loginResult.getResult();
    	
        success = loginResult.getResult();
        	
    	loginResult.setResult(success);
    	
    	
    	
    	System.out.println("logoutResult" + loginResult.getResult());
    	
    	
    	try {

		//	userPa = users.getUserPassword();

		//	String encryptPwd = passwordEncoder.encode(userPa);
		//	users.setUserPassword(encryptPwd);
			
			
			loginResultService.updloginresult(success);
		//	lawProjectService.save(users);
			
		//	userid = String.valueOf(users.getId());
			
		} catch(Exception ex) {
			
			return "Error while inserting the word:" + ex.toString();
		}
		
	//	return "Word successfully inserted with id = " + userid;
		return "Word added successfully";
    	
    	
    }
    
    
    
    
    
//	public void solutionOfLoginUser() {
//		
//		System.out.println("loginUser" + loginUser());
//	}
	
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public String create(@RequestBody Users users) {
		
		 String userid = "";
		 
		 String userNa;
		 String userSu;
		 String userNi;
		 String userEm;
		 String userPa;
		 
		 
//		 users.setUserName("lkajsdfk");
//		 users.setUserSurname("lkjasdf");
//		 users.setUserNickname("lkjsdflks");
//		 users.setUserEmail("lkjasdfkjsd");
//		 users.setUserPassword("lkjsdfkjssdfsl"); 
		 
		 userNa = users.getUserName();
		 userSu = users.getUserSurname();
		 userNi = users.getUserNickname();
		 userEm = users.getUserEmail();
		 userPa = users.getUserPassword();
		
		 
		 
		 System.out.println("userNa" + userNa);
		 System.out.println("userSu" + userSu);
		 System.out.println("userNi" + userNi);
		 System.out.println("userEm" + userEm);
		 System.out.println("userPa" + userPa);
		 
		 
		try {

			userPa = users.getUserPassword();

			String encryptPwd = passwordEncoder.encode(userPa);
			users.setUserPassword(encryptPwd);
			
			
			lawProjectService.save(users);
			
			userid = String.valueOf(users.getId());
			
		} catch(Exception ex) {
			
			return "Error while inserting the word:" + ex.toString();
		}
		
		return "Word successfully inserted with id = " + userid;
		
		
	}

}

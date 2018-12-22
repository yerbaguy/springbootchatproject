package com.springbootproject.lawproject.service;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springbootproject.lawproject.model.Users;

import com.springbootproject.lawproject.repository.LawProjectRepository;

import java.util.List;



@Service
public class LawProjectService {

	
	@Autowired
	private LawProjectRepository lawProjectRepository;
	
	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	
	public Users save(Users users) {
		
//		users.setUserPassword(bCryptPasswordEncoder.encode(users.getUserPassword()));
		
		return lawProjectRepository.save(users);
	}
	
	//public boolean findByUserNicknameAndUserPassword(String userNickname, String userPassword) {

	public Users findByUserNicknameAndUserPassword(String userNickname, String userPassword) {
		
		
		return lawProjectRepository.findByUserNicknameAndUserPassword(userNickname, userPassword);
	}
}

package com.springbootproject.lawproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springbootproject.lawproject.model.Users;


//@Repository
@RepositoryRestResource
//@CrossOrigin(origins = "http://localhost:4200")
public interface LawProjectRepository extends JpaRepository<Users, Integer> {
	
	public Users findByUserNicknameAndUserPassword(String userNickname, String userPassword);
//	public boolean findByUserNicknameAndUserPassword(String userNickname, String userPassword);


}

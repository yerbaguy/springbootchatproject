package com.springbootproject.lawproject.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springbootproject.lawproject.model.LoginResult;
import com.springbootproject.lawproject.model.LoginResultt;


public interface LoginResulttRepository extends JpaRepository<LoginResultt, Integer> {
	
	
	
	@Modifying
	@Transactional
//	@Query("UPDATE LoginResult r SET r.result= :resultt WHERE r.id=1")
	@Query("UPDATE LoginResultt r SET r.success= :success WHERE r.id=1")
//	void updloginresult(@Param("resultt") String resultt);
	void updloginresult(@Param("success") boolean success);
	
	
//	@Query("SELECT l.rezult FROM login_result l WHERE l.id = 1")
//	@Query("SELECT l.rezult FROM login_result")
	@Query("SELECT l FROM LoginResultt l")
//	public String findResultLoginResult();
	public ArrayList<LoginResultt> findResultLoginResult();

}

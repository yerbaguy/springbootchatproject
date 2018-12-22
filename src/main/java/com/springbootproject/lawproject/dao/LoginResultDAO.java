package com.springbootproject.lawproject.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.springbootproject.lawproject.model.LoginResult;

@Transactional
@Repository
public class LoginResultDAO implements ILoginResultDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void autoincrement(LoginResult loginResult) {
		// TODO Auto-generated method stub
		
	//	String hql = "ALTER TABLE login_result auto_increment = 1";
		
		entityManager.createNativeQuery("ALTER TABLE login_result AUTO_INCREMENT = 1").executeUpdate();
		
	}


	@Override
	public void delete(LoginResult loginResult) {
		// TODO Auto-generated method stub
		
		String hql = "DELETE FROM login_result";
		
		entityManager.createNativeQuery(hql).executeUpdate();
		
		
	}
	
	
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	//	String hql = "DELETE FROM login_result";
		String hql = "UPDATE login_result SET success=false WHERE id=1";
		
		entityManager.createNativeQuery(hql).executeUpdate();
		
		
	}

	
	
	
}

package com.springbootproject.lawproject.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.springbootproject.lawproject.model.LoginResult;

@Transactional
@Repository
public class LogoutResultDAO implements ILogoutResultDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
//		String hql = "UPDATE login_result SET success='false' WHERE id=1";
        String hql = "UPDATE login_result SET success=false WHERE id=1";
		
		entityManager.createNativeQuery(hql).executeUpdate();
		
	}

}

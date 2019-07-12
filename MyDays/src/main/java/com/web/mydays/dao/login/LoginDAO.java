package com.web.mydays.dao.login;

import javax.persistence.EntityManager;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.web.mydays.model.UserLogin;

@Repository
public class LoginDAO extends JpaRepositoriesAutoConfiguration{
	private EntityManager entityManager;
	
	public UserLogin getUserLogin(UserLogin userLogin) {
		userLogin = entityManager.find(UserLogin.class, userLogin.getUserName());
		if(userLogin!=null)
			return userLogin;
		else
			return null;
		
	}
}

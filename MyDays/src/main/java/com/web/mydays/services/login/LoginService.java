package com.web.mydays.services.login;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.mydays.dao.login.LoginDAO;
import com.web.mydays.model.UserLogin;


public class LoginService {
	@Autowired
	LoginDAO loginDAO;
	public boolean validateLogin(UserLogin userLogin) {
		userLogin = loginDAO.getUserLogin(userLogin);
		
		if(userLogin!=null)
		return true;
		return false;
	}
}

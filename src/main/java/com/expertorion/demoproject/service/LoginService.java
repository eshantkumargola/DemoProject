package com.expertorion.demoproject.service;

import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.expertorion.demoproject.dao.LoginDao;
import com.expertorion.demoproject.dao.User;

@Service
public class LoginService {
	
	private final Logger logger=LoggerFactory.getLogger(LoginService.class);
	
	private LoginDao loginDao;	
	
	public boolean validUser=false;
	
	/*DI using ConsutructorINjection */ 
	public LoginService(LoginDao loginDao)
	{		
		super();
		this.loginDao=loginDao;
	}
	
	public User validateUser(String username, String password)
	{
		User validUser=loginDao.getUser(username);
		
		boolean isvalid = (validUser.getUsername().equals(username)) && (validUser.getPassword().equals(password)) ;
		
		logger.info(" User "+ username + "Password :" +password +" is : "+isvalid);

		if(isvalid)	 
			return validUser;
		else
			return null;
		
	}	
}

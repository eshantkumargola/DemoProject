package com.expertorion.demoproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.expertorion.demoproject.service.LoginService;

@Repository
public class LoginDao {

	private final Logger logger=LoggerFactory.getLogger(LoginService.class);
	private static List<User> users= new ArrayList<>();
	
	private static long id=0;
	
	static {		
			users.add(new User(++id, "eshant-g" , "dummy1", "INDIA",201301)); 
			users.add(new User(++id,"nicolas-k", "dummy2", "USA"  ,123456));
			users.add(new User(++id,"gary-k"   , "dummy3", "USA"  ,123456)); 
			users.add(new User(++id,"martin-l" , "dummy4", "USA"  ,123456));
	}
	
	/* Need to replace the below to return a Mono */ 
	public User getUser(String username) {
				
		int index=0;
		
		switch (username) {
			case "eshant-g"  : index=0 ; break;
			case "nicolas-k" : index=1 ; break;
			case "gary-k"    : index=3 ; break;
			case "martin-l"  : index=4 ; break;
		}		
		
		logger.info("  LoginDao  => "+users.get(index).getUsername());
		return users.get(index);
	}
}

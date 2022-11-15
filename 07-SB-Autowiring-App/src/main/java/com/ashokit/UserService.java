package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	/*
	 * @Autowired public void setUserDao(UserDao userDao) { this.userDao = userDao;
	 * }
	 */
	/*
	 * @Autowired public UserService(UserDao userDao) { this.userDao=userDao;
	 * 
	 * }
	 */

	public void saveUser() {
		boolean status=userDao.save();
		if(status) {
			System.out.println("User data saved Successful");
		}
		else {
			System.out.println("User data saved Unsuccessful");
		}
		
	}

}

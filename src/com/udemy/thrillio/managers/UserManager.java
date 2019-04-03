package com.udemy.thrillio.managers;

import com.udemy.thrillio.entities.User;

/*
 * Singleton class for managing User related tasks
 */
public class UserManager {
	private static UserManager instance;

	// private constructor
	private UserManager() {

	}

	public static UserManager getInstance() {
		if (instance == null) {
			instance = new UserManager();
		}
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		return user;
	}
}

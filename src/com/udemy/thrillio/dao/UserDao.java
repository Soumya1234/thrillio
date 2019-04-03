package com.udemy.thrillio.dao;

import com.udemy.thrillio.DataStore;
import com.udemy.thrillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}

package com.udemy.thrillio.controllers;

import com.udemy.thrillio.entities.Bookmark;
import com.udemy.thrillio.entities.User;
import com.udemy.thrillio.managers.BookmarkManager;

//Singleton Controller
public class BookmarkController {
	
	private static BookmarkController instance;

	private BookmarkController() {

	}

	public static BookmarkController getInstance() {
		if (instance == null) {
			instance = new BookmarkController();
		}
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
	}

}

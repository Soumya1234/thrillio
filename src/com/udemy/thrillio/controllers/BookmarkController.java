package com.udemy.thrillio.controllers;

import com.udemy.thrillio.constants.KidFriendlyStatus;
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
		
		BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
	}

	public void setKidFriendlyStatus(User user,KidFriendlyStatus kidFriendlyMarkDecision, Bookmark bookmark) {
		BookmarkManager.getInstance().setKidFriendlyStatus(user,kidFriendlyMarkDecision,bookmark);
		
	}

	public void share(User user, Bookmark bookmark) {
		
		BookmarkManager.getInstance().share(user,bookmark);
	}

}

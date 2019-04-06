package com.udemy.thrillio;

import com.udemy.thrillio.entities.Bookmark;
import com.udemy.thrillio.entities.User;
import com.udemy.thrillio.managers.BookmarkManager;
import com.udemy.thrillio.managers.UserManager;

public class Launch {

	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		
		System.out.println("1. Loading data ... ");
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
//		System.out.println("Printing data ...");
//		printUserData();
//		printtBookmarkData();
		
	}

	private static void printtBookmarkData() {
		
		for(Bookmark[] bookmarkRow: bookmarks) {
			for(Bookmark bookmark : bookmarkRow) {
				System.out.println(bookmark);
			}
		}
		
	}

	private static void printUserData() {
		for(User user : users ) {
			System.out.println(user);
		}
			
		
	}

	public static void main(String[] args) {
		loadData();
		start();
	}

	private static void start() {
//		System.out.println("\n2. Bookmarking ... ");
		for(User user : users) {
			View.browse(user, bookmarks);
		}
		
	}

}

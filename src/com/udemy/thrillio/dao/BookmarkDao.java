package com.udemy.thrillio.dao;

import com.udemy.thrillio.DataStore;
import com.udemy.thrillio.entities.Bookmark;
import com.udemy.thrillio.entities.UserBookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		
		DataStore.add(userBookmark);
	}
}

package com.udemy.thrillio.dao;

import com.udemy.thrillio.DataStore;
import com.udemy.thrillio.entities.Bookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks();
	}
}

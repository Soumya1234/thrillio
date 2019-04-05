package com.udemy.thrillio.entities;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.udemy.thrillio.constants.BookGenre;
import com.udemy.thrillio.managers.BookmarkManager;

class BookTest {

	@Test
	void testIsKidFriendlyEligible() {
		//Test1 Book Genre is Philosophy -- false
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		
		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
		
		assertFalse("Book genre is Philosophy -- isKidFriendlyEligible() method must return false",isKidFriendlyEligible);
		
		//Test2 Book Genre is Self-Help -- false
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP, 4.3);
		
		isKidFriendlyEligible = book.isKidFriendlyEligible();
		
		assertFalse("Book genre is Self-Help -- isKidFriendlyEligible() method must return false",isKidFriendlyEligible);
	}

}

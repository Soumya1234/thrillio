package com.udemy.thrillio.entities;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.udemy.thrillio.constants.MovieGenre;
import com.udemy.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
		//Test1 Movie Genre is Horror -- false
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", 1941,
				new String[] { "Orson Welles" }, new String[] { "Joseph Cotten", "Orson Welles" }, MovieGenre.HORROR,
				8.5);
		
		boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		
		assertFalse("Movie Genre is Horror -- isKidFriendlyEligible() method must return false",isKidFriendlyEligible);
		
		//Test2 Movie Genre is Thriller -- false
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", 1941,
				new String[] { "Orson Welles" }, new String[] { "Joseph Cotten", "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);
		
		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		
		assertFalse("Movie Genre is Thriller -- isKidFriendlyEligible() method must return false",isKidFriendlyEligible);
		
		
	}

}

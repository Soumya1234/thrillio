package com.udemy.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.udemy.thrillio.managers.BookmarkManager;

class WebLinkTest {

	@Test
	void testIsKidFriendly() {
		// Test1: porn in url -- false
		WebLink weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
				"http://www.javaworld.com");
		
		boolean isKidFriendlyEligible = weblink.isKidFriendlyEligible();
		
		assertFalse("For porn in url -- isKidFriendlyEligible() method must return false",isKidFriendlyEligible);

		// Test2: porn in title -- false
		
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		
	    isKidFriendlyEligible = weblink.isKidFriendlyEligible();
		
		assertFalse("For porn in title -- isKidFriendlyEligible() method must return false",isKidFriendlyEligible);
		
		// Test3: adult in host -- false
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.adultworld.com");
		
	    isKidFriendlyEligible = weblink.isKidFriendlyEligible();
		
		assertFalse("For adult in host -- isKidFriendlyEligible() method must return false",isKidFriendlyEligible);

		// Test4: adult in url, but not in host -- true
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/adult-tiger--part-2.html",
				"http://www.javaworld.com");
		
	    isKidFriendlyEligible = weblink.isKidFriendlyEligible();
		
		assertTrue("For adult in url,but not in host -- isKidFriendlyEligible() method must return true",isKidFriendlyEligible);

		// Test5: adult in title only -- true
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		
	    isKidFriendlyEligible = weblink.isKidFriendlyEligible();
		
		assertTrue("For adult in title only -- isKidFriendlyEligible() method must return false",isKidFriendlyEligible);
	}

}

package com.udemy.thrillio;

import com.udemy.thrillio.constants.Gender;
import com.udemy.thrillio.constants.MovieGenre;
import com.udemy.thrillio.constants.UserType;
import com.udemy.thrillio.entities.Bookmark;
import com.udemy.thrillio.entities.User;
import com.udemy.thrillio.entities.UserBookmark;
import com.udemy.thrillio.managers.BookmarkManager;
import com.udemy.thrillio.managers.UserManager;

public class DataStore {
	private static final int USER_BOOKMARK_LIMIT = 5;
	private static final int BOOKMARK_COUNT_PER_TYPE = 5;
	private static final int BOOKMARK_TYPES_COUNT = 3;
	private static final int TOTAL_USER_COUNT = 5;
	private static User[] users = new User[TOTAL_USER_COUNT];
	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
	private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];

	public static void loadData() {
		loadUsers();
		loadMovies();
		loadWebLinks();
		loadBooks();
		loadUserBookmarks();
	}

	private static void loadBooks() {
		// TODO Auto-generated method stub

	}

	private static void loadWebLinks() {
		// TODO Auto-generated method stub
		bookmarks[0][0] = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");

		bookmarks[0][1] = BookmarkManager.getInstance().createWebLink(2001,
				"How do I import a pre-existing Java project into Eclipse and get up and running?",
				"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running",
				"http://www.stackoverflow.com");

		bookmarks[0][2] = BookmarkManager.getInstance().createWebLink(2002, "Interface vs Abstract Class",
				"http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com");

		bookmarks[0][3] = BookmarkManager.getInstance().createWebLink(2003, "NIO tutorial by Greg Travis",
				"http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.edu");

		bookmarks[0][4] = BookmarkManager.getInstance().createWebLink(2004, "Virtual Hosting and Tomcat",
				"http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "http://tomcat.apache.org");

	}

	private static void loadUserBookmarks() {
		// TODO Auto-generated method stub

	}

	private static void loadMovies() {
//		// TODO Auto-generated method stub
//		bookmarks[1][0] = BookmarkManager.getInstance().createBook(3000,	"Citizen Kane",	1941,	new String[]{"Orson Welles","Joseph Cotten"},	"Orson Welles",	MovieGenre.CLASSICS);

	}

	private static void loadUsers() {

		// TODO Auto-generated method stub users[0] =
		UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test", "John", "M", Gender.MALE,
				UserType.USER);
		users[1] = UserManager.getInstance().createUser(1001, "user1@semanticsquare.com", "test", "Sam", "M",
				Gender.MALE, UserType.USER);

		users[2] = UserManager.getInstance().createUser(1002, "user2@semanticsquare.com", "test", "Anita", "M",
				Gender.FEMALE, UserType.EDITOR);

		users[3] = UserManager.getInstance().createUser(1003, "user3@semanticsquare.com", "test", "Sara", "M",
				Gender.FEMALE, UserType.EDITOR);

		users[4] = UserManager.getInstance().createUser(1004, "user4@semanticsquare.com", "test", "Dheeru", "M",
				Gender.MALE, UserType.CHIEF_EDITOR);

	}
}

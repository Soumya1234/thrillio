package com.udemy.thrillio.managers;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import com.udemy.thrillio.constants.BookGenre;
import com.udemy.thrillio.constants.KidFriendlyStatus;
import com.udemy.thrillio.constants.MovieGenre;
import com.udemy.thrillio.dao.BookmarkDao;
import com.udemy.thrillio.entities.Book;
import com.udemy.thrillio.entities.Bookmark;
import com.udemy.thrillio.entities.Movie;
import com.udemy.thrillio.entities.User;
import com.udemy.thrillio.entities.UserBookmark;
import com.udemy.thrillio.entities.WebLink;
import com.udemy.thrillio.util.HttpConnect;
import com.udemy.thrillio.util.IOUtil;

public class BookmarkManager {
	private static BookmarkManager instance;
	private static BookmarkDao dao = new BookmarkDao();

	private BookmarkManager() {

	}

	public static BookmarkManager getInstance() {
		if (instance == null) {
			instance = new BookmarkManager();
		}
		return instance;
	}

	public Movie createMovie(long id, String title, int releaseYear, String[] cast, String[] directors, MovieGenre genre,
			double imdbRating) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		return movie;
	}

	public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, BookGenre genre,
			double amazonRating) {
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		return book;
	}

	public WebLink createWebLink(long id, String title, String url, String host) {
		WebLink weblink = new WebLink();
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setUrl(url);
		weblink.setHost(host);
		return weblink;
	}
	
	public Bookmark[][] getBookmarks(){
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		
		UserBookmark userBookmark = new UserBookmark();
		userBookmark.setUser(user);
		userBookmark.setBookmark(bookmark);
		
		//Adding ability to download and save WebLinks as .html pages locally
		if(bookmark instanceof WebLink) {
			try {
				String url = ((WebLink)bookmark).getUrl();
				if(!url.endsWith(".pdf")) {
					String webpage = HttpConnect.download(url);
					if(webpage != null) {
						IOUtil.write(webpage,bookmark.getId());
					}
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		dao.saveUserBookmark(userBookmark);
	}

	public void setKidFriendlyStatus(User user,KidFriendlyStatus kidFriendlyMarkDecision, Bookmark bookmark) {
		
		bookmark.setKidFriendlyStatus(kidFriendlyMarkDecision);
		bookmark.setKidFriendlyMarkedBy(user);
		
		System.out.println("Kid-Friendly Status:" + kidFriendlyMarkDecision+ " marked by "+user.getEmail()+" ,"+bookmark);
	}

	public void share(User user, Bookmark bookmark) {
		
		bookmark.setSharedBy(user);
		System.out.println("Data to be shared: ");
		if(bookmark instanceof Book) {
			System.out.println(((Book) bookmark).getItemData());
		}
		else if(bookmark instanceof WebLink) {
			System.out.println(((WebLink) bookmark).getItemData());
		}
	}
}

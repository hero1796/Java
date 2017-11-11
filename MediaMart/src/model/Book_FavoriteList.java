package model;

import java.util.Date;

public class Book_FavoriteList {
	private int favoriteListId;
	private int bookId;
	private java.util.Date addingDate;

	public int getFavoriteListId() {
		return favoriteListId;
	}

	public void setFavoriteListId(int favoriteListId) {
		this.favoriteListId = favoriteListId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public java.util.Date getAddingDate() {
		return addingDate;
	}

	public void setAddingDate(java.util.Date addingDate) {
		this.addingDate = addingDate;
	}

	public Book_FavoriteList(int favoriteListId, int bookId, Date addingDate) {
		super();
		this.favoriteListId = favoriteListId;
		this.bookId = bookId;
		this.addingDate = addingDate;
	}

	@Override
	public String toString() {
		return "Book_FavoriteList [favoriteListId=" + favoriteListId + ", bookId=" + bookId + ", addingDate="
				+ addingDate + "]";
	}

}

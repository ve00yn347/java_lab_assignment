package com.ymsli.assignment4.Q02;

import java.util.Objects;

public class Book {
	private String bookTitle;
	private String author;
	
	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}
	
	public Book(String bookTitle, String author){
		this.bookTitle = bookTitle;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookTitle, other.bookTitle);
	}
	
	
}

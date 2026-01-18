package com.ymsli.assignment4.Q02;

import java.util.Arrays;
import java.util.Comparator;

class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		// TODO Auto-generated method stub
		int titleComparison = book1.getBookTitle().compareTo(book2.getBookTitle());
		
		if(titleComparison==0) {
			return book1.getAuthor().compareTo(book2.getAuthor());
		}
		return titleComparison;
	}
	
}

public class BookCollection{
	private String ownerName;
	private Book[] books;
	
	public BookCollection(String ownerName, Book[] books) {
		this.ownerName = ownerName;
		this.books = books;
	}
	
	public boolean hasBook(Book b) {
	    for (Book book : books) {
	        if (book.equals(b)) {
	            return true;
	        }
	    }
	    return false;
	}

	@Override
	public String toString() {
		return "BookCollection [Qwner Name= " + ownerName + ", books= " + Arrays.toString(books) + "] ";
	}

	public void sort() {
		// TODO Auto-generated method stub
		Arrays.sort(books, new BookComparator());;
	}
	
}
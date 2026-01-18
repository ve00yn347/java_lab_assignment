package com.ymsli.assignment4.Q02;


public class TestBookCollection {
	
	public static void findBook(Book book, BookCollection bookCollection) {
		if(bookCollection.hasBook(book)) {
			System.out.println("Book: "+ book+ " found!");
		}
		else {
			System.out.println("Book doesn't exist");
		}
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Spring Boot", "Sharma");
		Book book2 = new Book("Java Basics", "Raj");
		Book book3 = new Book("Java in Depth", "Mehta");
		Book book4 = new Book("Java in Depth", "Sehta");
		Book book5 = new Book("DSA", "Raj");
		Book[] books = {book1, book2, book3, book4};
		
		BookCollection bookCollection = new BookCollection("Rajeev Gupta", books);
		
		findBook(book3, bookCollection);
		findBook(book5, bookCollection);
		
		System.out.println("Before sorting: ");
		System.out.println(bookCollection);
		
		bookCollection.sort();
		
		System.out.println("After sorting:");
		System.out.println(bookCollection);
		
	}
}

package LinkedList;

import java.util.ArrayList;

public class Lib {
 public static void main(String[] args) {
	 ArrayList<Book> book = new ArrayList<>();
	 book.add(new Book("Java", "IT"));
	 book.add(new Book("C++", "IT"));
	 book.add(new Book("Python", "IT"));
	 book.add(new Book("SQL", "IT"));
	 book.add(new Book("C#", "IT"));
	 
	 Lib A = new Lib();
	 A.SearchBooks(book, "Python");
	 
}	 
	 public void SearchBooks(ArrayList<Book> book, String param) {
			 for(Book books: book) {
		 if(books.getName().equals(param)) {
			 System.out.println(books.getName());
			 System.out.println(books.getCategory()); 
	 } 
	 }

 }
}

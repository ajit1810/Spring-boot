package com.example.Book_Keeping_Springboot.Services;

import com.example.Book_Keeping_Springboot.Entities.Book;

public interface BookServices {
	
	public Iterable<Book> findAllBooks();
	public String addBook(Book b);
	public void delete(int id);
	public String updateBook(Book b);

}

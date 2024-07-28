package com.example.Book_Keeping_Springboot.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Book_Keeping_Springboot.Entities.Book;
import com.example.Book_Keeping_Springboot.Repository.BookRepositry;

@Service
public class BookServicesImp implements BookServices{
	
	@Autowired
	BookRepositry bookRepo;
	
	public Iterable<Book> findAllBooks(){
		return bookRepo.findAll();
	}
	
	
	public String addBook(Book b) {
		bookRepo.save(b);
		return "Book Added Successfully";
	}
	
	
	public void delete(int id) {
		bookRepo.deleteById(id);
	}
	
	
	public String updateBook(Book b) {
		bookRepo.save(b);
		return "Book Update Sucessfully";
	}
	
	
}

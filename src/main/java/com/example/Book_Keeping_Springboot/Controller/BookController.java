package com.example.Book_Keeping_Springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book_Keeping_Springboot.Entities.Book;
import com.example.Book_Keeping_Springboot.Services.BookServicesImp;

//define this controller
@RestController
@CrossOrigin
public class BookController {
	
	@Autowired
	BookServicesImp bookServices;
	
	@GetMapping("/getAllBooks")
	public Iterable<Book> getAllBooks(){
		return bookServices.findAllBooks();
	}
	
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book b) {
		return bookServices.addBook(b);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable int id) {
		bookServices.delete(id);
	}
	
	@PostMapping("/updateBook")
	public String updateBook(@RequestBody Book b) {
		return bookServices.updateBook(b);
		
	}
	
	
	
}

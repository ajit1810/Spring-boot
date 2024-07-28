package com.example.Book_Keeping_Springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Book_Keeping_Springboot.Entities.Book;

public interface BookRepositry extends CrudRepository<Book, Integer>{

}

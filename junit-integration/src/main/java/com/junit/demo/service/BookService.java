package com.junit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.demo.model.Book;
import com.junit.demo.repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	
	
	public Book addNewBook(Book book) {
		return bookRepo.save(book);
	}


	public Book updateBookById(Book book, int id) 
	{
		Book prevoiusBook=bookRepo.findById(id).orElse(new Book());
		if((prevoiusBook != null)&&(prevoiusBook.getId() == id))
		{
			book.setId(id);
			return bookRepo.save(book);
		}
		else
		{
			return new Book();
		}
	}


	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}


	public void removeBookById(int id)
	{
		bookRepo.deleteById(id);
	}


	public Book getBooksByName(String name) {
		return bookRepo.getByName(name);
	}


	public Book getBooksByAuthor(String author) {
		return bookRepo.getBooksByAuthor(author);
	}


	

}

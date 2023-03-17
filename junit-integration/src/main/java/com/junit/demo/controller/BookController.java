package com.junit.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.demo.model.Book;
import com.junit.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController 
{
	@Autowired
	BookService bookServe;
	
	@PostMapping("/addBook")
	public Book createNewBook(@RequestBody Book book)
	{
		return bookServe.addNewBook(book);
	}
	
	@PutMapping("/update/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable int id)
	{
		return bookServe.updateBookById(book,id);
	}

	@GetMapping("/allBook")
	public List<Book> getAllBook()
	{
		return bookServe.getAllBooks();
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteBookById(@PathVariable int id)
	{
		bookServe.removeBookById(id);
		
		return "successfully removed....."+id;
	}
	
	@GetMapping("/findByName/{name}")
	public Book getBookByName(@PathVariable String name) 
	{
		return bookServe.getBooksByName(name);
	}
	
	@GetMapping("/findByAuthor/{author}")
	public Book getBookByAuthor(@PathVariable String author) 
	{
		return bookServe.getBooksByAuthor(author);
	}
}

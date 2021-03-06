package com.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.models.Book;
import com.qa.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book createBook (Book b)
	{
		return bookRepository.save(b);
	}
	
	public Iterable<Book> getAllBooks()
	{
		return bookRepository.findAll();
	}
}
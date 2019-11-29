package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;

public class ConfigurationBookAuthorClass {

	@Bean(name = "book")
	@Scope("prototype")
	public Book getBook() {
		Book book = new Book();
		book.setAuthor("Dan Brown");
		book.setName("Inception");
		book.setPrice(250.0);
		return book;
		
	}
	
	@Bean(name = "author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("Sidney Sheldon");
		author.setPenName("Sid");
		return author;
	}
}

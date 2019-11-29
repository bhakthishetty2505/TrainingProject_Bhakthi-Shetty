package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;

public class BookAuthorApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
		Book book = context.getBean(Book.class);
		System.out.println(book.getAuthor());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
		System.out.println("*******************");
		
		Author author = context.getBean(Author.class);
		System.out.println(author.getName());
		System.out.println(author.getPenName());
	}
}

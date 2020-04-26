package com.cg.iter.main;

import javax.persistence.EntityManager;


import com.cg.iter.entities.Author;
import com.cg.iter.entities.Book;
import com.cg.iter.util.Jpa;

public class AddValue {
	Jpa con;
	EntityManager manager;
	
	public AddValue() {
		
		con=new Jpa();
		manager=con.getManager();
		
		Author William = new Author("William");
		Book book1 = new Book(32453 ,"The Plays " , 500);
		William.getBookList().add(book1);
		book1.getAuthorList().add(William);
		
	
		Author James = new Author("James");
		Book book2 = new Book(62353,"Daisy Miller" , 250);
		James.getBookList().add(book2);
		book2.getAuthorList().add(James);
		
		
		Author Jane = new Author("Jane");
		Book book3 = new Book(45216,"Real Thing" , 750);
		Jane.getBookList().add(book3);
		book3.getAuthorList().add(Jane);
		
		manager.getTransaction().begin();
		manager.persist(William);
		manager.persist(book1);
	
		manager.persist(James);
		manager.persist(book2);
		
		manager.persist(Jane);
		manager.persist(book3);
		manager.getTransaction().commit();
		
		
		
		
	}

	


}

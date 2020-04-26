package com.cg.iter.service;

import com.cg.iter.dao.AuthorDAO;
import com.cg.iter.dao.AuthorDAOImpl;
import com.cg.iter.entity.Author;

public class AuthorServiceImpl implements AuthorService {
	AuthorDAO dao = new AuthorDAOImpl();

	@Override
	public boolean addAuthor(Author author) {
		return dao.addAuthor(author);
	}

	@Override
	public Author updateAuthor(Author author) {
		return dao.updateAuthor(author);
	}

	@Override
	public boolean deleteAuthor(Integer id) {
		return dao.deleteAuthor(dao.findAuthor(id));
	}
	
	public Author findAuthor(Integer id) {
		return dao.findAuthor(id); 
	}

}

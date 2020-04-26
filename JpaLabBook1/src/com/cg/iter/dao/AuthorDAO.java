package com.cg.iter.dao;

import com.cg.iter.entity.Author;

public interface AuthorDAO {

	public boolean addAuthor(Author author);

	public Author updateAuthor(Author author);

	public Author findAuthor(Integer id);

	public boolean deleteAuthor(Author Author);

}

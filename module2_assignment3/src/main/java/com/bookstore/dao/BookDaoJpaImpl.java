package com.bookstore.dao;

import java.util.List;

import com.bookstore.dto.Book;
import com.bookstore.exceptions.DaoException;
import com.bookstore.util.EMFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;

public class BookDaoJpaImpl implements BookDao {

   
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		EntityManager em = EMFactory.getEntityManager();
		try {
			List<Book> books = em.createQuery("select b from Book b", Book.class).getResultList();
			return books;
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new DaoException("Failed to fetch all books", e);
		}
	}
	
	@Override
    public Book addBook(Book book){
        EntityManager em = EMFactory.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(book);
            tx.commit();
            return book;
        } catch (PersistenceException e) {
        	if (tx.isActive()) tx.rollback();
            throw new DaoException("Failed to add book: " + book.getTitle(), e);
        } finally {
            em.close();
        }
    }


	@Override
	public void deleteBook(int id){
		// TODO Auto-generated method stub
		EntityManager em = EMFactory.getEntityManager();
        EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			Book book = em.find(Book.class, id);
			if(book==null) {
				throw new DaoException("No book found with id " + id, null);	
			}
			em.remove(book);
			tx.commit();
		} catch (PersistenceException e) {
			// TODO: handle exception
			if (tx.isActive()) tx.rollback();
			throw new DaoException("Failed to delete book with id " + id, e);
		} finally {
			em.close();
		}
	}

	@Override
	public void updateBook(int id, Book book) throws DaoException {
		// TODO Auto-generated method stub
		EntityManager em = EMFactory.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
			tx.begin();
			Book existingBook = em.find(Book.class, id);
			if(existingBook==null) {
				throw new DaoException("No book found with id " + id, null);
			}
			existingBook.setIsbn(book.getIsbn());
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setPrice(book.getPrice());
			em.merge(existingBook);
			tx.commit();
		} catch (PersistenceException e) {
			// TODO: handle exception
			if (tx.isActive()) tx.rollback();
			throw new DaoException("Failed to update book with id " + id, e);
		} finally {
			em.close();
		}
	}

	@Override
	public Book getBookById(int id) throws DaoException {
		// TODO Auto-generated method stub
		EntityManager em = EMFactory.getEntityManager();
		try {
			Book book = em.find(Book.class, id);
			if(book==null) {
				throw new DaoException("No book found with id " + id, null);
			}
			return book;
		} catch (PersistenceException e) {
			// TODO: handle exception
			 throw new DaoException("Failed to fetch book with id " + id, e);
		} finally {
			em.close();
		}
	}
}

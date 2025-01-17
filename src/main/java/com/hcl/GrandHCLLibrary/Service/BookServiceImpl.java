package com.hcl.GrandHCLLibrary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.GrandHCLLibrary.Entity.Book;
import com.hcl.GrandHCLLibrary.Exception.BookException;
import com.hcl.GrandHCLLibrary.Repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBoook(Book book) {
		if(book.getTitle().isEmpty() || book.getAuthor().isEmpty() || book.getEdition().isEmpty()) {
			throw new BookException("601","All fields must be filled.");
		}
		try {		
			Book bookAdd = bookRepository.save(book);
			return bookAdd;
		}catch(IllegalArgumentException e) {
			
			throw new BookException("602","You can't pass book attributes as null."+e.getMessage());
		}catch(Exception e) {

			throw new BookException("603","Something went wrong in service layer."+e.getMessage());
		}
	}

	@Override
	public List<Book> getAllBooks() {
		
		List<Book> list = bookRepository.findAll();
		
		if(list.isEmpty()) {
			throw new BookException("604","There is no book present in DB, Please insert first a book.");
		}

		try {
			return list;
			
		}catch(Exception e) {
			throw new BookException("605", "SOmething wrong with service layer."+e.getMessage());
		}
		
	}

	@Override
	public Book updateBoook(Book book) {
		if(book.getTitle().isEmpty() || book.getAuthor().isEmpty() || book.getEdition().isEmpty()) {
			throw new BookException("608","All fields must be filled.");
		}
		try {		
			Book bookAdd = bookRepository.save(book);
			return bookAdd;
		}catch(IllegalArgumentException e) {
			
			throw new BookException("609","You can't pass book attributes as null."+e.getMessage());
		}catch(Exception e) {

			throw new BookException("610","Something went wrong in service layer."+e.getMessage());
		}
	}
}

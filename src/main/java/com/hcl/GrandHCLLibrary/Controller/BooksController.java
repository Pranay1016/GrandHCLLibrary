package com.hcl.GrandHCLLibrary.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.GrandHCLLibrary.Entity.BookEntity;
import com.hcl.GrandHCLLibrary.Service.BooksService;

//Author : Pranay Kamble

@RestController
@RequestMapping("/BOOKS")
public class BooksController {
	@Autowired
	BooksService bookservice;
	
	//Search Books
	
	@PostMapping("/SEARCH_BY_CATEGORY")
	public ResponseEntity<Object> SEARCH_CATEGORY(@RequestBody HashMap<String, String> obj){
		ResponseEntity<Object> objEntity = new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		
		List<BookEntity> books = null;
		try {
			books = bookservice.SEARCH_CATEGORY(obj);
			if(books.isEmpty()) {
				objEntity =  new ResponseEntity<Object>(books,HttpStatus.OK);
			}else {
				objEntity =  new ResponseEntity<Object>(books,HttpStatus.OK);
			}
		}catch(Exception e) {
			e.printStackTrace();
			objEntity =  new ResponseEntity<Object>("ERROR",HttpStatus.BAD_REQUEST);
		}
		
		return objEntity;
		
	}
	
	@PostMapping("/SEARCH_BY_UUID/{UUID}")
	public ResponseEntity<Object> SEARCH_UUID(@PathVariable("UUID") Integer uuid){
		ResponseEntity<Object> objEntity = new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		
		Optional<BookEntity> books = null;
		try {
			books = bookservice.SEARCH_UUID(uuid);
			if(books.isEmpty()) {
				objEntity =  new ResponseEntity<Object>(books,HttpStatus.OK);
			}else {
				objEntity =  new ResponseEntity<Object>(books,HttpStatus.OK);
			}
		}catch(Exception e) {
			e.printStackTrace();
			objEntity =  new ResponseEntity<Object>("ERROR",HttpStatus.BAD_REQUEST);
		}
		
		return objEntity;
		
	}
	
	@PostMapping("/SEARCH_BY_TITLE")
	public ResponseEntity<Object> SEARCH_TITLE(@RequestBody HashMap<String, String> obj){
		ResponseEntity<Object> objEntity = new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		
		List<BookEntity> books = null;
		try {
			books = bookservice.SEARCH_TITLE(obj);
			if(books.isEmpty()) {
				objEntity =  new ResponseEntity<Object>(books,HttpStatus.OK);
			}else {
				objEntity =  new ResponseEntity<Object>(books,HttpStatus.OK);
			}
		}catch(Exception e) {
			e.printStackTrace();
			objEntity =  new ResponseEntity<Object>("ERROR",HttpStatus.BAD_REQUEST);
		}
		
		return objEntity;
		
	}
	
	@PostMapping("/SEARCH_BY_AUTHOR")
	public ResponseEntity<Object> SEARCH_BY_AUTHOR(@RequestBody HashMap<String, String> obj){
		ResponseEntity<Object> objEntity = new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		
		List<BookEntity> books = null;
		try {
			books = bookservice.SEARCH_BY_AUTHOR(obj);
			if(books.isEmpty()) {
				objEntity =  new ResponseEntity<Object>(books,HttpStatus.OK);
			}else {
				objEntity =  new ResponseEntity<Object>(books,HttpStatus.OK);
			}
		}catch(Exception e) {
			e.printStackTrace();
			objEntity =  new ResponseEntity<Object>("ERROR",HttpStatus.BAD_REQUEST);
		}
		
		return objEntity;
		
	}
	
	

}

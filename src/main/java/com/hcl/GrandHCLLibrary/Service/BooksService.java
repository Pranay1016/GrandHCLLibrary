package com.hcl.GrandHCLLibrary.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.GrandHCLLibrary.Entity.BookEntity;
import com.hcl.GrandHCLLibrary.Repository.BookRepo;

//Author : Pranay Kamble
@Service
public class BooksService {
	@Autowired
	BookRepo bookrepo;

	public List<BookEntity> SEARCH_CATEGORY(HashMap<String, String> obj) {
		
		
		String category = (String) obj.get("Category");
		
		return bookrepo.findByCATEGORY(category);
	}

	public Optional<BookEntity> SEARCH_UUID(Integer uuid2) {
		
		
		// TODO Auto-generated method stub
		return bookrepo.findByUUID(uuid2);
	}

	public List<BookEntity> SEARCH_TITLE(HashMap<String, String> obj) {
		String Title = (String) obj.get("Title");
		return bookrepo.findByTITLE(Title);
	}

	public List<BookEntity> SEARCH_BY_AUTHOR(HashMap<String, String> obj) {
		String Author = (String) obj.get("Author");
		// TODO Auto-generated method stub
		return bookrepo.findByAUTHOR(Author);
	}

}

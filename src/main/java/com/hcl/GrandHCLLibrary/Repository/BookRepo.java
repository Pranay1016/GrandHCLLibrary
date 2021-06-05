package com.hcl.GrandHCLLibrary.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.GrandHCLLibrary.Entity.BookEntity;

//Author : Pranay Kamble
public interface BookRepo extends JpaRepository<BookEntity, Long>{

	 List<BookEntity> findByCATEGORY(String cATEGORY);
	 
	 List<BookEntity> findByAUTHOR(String aUTHOR);
	 
	 Optional<BookEntity> findByUUID(Integer uUID);
	 
	 List<BookEntity> findByTITLE(String tITLE);
	 
	  
	 
	 
	
}

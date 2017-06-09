package com.qa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qa.models.Cart;

@Repository 
public interface CartRepository extends CrudRepository<Cart, Integer>{
	
	}

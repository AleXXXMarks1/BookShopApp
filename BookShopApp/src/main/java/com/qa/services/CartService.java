package com.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.models.Cart;
import com.qa.repositories.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
	public Cart createCart (Cart c)
	{
		return cartRepository.save(c);
	}
}

package com.qa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.qa.models.Book;
import com.qa.models.User;
import com.qa.services.BookService;
import com.qa.services.UserService;

@Controller
@SessionAttributes({"Alex's Book Shop"})
public class MainController {
		
		@Autowired 
		private UserService userService;
		@Autowired
		private BookService bookService;
		
		@RequestMapping("/homepage")
		public String homepage(){
			return "homepage";
		}
		
		@RequestMapping("/bookresults")
		public String bookresults (Model model)
		{
			Iterable<Book>allBooks=bookService.getAllBooks(); model.addAttribute("allBooks", allBooks);
			return "book_results";
		}
		
		@RequestMapping("/shoppingcart")
		public String shoppingcart (Model model)
		{
			return "shopping_cart";
		}
		
		@RequestMapping("/register")
		public String register()
		{
			return "registration";
		}
		
		@RequestMapping("/registrationprocess") 
		public String registrationProcess(@ModelAttribute User u)
		{
			if(!u.getFirstName().equals("") && !u.getLastName().equals("") && !u.getEmail().equals("") && !u.getPassword().equals(""))
			{
				userService.createUserRecord(u);
				System.out.println("Valid Input");
				return "reg_success";		
			}
			else
			{
				System.out.println("Invalid Input");
				return "reg_failed";
			}
			
		}
		
		@RequestMapping("/login")
		public String login()
		{
			return "login";
		}
		
		@RequestMapping("/loginprocess")
		public String loginProcess(@ModelAttribute User u)
		{
			User user = userService.checkEmailandPassword(u.getEmail(), u.getPassword());
			
			if(user!=null){
				System.out.println("Valid Input");
				return"login_success";
			} else {
				System.out.println("Invalid Input");
				return"login_fail";
			}
		}
		
	}


package com.qa.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qa.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("SELECT u from User u where u.email = :email and u.password = :password")
	public User verifyEmailandPassword(@Param("email")String email, @Param("password")String password);
	
}

package com.smart.dao;

import java.lang.annotation.Native;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	@Query(value ="select * from User u where u.email = 'xyz@gmail.com'",nativeQuery = true)
	public User getUserByUserName(@Param("email") String email);
}

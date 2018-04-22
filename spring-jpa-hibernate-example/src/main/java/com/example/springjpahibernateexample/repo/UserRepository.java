package com.example.springjpahibernateexample.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjpahibernateexample.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

	//Optional<List<Users>> findByName(String name);
	List<Users> findByName(String name);

	Users findAllById(Integer id);
		
}

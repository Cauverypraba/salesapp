package com.sales.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.sales.demo.Models.Users;

public interface UsersRepo extends CrudRepository<Users, Integer> {
	
}

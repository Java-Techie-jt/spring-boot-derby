package com.javatechie.derby.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatechie.derby.api.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	User findByName(String name);

}

package com.goodbooksread.dao;

import org.springframework.data.repository.CrudRepository;

import com.goodbooksread.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByNameAndEmail(String name, String email);

}

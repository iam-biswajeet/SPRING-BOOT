package com.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

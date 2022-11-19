package com.ashokit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.User;
@Repository
public interface UsersRepository extends CrudRepository<User,Integer> {

}

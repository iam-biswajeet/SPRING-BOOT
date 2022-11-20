package com.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.User;

@Repository
public interface UserRepository extends JpaRepository <User,Integer>{
	//public List<User> findByUserAge(Integer userAge);
	
	public List<User> findByUserCountry(String userCountry);
	
	public List<User> findByUserAgeAndUserCountry(Integer userAge,String userCountry);
	
	public List<User> findByUserAgeIn(List<Integer> ages);
	
	@Query("FROM User WHERE userName=:name1 OR userName=:name2 ")
	public List<User> getUsers(String name1,String name2 );
}

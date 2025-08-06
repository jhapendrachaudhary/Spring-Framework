package com.springboot.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.web.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
public List<User> findByName(String name);

//jpql
@Query("select u FROM User u")
public List<User> getAllName();

//argument
@Query("Select u from User u Where u.name =:n and u.city =:c")
public List<User> getAllByNameAndCity(@Param("n") String name, @Param("c") String city);

//Native or sql query
@Query(value = "select * from user", nativeQuery = true)
public List<User> getAllDataBySQL();

}

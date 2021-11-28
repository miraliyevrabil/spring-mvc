package com.rabilmiraliyev.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rabilmiraliyev.test.model.Users;

import projection.UsersUsername;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	List<Users> findAll();

//	void deleteById(String username);
	@Query(nativeQuery = true,value = "select username users_username from Users where username not in (select username from Authorities)")
	List<UsersUsername> getUsersUsername();
}

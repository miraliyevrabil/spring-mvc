package com.rabilmiraliyev.test.service;

import java.util.List;

import com.rabilmiraliyev.test.model.Users;

public interface UsersService {
	List<Users> findAll();
	Users finUsers(Long id);
	Users findUsers(String username);
	void createUsers(Users users);
	void updateUsers(Users users);
	void deleteUsers(Long id);

}

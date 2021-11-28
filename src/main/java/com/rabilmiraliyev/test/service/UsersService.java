package com.rabilmiraliyev.test.service;

import java.util.List;

import com.rabilmiraliyev.test.model.Users;

import projection.UsersUsername;

public interface UsersService {
	List<Users> findAll();
	Users finUsers(Long id);
	void createUsers(Users users);
	void updateUsers(Users users);
	void deleteUsers(Long id);
	List<UsersUsername> getUsersUsername();

}

package com.rabilmiraliyev.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.rabilmiraliyev.test.dao.UsersRepository;
import com.rabilmiraliyev.test.model.Users;

import projection.UsersUsername;
@Service
@Secured("ROLE_ADMIN")
public class UsersServiceImpl implements UsersService{
		
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public List<Users> findAll() {
		
		return usersRepository.findAll();
	}

	@Override
	public void createUsers(Users users) {
		usersRepository.save(users);
		
	}

	@Override
	public void updateUsers(Users users) {
		usersRepository.save(users);
		
	}

	@Override
	public void deleteUsers(Long id) {
		
		usersRepository.deleteById(id);
		
	}

	@Override
	public Users finUsers(Long id) {
		Users users = usersRepository.getOne(id);
		return users;
	}

	@Override
	public List<UsersUsername> getUsersUsername() {
		List<UsersUsername> lists = usersRepository.getUsersUsername();
		return lists;
	}

}

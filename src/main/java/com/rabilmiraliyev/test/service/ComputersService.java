package com.rabilmiraliyev.test.service;

import java.util.List;

import com.rabilmiraliyev.test.model.Computers;

public interface ComputersService {
	List<Computers> findComputers();
	Computers findComputers(Long id);
	void createComputers(Computers computers);
	void update(Computers computers);
	void deleteComputers(Long id);
}

package com.rabilmiraliyev.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.rabilmiraliyev.test.dao.ComputerRepository;
import com.rabilmiraliyev.test.model.Computers;
@Service
public class ComputersServiceImpl implements ComputersService {
	@Autowired
	private ComputerRepository computerRepository;
	
	@Override
	@Secured(value = {"ROLE_ADMIN","ROLE_EDITOR"})
	public List<Computers> findComputers() {
		// TODO Auto-generated method stub
		return computerRepository.findAll();
	}

	@Override
	@Secured(value = {"ROLE_ADMIN","ROLE_EDITOR"})
	public Computers findComputers(Long id) {
		Computers computers = computerRepository.getOne(id);
		return computers;
	}

	@Override
	@Secured("ROLE_ADMIN")
	public void createComputers(Computers computers) {
		computerRepository.save(computers);
		
	}

	@Override
	@Secured(value = {"ROLE_ADMIN","ROLE_EDITOR"})
	public void update(Computers computers) {
		computerRepository.save(computers);
		
	}

	@Override
	@Secured("ROLE_ADMIN")
	public void deleteComputers(Long id) {
		computerRepository.deleteById(id);
		
	}

}

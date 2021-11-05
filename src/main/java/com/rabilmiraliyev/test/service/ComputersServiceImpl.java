package com.rabilmiraliyev.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabilmiraliyev.test.dao.ComputerRepository;
import com.rabilmiraliyev.test.model.Computers;
@Service
public class ComputersServiceImpl implements ComputersService {
	@Autowired
	private ComputerRepository computerRepository;
	
	@Override
	public List<Computers> findComputers() {
		// TODO Auto-generated method stub
		return computerRepository.findAll();
	}

	@Override
	public Computers findComputers(Long id) {
		Computers computers = computerRepository.getOne(id);
		return computers;
	}

	@Override
	public void createComputers(Computers computers) {
		computerRepository.save(computers);
		
	}

	@Override
	public void update(Computers computers) {
		computerRepository.save(computers);
		
	}

	@Override
	public void deleteComputers(Long id) {
		computerRepository.deleteById(id);
		
	}

}

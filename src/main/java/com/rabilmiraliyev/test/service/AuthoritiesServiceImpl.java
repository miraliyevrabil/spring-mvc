package com.rabilmiraliyev.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.rabilmiraliyev.test.dao.AuthoritiesRepository;
import com.rabilmiraliyev.test.model.Authorities;
@Service
@Secured("ROLE_ADMIN")
public class AuthoritiesServiceImpl implements AuthoritiesService {
	@Autowired
	private AuthoritiesRepository authoritiesRepository;
	
	@Override
	public List<Authorities> findAll() {
		
		return authoritiesRepository.findAll();
	}

	@Override
	public Authorities findAuthorities(String username) {
		Authorities authorities =authoritiesRepository.getOne(username);
		return authorities;
	}

	@Override
	public void createAuthorities(Authorities authorities) {
		authoritiesRepository.save(authorities);
		
	}

	@Override
	public void updateAuthorities(Authorities authorities) {
		authoritiesRepository.save(authorities);
		
	}

	@Override
	public void deleteAuthorities(String username) {
		authoritiesRepository.deleteById(username);
		
	}

}

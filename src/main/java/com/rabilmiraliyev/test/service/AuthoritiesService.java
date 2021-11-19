package com.rabilmiraliyev.test.service;

import java.util.List;

import com.rabilmiraliyev.test.model.Authorities;

public interface AuthoritiesService {
	List<Authorities> findAll();
	Authorities findAuthorities(String username);
	void createAuthorities(Authorities authorities);
	void updateAuthorities(Authorities authorities);
	void deleteAuthorities(String username);

}

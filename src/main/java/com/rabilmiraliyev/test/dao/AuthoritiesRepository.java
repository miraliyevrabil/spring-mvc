package com.rabilmiraliyev.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rabilmiraliyev.test.model.Authorities;

@Repository
public interface AuthoritiesRepository extends JpaRepository<Authorities, String> {
	List<Authorities> findAll();
}

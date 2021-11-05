package com.rabilmiraliyev.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rabilmiraliyev.test.model.Computers;

@Repository
public interface ComputerRepository extends JpaRepository<Computers, Long> {
	List<Computers> findAll();
}

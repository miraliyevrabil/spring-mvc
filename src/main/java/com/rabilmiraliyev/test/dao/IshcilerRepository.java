package com.rabilmiraliyev.test.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rabilmiraliyev.test.model.Ishciler;

@Repository
public interface IshcilerRepository extends JpaRepository<Ishciler, Long> {
	List<Ishciler> findAll();
//	Ishciler findById(Long id);
//	void create (Ishciler ishciler);
//	Ishciler update(Ishciler ishciler);
//	void delete(Long id);
	
}

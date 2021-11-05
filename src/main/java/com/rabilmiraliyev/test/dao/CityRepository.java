package com.rabilmiraliyev.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rabilmiraliyev.test.model.City;
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
	List<City> findAll();

}

package com.rabilmiraliyev.test.service;

import java.util.List;

import com.rabilmiraliyev.test.model.City;



public interface CityService {
	List<City> findCity();
	City findCity(Long id);
	void createCity(City city);
	void update(City City);
	void deleteCity(Long id);
}

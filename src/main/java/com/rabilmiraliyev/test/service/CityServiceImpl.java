package com.rabilmiraliyev.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.rabilmiraliyev.test.dao.CityRepository;
import com.rabilmiraliyev.test.model.City;
@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	@Secured(value = {"ROLE_ADMIN","ROLE_EDITOR"})
	public List<City> findCity() {
		// TODO Auto-generated method stub
		return cityRepository.findAll();
	}

	@Override
	@Secured(value = {"ROLE_ADMIN","ROLE_EDITOR"})
	public City findCity(Long id) {
		City city = cityRepository.getOne(id);
		return city;
	}

	@Override
	@Secured("ROLE_ADMIN")
	public void createCity(City city) {
		cityRepository.save(city);
		
	}

	@Override
	@Secured(value = {"ROLE_ADMIN","ROLE_EDITOR"})
	public void update(City city) {
		cityRepository.save(city);
		
	}

	@Override
	@Secured("ROLE_ADMIN")
	public void deleteCity(Long id) {
		cityRepository.deleteById(id);
		
	}

}

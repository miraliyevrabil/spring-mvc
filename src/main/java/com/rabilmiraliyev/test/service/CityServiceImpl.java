package com.rabilmiraliyev.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabilmiraliyev.test.dao.CityRepository;
import com.rabilmiraliyev.test.model.City;
@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> findCity() {
		// TODO Auto-generated method stub
		return cityRepository.findAll();
	}

	@Override
	public City findCity(Long id) {
		City city = cityRepository.getOne(id);
		return city;
	}

	@Override
	public void createCity(City city) {
		cityRepository.save(city);
		
	}

	@Override
	public void update(City city) {
		cityRepository.save(city);
		
	}

	@Override
	public void deleteCity(Long id) {
		cityRepository.deleteById(id);
		
	}

}

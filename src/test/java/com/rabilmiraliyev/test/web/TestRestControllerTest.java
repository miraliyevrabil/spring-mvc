package com.rabilmiraliyev.test.web;

import java.net.URI;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.rabilmiraliyev.test.model.Ishciler;

import ch.qos.logback.core.boolex.Matcher;
import junit.framework.Assert;

public class TestRestControllerTest {
	private RestTemplate restTemplate;
	
	
	@Before
	public void setUp() {
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void testDeleteIshciler() {
		restTemplate.delete("http://localhost:8080/rest/ishciler/1");
		try {
		restTemplate.getForEntity("http://localhost:8080/rest/ishciler/1", Ishciler.class);
		Assert.fail("bele ishci yoxdur");
		}catch (HttpClientErrorException ex) {
			MatcherAssert.assertThat(ex.getStatusCode().value(), Matchers.equalTo(404));
		}
	}
	
	
	
	@Test
	public void testUpdateIshciler() {
		Ishciler ishciler = restTemplate.getForObject("http://localhost:8080/rest/ishciler/1", Ishciler.class);
		
		MatcherAssert.assertThat(ishciler.getAd(), Matchers.equalTo("Eli"));
		
		ishciler.setAd("Eli ELI");
		restTemplate.put("http://localhost:8080/rest/ishciler/1", ishciler);
		
		ishciler = restTemplate.getForObject("http://localhost:8080/rest/ishciler/1", Ishciler.class);
		
		MatcherAssert.assertThat(ishciler.getAd(), Matchers.equalTo("Eli ELI"));
		
	}
	
	@Test
	public void testCreateIshciler() {
		Ishciler ishciler = new Ishciler();
		ishciler.setAd("Qaray");
		ishciler.setSoyad("Qarayev");
		//ishciler.setDogumTarixi(1992);
		ishciler.setBolme1("Muhafize");
		ishciler.setUnvan("Sumqayit");
		ishciler.setMaas(500);
		
		
		URI location = restTemplate.postForLocation("http://localhost:8080/rest/ishciler", ishciler);
		
		Ishciler ishciler2 = restTemplate.getForObject(location, Ishciler.class);
		
		MatcherAssert.assertThat(ishciler2.getAd(), Matchers.equalTo(ishciler.getAd()));
		MatcherAssert.assertThat(ishciler2.getSoyad(), Matchers.equalTo(ishciler.getSoyad()));
		MatcherAssert.assertThat(ishciler2.getDogumTarixi(), Matchers.equalTo(ishciler.getDogumTarixi()));
		MatcherAssert.assertThat(ishciler2.getBolme1(), Matchers.equalTo(ishciler.getBolme1()));
		MatcherAssert.assertThat(ishciler2.getUnvan(), Matchers.equalTo(ishciler.getUnvan()));
		MatcherAssert.assertThat(ishciler2.getMaas(), Matchers.equalTo(ishciler.getMaas()));
		
	}
	
	
	@Test
	public void testGetIshcilerById() {
		ResponseEntity<Ishciler> response = restTemplate.getForEntity("http://localhost:8080/rest/ishciler/1", Ishciler.class);
		
		MatcherAssert.assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
	}
	
	@Test
	public void getIshciler() {
		ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8080/rest/ishciler", List.class);
		
		MatcherAssert.assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
	}
}

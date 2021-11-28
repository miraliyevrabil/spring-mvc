package com.rabilmiraliyev.test.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rabilmiraliyev.test.exception.InternalServerException;
import com.rabilmiraliyev.test.exception.IshcilerNotFoundException;
import com.rabilmiraliyev.test.model.Authorities;
import com.rabilmiraliyev.test.model.Ishciler;
import com.rabilmiraliyev.test.service.TestService;
import com.rabilmiraliyev.test.service.UsersService;

import projection.UsersUsername;

@RestController
@RequestMapping("/rest")
public class TestRestController {
	@Autowired
	private TestService testService;

	@Autowired
	private UsersService usersService;

	@RequestMapping(method = RequestMethod.DELETE, value = "/ishciler/{id}")
	public ResponseEntity<?> deleteIshciler(@PathVariable("id") Long id) {
		try {
			testService.deleteIshciler(id);
			return ResponseEntity.ok().build();
		} catch (IshcilerNotFoundException ex) {
			throw ex;
		} catch (Exception ex) {
			throw new InternalServerException(ex);
		}
	}

	@RequestMapping(method = RequestMethod.PUT, value = ("/ishciler/{id}"))
	public ResponseEntity<?> updateIshciler(@PathVariable("id") Long id, @RequestBody Ishciler ishcilerRequest) {
		try {
			Ishciler ishciler = testService.findIshciler(id);
			ishciler.setAd(ishcilerRequest.getAd());
			ishciler.setSoyad(ishcilerRequest.getSoyad());
			ishciler.setBolme1(ishcilerRequest.getBolme1());
			ishciler.setUnvan(ishcilerRequest.getUnvan());
			ishciler.setMaas(ishcilerRequest.getMaas());
			return ResponseEntity.ok().build();

		} catch (IshcilerNotFoundException ex) {
			return ResponseEntity.notFound().build();
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@RequestMapping(method = RequestMethod.POST, value = ("/ishciler"))
	public ResponseEntity<URI> createIshciler(@RequestBody Ishciler ishciler) {
		try {
			testService.createIshciler(ishciler);
			Long id = ishciler.getId();
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
			return ResponseEntity.created(location).build();
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/ishciler")
	public ResponseEntity<List<Ishciler>> getIshciler() {
		List<Ishciler> ishcilers = testService.findIshciler();
		return ResponseEntity.ok(ishcilers);
	}

	
	@RequestMapping(method = RequestMethod.GET, value = "/ishciler/{id}",produces = "application/json" )
	public ResponseEntity<?> getIshcilerAsHateoasResource(@PathVariable("id") Long id){
		try {
			Ishciler ishciler = testService.findIshciler(id);
			Link self = ControllerLinkBuilder.linkTo(TestRestController.class).slash("/ishciler/"+id).withSelfRel();
			Link create = ControllerLinkBuilder.linkTo(TestRestController.class).slash("/ishciler").withRel("create");
			Link update = ControllerLinkBuilder.linkTo(TestRestController.class).slash("/ishciler/"+id).withRel("update");
			Link delete = ControllerLinkBuilder.linkTo(TestRestController.class).slash("/ishciler/"+id).withRel("delete");
			Resource<Ishciler> resource = new Resource<Ishciler>(ishciler, self,create,update,delete);
			return ResponseEntity.ok(resource);
		} catch (IshcilerNotFoundException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/ishciler/{id}")
	public ResponseEntity<Ishciler> getIshcilerById(@PathVariable("id") Long id) {
		try {
			Ishciler ishciler = testService.findIshciler(id);
			return ResponseEntity.ok(ishciler);
		} catch (IshcilerNotFoundException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@RequestMapping(value = "/testauth",method = RequestMethod.GET)
	public List<UsersUsername> newAuthorities(Authorities authorities) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("usersusername", usersService.getUsersUsername());
//		mav.setViewName("newAuthorities");
		return usersService.getUsersUsername();
	}
}

package com.rabilmiraliyev.test.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rabilmiraliyev.test.service.TestService;

import projection.IshcilerIdAndName;
import projection.MaxUsersCity;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
//	@Autowired
//	private CityService cityService;
	
	@RequestMapping("/ishciler")
	public ModelAndView getishciler() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ishciler", testService.findIshciler());
		mav.setViewName("ishciler");
		return mav;
		
	}
	
	
	
	/*
	 * @RequestMapping("/test")
	 * 
	 * @ResponseBody public List<FullIstifadeciler> welcome() { return
	 * testService.getData(); }
	 */
	@RequestMapping("/test")
	public ModelAndView welcome() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("adlar", testService.getData());
		mav.setViewName("adlar");
		return mav;
	}
	@RequestMapping("/test1")
	@ResponseBody
	public ModelAndView welcome1( ) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("maxUsersCity", testService.getMaxUsersCity());
		mav.setViewName("maxUsersCity");
		return mav;
	}
	
	/*
	 * @RequestMapping("/test2")
	 * 
	 * @ResponseBody public List<StatsCity> welcome2(ModelAndView mav) { return
	 * testService.getStatsCity(); }
	 */
	@RequestMapping("/test2")
	public ModelAndView welcome2() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("stats", testService.getStatsCity());
	//	mav.addObject("stats", cityService.findCity());
		mav.setViewName("stats");
		return mav;
		
	}
	@RequestMapping("/test3")
	@ResponseBody
	public ModelAndView welcome3( ) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("sameComp", testService.getSameComp());
		mav.setViewName("sameComp");
		return mav;
	}
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
		
	}
		
		@RequestMapping("/login.html")
		public ModelAndView login() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("login");
			return mav;
		}
	
	
	
	
	
	
	
	
	
	
}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
import com.example.demo.model.Car;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("/addAlien")		
	public String AddAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@GetMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("getAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
//		System.out.println(repo.findByTech("Guitar"));
//		System.out.println(repo.findByAidGreaterThan(3));
//		System.out.println(repo.findByTechSorted("Guitar"));
		return mv;
	}
	
	@GetMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		return repo.findAll();
	}
	
	@GetMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAlienById(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	@GetMapping("/displayAliens")
	public ModelAndView displayAliens(Car car) {
		ModelAndView mv = new ModelAndView("displayAliens.jsp");
		String str1 = "testString";
		mv.addObject("obj",car);		
		mv.addObject("stringExample",str1);
		return(mv);
	}
	
//	@GetMapping("/deleteAlien")
//	public ModelAndView deleteAlien(@RequestParam int aid) {
//		ModelAndView mv = new ModelAndView("deleteAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		
//		return mv;
//		
//	}
}

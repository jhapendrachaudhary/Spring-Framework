package com.practice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler");
		model.addAttribute("name", "hello hello");
		model.addAttribute("nothing", "nothing");
		
		return "about";
	}
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		List<String> friutsList = List.of("mango","banana","orange","apple");
		m.addAttribute("list", friutsList);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("condition handler execute....");
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "M");
		
		List<Integer> list =  List.of();
		m.addAttribute("num", list);
		return "condition";
	}
	
	@GetMapping("/services")
	public String servicesHandler() {
		
		return "services";
	}
	
	@GetMapping("/base")
	public String basehandler() {
		
		return "base";
	}
}

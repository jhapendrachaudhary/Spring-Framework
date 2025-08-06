package springmvc.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	 @GetMapping("/springmvc/")
	 @RequestMapping("/home")
	public String home(Model model) {
		System.out.println("succussefuly running");
		model.addAttribute("name","kupa and popol");
		
		List<String> friutsList = new ArrayList<String>();
		friutsList.add("Apple");
		friutsList.add("BigApple");
		friutsList.add("SmallApple");
		friutsList.add("RedApple");
		model.addAttribute("Friuts", friutsList);
		return "index";
	}
	 @RequestMapping("/")
	 public ModelAndView help() {
		 ModelAndView modelAndView = new ModelAndView();
		 
		 ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kathmandu"));
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a z");
		 String formattedDateTime = now.format(formatter);
		 
		 List<Integer> id = new ArrayList<Integer>();
		 id.add(20);
		 id.add(1039);
		 id.add(912);
		 id.add(384);
		 id.add(347);
		 id.add(1000);
		 
		 modelAndView.addObject("Copy","5 Times");
		 modelAndView.addObject("time", formattedDateTime);
		 modelAndView.addObject("ids",id);
		 modelAndView.setViewName("help");
		 
		 return modelAndView;
	 }
	
}

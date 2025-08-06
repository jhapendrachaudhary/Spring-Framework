package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

//ModelAttribute
@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataFormModel(Model m) {
		m.addAttribute("dec", "hello world i am single");
		m.addAttribute("np", "क्ष लभभम नषचिाचषभलम");
	}

	@RequestMapping("/contact")
	public String getForm() {
		return "contact";
	}
	
	
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user ,  Model model) {
		if (user.getName().isBlank()) {
			return "redirect:/contact";
		}
		
		this.userService.createUser(user);
		return "success";
	}
	
}
	
//using controller 
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("name") String uname,
//			@RequestParam("email") String email,
//			@RequestParam("message") String message, Model model) {
//
//		 User user = new User();
//		 user.setName(uname);
//		 user.setEmail(email);
//		 user.setMessage(message);
//		
//		 model.addAttribute(user);
////		model.addAttribute("name",uname);
////		model.addAttribute("email",email);
////		model.addAttribute("message",message);
//		return "success";
//	}
//	
//}

package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
//	public String one() {
//		System.out.println("I am one handler");
//		return " ";
//	}
	public RedirectView one() {
		System.out.println("I am one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://mvnrepository.com/artifact/org.springframework/spring-core/5.3.30");
		return redirectView;
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("I am second handler(enjoy)");
		return " ";
	}
	

}

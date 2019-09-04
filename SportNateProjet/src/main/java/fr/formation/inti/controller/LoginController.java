package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
@RequestMapping("/")
	public String login(Model model) {
		 return "view/login";
		
	}

@RequestMapping("/accueil")
public String accueil(Model model) {
	 return "view/accueil";
}

@RequestMapping("/index")
public String index(Model model) {
	 return "view/index";
}	

@RequestMapping("/inscription")
public String inscription(Model model) {
	 return "view/inscription";
}	
}

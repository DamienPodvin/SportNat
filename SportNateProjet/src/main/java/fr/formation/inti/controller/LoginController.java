package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
@RequestMapping("/login")
	public String login(Model model) {
		 return "view/login";
		
	}

@RequestMapping("/accueil")
public String accueil(Model model) {
	 return "view/accueil";
}

	
}

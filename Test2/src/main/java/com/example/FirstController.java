package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@RequestMapping("/")
	public String 	affichage(Model m){
		m.addAttribute("hi", "helloow");
		return "simple";
	}
}

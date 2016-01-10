package com.example;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
@Inject
VegetableRep variable;
	
Vegetable v1 = new Vegetable("Veg1","Red",12.12);
Vegetable v2 = new Vegetable("Veg2","Blue",13.13);
Vegetable v3 = new Vegetable("Veg3","Green",14.14);

TempVegetableRep tv = new TempVegetableRep();


	@RequestMapping("/")
	public String 	affichage(Model m){
		m.addAttribute("hi", "helloow");
		return "simple";
	}
}

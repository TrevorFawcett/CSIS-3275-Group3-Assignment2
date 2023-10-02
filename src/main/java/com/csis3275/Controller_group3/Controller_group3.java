package com.csis3275.Controller_group3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_group3 {
	
	@GetMapping("/")
	public String showMainPage(Model model) {
		
		
		return "Page.html";
	}
	
	
	@GetMapping("/carlos")
	public String showCarlosPage(Model model) {
		
		return "carlos.html";
	}

}

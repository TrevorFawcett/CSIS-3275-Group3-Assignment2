package com.csis3275.Controller_group3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model_group3.model_trevor_group3;

@Controller
public class Controller_group3 {
	
	@GetMapping("/")
	public String showMainPage(Model model) {
		
		
		return "Page.html";
	}
	
	@GetMapping("/trevor")
	 public String changePage(Model model) {
		model.addAttribute("trevor", new model_trevor_group3());
	
		return "TrevorFawcett";
	 }

}

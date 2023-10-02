package com.csis3275.Controller_group3;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.csis3275.Model_group3.Carlos_group3;

@Controller
public class Controller_group3 {
	
	public Carlos_group3 c1;
	
	@GetMapping("/")
	public String showMainPage(Model model) {
		
		
		return "Page.html";
	}
	
	
	@GetMapping("/carlos")
	public String showCarlosPage(Model model) {
		
		c1 = new Carlos_group3("Carlos", 20, "Comp Studies & Info Systems");
		model.addAttribute("carlos", c1);
		
		return "carlos.html";
	}

}

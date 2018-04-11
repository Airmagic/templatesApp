//showing where the classes are located
package com.erich.template_app;

//importing all the dependancies from the page
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

// calling the spring boot app and the controller
@SpringBootApplication
@Controller

//This class is the information for the what is called from the web page
public class TemplateAppApplication {

//	this is making the route for the home page
	@RequestMapping("/")
    public String home(Model model){
//		making attributes for the webpage to call
		model.addAttribute("author", "Eric");
		model.addAttribute("favoriteFood", "pizza");
		model.addAttribute("shows", "Venture Brothers");

//		making a list for the web page to pull
		List favoriteFoods = Arrays.asList("burgers", "steak", "BBQ");
		model.addAttribute("favoriteFoods", favoriteFoods);
//		returning the information back to the homepage
	    return "index.html";
    }

	public static void main(String[] args) {
		SpringApplication.run(TemplateAppApplication.class, args);
	}
}

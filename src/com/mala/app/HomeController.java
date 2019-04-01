package com.mala.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMyPage() {
		return "home";
	}
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value = "/formFish", method = RequestMethod.GET)
	public ModelAndView showFishForm() {
		return new ModelAndView("formFish","fish", new Fish());
	}
	
	@RequestMapping(value = "/addFish", method = RequestMethod.POST)
	public String submitFish( @ModelAttribute("fish")Fish fish, 
			BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("fishName", fish.getFishName());
		model.addAttribute("fishMass", fish.getFishMass());
		return "detailFish";
	}
}

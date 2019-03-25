package com.mala;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FishController {
	
	@RequestMapping("/showForm")
	public String FishCreate() {
		return "showForm";
	}
}

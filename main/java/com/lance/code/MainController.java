package com.lance.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";
	}
//	@RequestMapping("/createError")
//	public String errorMessage(RedirectAttributes redirectAttributes) {
//		redirectAttributes.addFlashAttribute("error", "You must train harder!");
//		return "redirect:/";
//	}
	@RequestMapping( value="/code", method=RequestMethod.POST)
	public String getCode(@RequestParam(value="password") String password, 
							RedirectAttributes redirectAttributes) {
		if(password.equals("bushido")) {
			return "redirect:/showcode";
		}else{
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	@RequestMapping("/showcode")
	public String showCode() {
		
		return "code.jsp";
	}
}

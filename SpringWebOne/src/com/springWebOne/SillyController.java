package com.springWebOne;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SillyController {
	
		@RequestMapping("/")
		public String helloWorld() {
			return "main-menu";
		}
	
		@RequestMapping("/showform")
		public String showForm() {
			return "HelloworldForm";
		}
		
		@RequestMapping("/processForm")
		public String processForm() {
			return "processedForm";
		}
		
		@RequestMapping("/processModelForm")
		public String prcessModelForm(@RequestParam("studentName") String Stuname, Model model) {
			String upName = Stuname.toUpperCase();
			model.addAttribute("UpperCase", upName);
			return "processedForm";
			
		}
}

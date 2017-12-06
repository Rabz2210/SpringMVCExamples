package com.springWebOne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
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
}

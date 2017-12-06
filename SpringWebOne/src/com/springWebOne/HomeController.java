package com.springWebOne;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		@RequestMapping("/processModelForm")
		public String prcessModelForm(HttpServletRequest request, Model model) {
			String Stuname = request.getParameter("studentName");
			String upName = Stuname.toUpperCase();
			model.addAttribute("UpperCase", upName);
			return "processedForm";
			
		}
}

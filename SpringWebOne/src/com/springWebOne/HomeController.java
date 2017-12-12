package com.springWebOne;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
		@RequestMapping({"/","/main-page"})
		public String helloWorld() {
			return "main-menu";
		}
		@RequestMapping("/directToForm")
		public String directToForm(Model themodel) {
			themodel.addAttribute("theStudent", new Student());
			System.out.println("directing to the st"
					+ "modeludent form");
			return "studentForm";
		}
	
		@RequestMapping("/showform")
		public String showForm(@ModelAttribute("theStudent") Student theStudent) {
			System.out.println(theStudent.getFname()+" "+theStudent.getLname());
			return "processedForm";
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

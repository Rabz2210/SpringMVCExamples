package com.springWebOne;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
		//Adding init Binder to convert or trim input string
		//remove leading or trailing white spaces
		//resolve issues for our validation.
		@InitBinder
		public void initBinder(WebDataBinder dataBinder) {
			StringTrimmerEditor stringtrimmmereditor = new StringTrimmerEditor(true);
			dataBinder.registerCustomEditor(String.class, stringtrimmmereditor);
		}
		
		
	
		@RequestMapping("/showform")
		public String showForm(
					@Valid @ModelAttribute("theStudent") Student theStudent,
					BindingResult theBindingResult) {
			System.out.println("last Name: "+ theStudent.getLname());
			if(theBindingResult.hasErrors()) {
				return "studentForm";
			}else {
				System.out.println(theStudent.getFname()+" "+theStudent.getLname());
				return "processedForm";
			}
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

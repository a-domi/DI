package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class employeeController {

	private final EmployeeService employeeService;
	
	// EmployeeServiceの依存性の注入
	public employeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/input")
	public String index(EmployeeForm employeeForm) {
		return "index.html";
	}
	
	@RequestMapping("/output")
	public String result(@Validated EmployeeForm employeeForm, BindingResult bindingResult ,Model model) {
		
		if (bindingResult.hasErrors()) {
			return "index.html";
		}

		// サービス層から社員を検索
		String name = employeeService.findByEmployee(employeeForm.getNumber());
		model.addAttribute("number", employeeForm.getNumber());
		model.addAttribute("name", name);
		return "output.html";
	}
}

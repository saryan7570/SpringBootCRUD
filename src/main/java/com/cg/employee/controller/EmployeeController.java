package com.cg.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.employee.entity.Employee;
import com.cg.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="addEmp", method=RequestMethod.POST)
	public String addEmp(Employee employee) {
		employeeService.addEmp(employee);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping(value="searchEmp", method=RequestMethod.POST)
	public ModelAndView searchEmp(Employee employee) {
		ModelAndView modelAndView = new ModelAndView("viewEmp");
		employee = employeeService.searchEmp(employee);
		modelAndView.addObject(employee);
		return modelAndView;
	}
	
	@RequestMapping(value="listEmp", method=RequestMethod.GET)
	public ModelAndView listEmp() {
		ModelAndView modelAndView = new ModelAndView("listEmp");
//		List<Employee> employeeList = employeeService.listEmp();
		List<String> employeeList = getList();
		modelAndView.addObject("employeeList", employeeList);
		return modelAndView;
	}
	
	public List<String> getList(){
		List<String> list = new ArrayList<String>();
		list.add("Nitin");
		list.add("Singh");
		return list;
	}
	
}
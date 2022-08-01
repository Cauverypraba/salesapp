package com.sales.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sales.demo.Models.Employee;
import com.sales.demo.repo.EmployeeRepo;

import antlr.collections.List;

@RestController
public class HomeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@GetMapping(value ="/")
	public String index() {
		return "Welcome";
	}
	
//	@GetMapping(value = "/employees")
//    public Iterable<Employee> getEmployees() {
//    	return repo.findAll();
//    }
//	
//	@PostMapping(value = "/addEmployee")
//	public String addEmployee(@RequestBody Employee emp) {
//		repo.save(emp);
//		return "Employee is added!";
//	}
//	
//	@GetMapping(value = "/getEmployee/{empid}")
//	public Employee getEmployee(@PathVariable int empid) {
//		Employee emp = repo.findById(empid).get();
//		return emp;
//	}
	

}

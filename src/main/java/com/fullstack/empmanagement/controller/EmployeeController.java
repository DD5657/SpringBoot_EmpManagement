package com.fullstack.empmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.empmanagement.model.Employee;
import com.fullstack.empmanagement.repository.EmpRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmpRepository emprepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return emprepo.findAll();
		
	}
	
	@PostMapping("/createEmployees")
	public Employee createEmployees(@RequestBody Employee employee) {
		return emprepo.save(employee);
		
	}
	
	@PostMapping("/updateEmployees")
	public Employee updateEmployees(@RequestBody Employee employee) {
		return emprepo.save(employee);
		
	}
}

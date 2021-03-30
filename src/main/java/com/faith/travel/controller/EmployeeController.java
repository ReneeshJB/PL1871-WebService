package com.faith.travel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.travel.entity.Employee;
import com.faith.travel.entity.Login;
import com.faith.travel.service.IEmployeeService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("employees")
	public List<Employee> findAllUsers() {
		return employeeService.findAllEmployees();
	}

	@PostMapping("employees/add")
	public ResponseEntity<Employee> insertUser(@RequestBody Employee employee) {
		System.out.println("inserting");

		return new ResponseEntity<Employee>(employeeService.insertEmployee(employee), HttpStatus.OK);
	}
	@GetMapping("employees/{empId}")
	public Optional<Employee> findById(@PathVariable int empId) {

		return employeeService.findById(empId);
	}
}

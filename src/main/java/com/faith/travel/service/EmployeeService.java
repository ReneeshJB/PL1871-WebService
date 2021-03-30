package com.faith.travel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.travel.entity.Employee;
import com.faith.travel.repo.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private IEmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>) employeeRepo.findAll();
	}
	
	@Override
	public Optional<Employee> findById(int id) {
		return employeeRepo.findById(id);
	}
	
	@Transactional
	@Override
	public Employee insertEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@Transactional
	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	

	
}

package com.faith.travel.service;

import java.util.List;
import java.util.Optional;

import com.faith.travel.entity.Employee;

public interface IEmployeeService {

	public List<Employee> findAllEmployees();

	public Employee insertEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	Optional<Employee> findById(int id);
}

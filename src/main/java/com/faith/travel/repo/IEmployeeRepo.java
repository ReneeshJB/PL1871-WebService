package com.faith.travel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.travel.entity.Employee;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee, Integer>{

}

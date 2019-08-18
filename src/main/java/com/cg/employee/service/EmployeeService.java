package com.cg.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.entity.Employee;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public void addEmp(Employee employee) {
		employeeDao.addEmp(employee);
	}

	public Employee searchEmp(Employee employee) {
		return employeeDao.searchEmp(employee);
	}
	
	public List<Employee> listEmp() {
		return employeeDao.listEmp();
	}
}
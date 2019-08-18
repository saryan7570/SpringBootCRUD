package com.cg.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.employee.entity.Employee;

@Repository
public class EmployeeDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public void addEmp(Employee employee) {
		entityManager.persist(employee);
	}
	
	public Employee searchEmp(Employee employee) {
		 employee = entityManager.find(Employee.class, employee.getId());
		 return employee;
	}
	
	public List<Employee> listEmp() {
		TypedQuery<Employee> query = entityManager.createQuery("SELECT employee FROM employee AS employee", Employee.class);
		List<Employee> employeeList = query.getResultList();
		return employeeList;
	}
}
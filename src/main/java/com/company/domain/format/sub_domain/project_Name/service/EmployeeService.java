package com.company.domain.format.sub_domain.project_Name.service;

import java.util.List;

import com.company.domain.format.sub_domain.project_Name.dao.Employee;

/**
 * @author Pavan Yalamanchili
 *
 */

public interface EmployeeService {
	public List<Employee> retrieveEmployees();

	public Employee getEmployee(Long employeeId);

	public void saveEmployee(Employee employee);

	public void deleteEmployee(Long employeeId);

	public void updateEmployee(Employee employee);
}
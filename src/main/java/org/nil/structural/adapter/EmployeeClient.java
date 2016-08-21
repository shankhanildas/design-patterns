package org.nil.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployees(){
		List<Employee> employeeList = new ArrayList<>();
		
		Employee employee1 = new EmployeeDB("00160814", "shankhanil", "das", "shankhanil.das@gs.com");
		employeeList.add(employee1);
		
		EmployeeLdap employee2 = new EmployeeLdap("R308666", "shankhanil", "das", "shankhanil.das@chase.com");
		employeeList.add(new EmployeeLdapAdapter(employee2)); 
		
		return employeeList;
	}
}

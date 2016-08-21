package org.nil.structural.adapter;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees= client.getEmployees();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}		
	}

}

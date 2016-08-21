package org.nil.structural.adapter;

public class EmployeeLdapAdapter implements Employee {

	EmployeeLdap employee;	
	
	public EmployeeLdapAdapter(EmployeeLdap employee) {
		super();
		this.employee = employee;
	}

	@Override
	public String getId() {
		return employee.getCn();
	}

	@Override
	public String getFirstName() {
		return employee.getGivenName();
	}

	@Override
	public String getLastName() {
		return employee.getSurName();
	}

	@Override
	public String getEmail() {
		return employee.getMail();
	}

	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getEmail()=" + getEmail() + "]";
	}
}

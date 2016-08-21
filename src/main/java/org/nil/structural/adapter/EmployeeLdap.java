package org.nil.structural.adapter;

public class EmployeeLdap {
	
	private String cn;
	private String surName;
	private String givenName;
	private String mail;	
		
	public EmployeeLdap(String cn, String surName, String givenName, String mail) {
		super();
		this.cn = cn;
		this.surName = surName;
		this.givenName = givenName;
		this.mail = mail;
	}
	
	public String getCn() {
		return cn;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	public String getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return "Employee [cn=" + cn + ", surName=" + surName + ", givenName=" + givenName + ", mail=" + mail + "]";
	}	
}

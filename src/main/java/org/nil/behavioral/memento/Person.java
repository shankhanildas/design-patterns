package org.nil.behavioral.memento;

//originator
public class Person {
	
	private String address;
	private String name;
	private String phone;
	
	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void revert(PersonMemento person){
		this.name = person.getName();
		this.phone = person.getPhone();
	}
	
	public PersonMemento save(){
		return new PersonMemento(name, phone);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
}

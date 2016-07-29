package org.nil.behavioral.memento;

public class MementoDemo {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		Person person = new Person();
		
		person.setName("Shankhanil");
		person.setAddress("Block A, 212, SLS Sapphire");
		person.setPhone("+91 9111111111");
		
		System.out.println("Person before save: " + person);
		caretaker.save(person);
		
		person.setPhone("+91 9222222222");
		caretaker.save(person);
		
		System.out.println("Person after changed phone save: " + person);
		person.setPhone("+91 9333333333");
		
		caretaker.revert(person);
		System.out.println("Revert to last save: " + person);
		
		caretaker.revert(person);
		System.out.println("Revert to original: " + person);
	}
}

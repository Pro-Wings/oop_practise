package com.prowings.copyconstructor;

public class TestDeepCopyConstructor {
	
	public static void main(String[] args) {

		Address addr = new Address(123, "MG Road", "Pune");
		Employee emp1 = new Employee(10, "Ram", addr);
		
		System.out.println(emp1);
		
		Employee emp2 = new Employee(emp1);
		System.out.println(emp1);
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1.getAddress() == emp2.getAddress());
		
		System.out.println(">>>>> Changing Address of Emp1 <<<<<");
		emp1.getAddress().setCity("Mumbai");
		
		System.out.println("Emp1 object : "+emp1);
		System.out.println("Emp2 object : "+emp2);

		
	}

}

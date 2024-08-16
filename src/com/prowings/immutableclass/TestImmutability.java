package com.prowings.immutableclass;

public class TestImmutability {
	
	public static void main(String[] args) {
		
		Address addr = new Address(123, "ABC Road", "Pune");
		Student std1 = new Student(10, "Ram", addr);
		
		System.out.println(std1);
		
		System.out.println("Changing std1.....");
		addr.setCity("Mexico");
		
		std1.getAddress().setCity("NewYork");
		System.out.println(std1);

		System.out.println("-------------------");
		
		String str1 = "Hello";
		System.out.println(str1);
		System.out.println("Changing str1.....");
		str1.concat("World");
		System.out.println(str1);
		
		
		
		
	}

}

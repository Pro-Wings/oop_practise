package com.prowings.string.constructors;

public class TestHs {
	
	public static void main(String[] args) {
		
		Student std1 = new Student(10, "Ram", "Pune");
		System.out.println(std1);
		System.out.println(std1.hashCode());
		std1.setName("Sham123");
		System.out.println(std1);
		System.out.println(std1.hashCode());
		
		
		String str = "helloWorld";
		System.out.println(str.hashCode());
		str.concat("123");
		System.out.println(str.hashCode());
		
		
		
	}

}

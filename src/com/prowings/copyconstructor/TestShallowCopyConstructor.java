package com.prowings.copyconstructor;

public class TestShallowCopyConstructor {
	
	public static void main(String[] args) {
		
		Student std1 = new Student(10, "Ram", 98.9f);
		
		System.out.println(std1);

		Student std2 = new Student(std1);
		System.out.println(std2);
		
		System.out.println(std1 == std2);
		
	}

}

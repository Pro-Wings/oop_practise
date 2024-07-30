package com.prowings.encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setRollNo(10);
		s.setName("Ram");
		s.setMarks(98);
		
		System.out.println(s);
		s.calculateGrade(200);
		s.equals(s);
		
		System.out.println(s.hashCode());
	}

}

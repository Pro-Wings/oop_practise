package com.prowings.marker.interfacedemo;

public class TestCustomMarkerInterface {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram");
		
		System.out.println(s1);
		
		s1.delete();
		
		System.out.println(s1.hashCode());
		
	}

}

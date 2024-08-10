package com.prowings.string;

public class StringImmutability2 {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		
		
		System.out.println(s1 == s2);
		s1 = s1.concat("world");
//		s1 = s1+"world";
		
		String s3 = "Helloworld";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s3);

		
		int i = 10;
		i++;
		System.out.println(i);
		
		Student std1 = new Student(10, "Ram", "Pune");
		System.out.println(std1);
		std1.setAddress("Mumbai");
		System.out.println(std1);
		
		String str1 = "Pro";
		System.out.println(str1);
		str1 = str1.concat("Wings");
		System.out.println(str1);
		
	}

}

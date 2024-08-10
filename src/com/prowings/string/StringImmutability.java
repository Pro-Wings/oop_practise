package com.prowings.string;

public class StringImmutability {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		s1 = s1.concat("world");
		
		System.out.println(s1);
	
		String s2 = "Helloworld";
		String s3 = "Helloworld";
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		
	}

}

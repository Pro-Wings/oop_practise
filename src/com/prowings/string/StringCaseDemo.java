package com.prowings.string;

public class StringCaseDemo {
	
	public static void main(String[] args) {
		
		String str = "HELLOWORLD";
		String lowerStr = str.toLowerCase();
		System.out.println(lowerStr);
		
		String str2 = "pro-wings";
		String upperStr = str2.toUpperCase();
		System.out.println(upperStr);
		
		
		String s1 = "hello";
		String s2 = new String("HELLO");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		
		
	}

}

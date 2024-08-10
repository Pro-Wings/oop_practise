package com.prowings.string;

public class SubStringMethodDemo {
	
	public static void main(String[] args) {
		
		String str1 = "helloworld";
		String str2 = "world";
		
		String str3 = str1.substring(5, 10);
		
		System.out.println(str2 == str3);
		
	}

}

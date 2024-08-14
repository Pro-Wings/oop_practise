package com.prowings.string.constructors;

public class TestStringConstructors {
	
	public static void main(String[] args) {
		
		String s1 = "hello"; 
		String s2 = new String("hello");
		
		char[] chars = {'h','e','l','l','o'};
		
		String s3 = new String(chars);
		System.out.println("S3 = "+s3);
		
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		
		StringBuffer sb = new StringBuffer("hello");
		String s4 = new String(sb);
		System.out.println("S4 = "+s4);
		
		StringBuilder sb2 = new StringBuilder("hello");
		String s5 = new String(sb2);
		System.out.println("S5 = "+s5);
		
	}

}

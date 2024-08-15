package com.prowings.stringbuffer;

public class TestStringBuffer2 {
	
	public static void main(String[] args) {
		
		StringBuffer sb2 = new StringBuffer("hello");
		
		System.out.println(sb2);
		
		sb2.append("world");
		
		System.out.println(sb2);
		
		sb2.delete(5, 10);
		
		System.out.println(sb2);
		
		System.out.println(sb2.reverse());
	}

}

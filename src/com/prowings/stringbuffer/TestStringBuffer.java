package com.prowings.stringbuffer;

public class TestStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();

		StringBuffer sb2 = new StringBuffer("hello");
		
		System.out.println(sb1 == sb2);
		
		System.out.println(sb1.equals(sb2));

		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
//		StringBuffer sb3 = sb2.clone();
		
		sb1.append("abcdefttuuuuuuuqqrr");
		
		System.out.println("Length : "+sb1.length());
		System.out.println("Capacity : "+sb1.capacity());
		
//		sb1.trimToSize();
//		
//		System.out.println("Length : "+sb1.length());
//		System.out.println("Capacity : "+sb1.capacity());

		System.out.println(sb1);
		
	}
	
	

}

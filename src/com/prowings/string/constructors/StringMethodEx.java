package com.prowings.string.constructors;

import java.util.Arrays;

public class StringMethodEx {
	
	public static void main(String[] args) {
		
		String str = "helloworld";
		
		char[] chars = str.toCharArray();
		System.out.println(chars.length);
		System.out.println(Arrays.toString(chars));
		
	}

}

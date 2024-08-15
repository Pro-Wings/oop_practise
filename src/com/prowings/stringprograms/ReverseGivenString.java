package com.prowings.stringprograms;

import java.util.Arrays;

public class ReverseGivenString {
	
	public static void main(String[] args) {
		
		String input = "hello";
		
		String reversedString = reverse1(input);
		System.out.println(reversedString);

		String reversedString2 = reverse2(input);
		System.out.println(reversedString2);
		
	}

	private static String reverse1(String input) {
		
		char[] chars = input.toCharArray();
		char[] result = new char[chars.length];
		int j = 0;
		for(int i=chars.length-1; i>=0; i--)
		{
			result[j] = chars[i];
			j++;
		}
		System.out.println(Arrays.toString(result));
		return new String(result);
	}

	private static String reverse2(String input) {
//		StringBuffer sb = new StringBuffer(input);
//		sb.reverse();
//		return new String(sb);
		
		return new String(new StringBuffer(input).reverse());
	}
	
}

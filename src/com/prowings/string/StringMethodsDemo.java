package com.prowings.string;

public class StringMethodsDemo {
	
	public static void main(String[] args) {
		
		String str = "helloworld";
		
		int lengthOfString = str.length();
		
		System.out.println("Total characters present in given String : "+lengthOfString);
		
		char charAtGivenIndex = str.charAt(9);
		
		System.out.println("Char at specified index is :"+charAtGivenIndex);
		
		String mySubString1 = str.substring(5);
		System.out.println(mySubString1);

		String mySubString2 = str.substring(5,5);
		System.out.println(">>>> mySubString2 : "+mySubString2);
		
		System.out.println(str.contains("world"));
	}

}

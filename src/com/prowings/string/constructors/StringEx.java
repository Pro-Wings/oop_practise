package com.prowings.string.constructors;

public class StringEx {
	
	public static void main(String[] args) {
		
		String str = "123helloworld 124";
		
		str = modify(str);
		
		System.out.println("Result is : "+str);
		
	}

	private static String modify(String str) {
		
		
		String res = str.substring(3, 14);
		res = res.trim();
		res = res.concat("AAA");
		res = res.toUpperCase();

		return res;
	}

}

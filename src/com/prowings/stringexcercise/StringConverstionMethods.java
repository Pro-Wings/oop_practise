package com.prowings.stringexcercise;

public class StringConverstionMethods {
	
	public static void main(String[] args) {
		
		String number = "1234";
		
		Integer n = Integer.parseInt(number);
		
		int num = 1234;
		
		String numc = String.valueOf(num);
		Integer numi = Integer.parseInt(numc);
		System.out.println(">>>"+numi);
		System.out.println(">>>"+(numi+10));
		
		
		String res = num + 10 + number;
		
		System.out.println(res);
		
		System.out.println("---------------------");
		
		String result = "true";
		
		if(Boolean.parseBoolean(result))
		{
			System.out.println("success!!");
		}
		else
		System.out.println("failure!!");
		
		
	}

}

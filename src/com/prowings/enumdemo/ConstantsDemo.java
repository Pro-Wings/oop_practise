package com.prowings.enumdemo;

public class ConstantsDemo {
	
	public static final int SMALL = 28;
	public static final int MEDIUM = 32;
	public static final int LARGE = 40;
	public static final int EXTRA_LARGE = 42;
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		double price = calculateTshirtPrice(43);
		
		System.out.println("Price for selected T Shirt is : "+price);
		System.out.println("main ended!!");
		
	}

	public static double calculateTshirtPrice(int size) {
		double price = 0;
		
		switch(size)
		{
		 case 28 :
			 System.out.println("selected size is : 28");
			 return 500.00d;
		 case 32 :
			 System.out.println("selected size is : 32");
			 return 700.00d;
		 case 40 :
			 System.out.println("selected size is : 40");
			 return 800.00d;
		 case 42 :
			 System.out.println("selected size is : 42");
			 return 900.00d;
		 default :
			 System.out.println("selected size is : invalid");
			 return 0.0d;
		}
		
		
	}

}

package com.prowings.enumdemo;

public class EnumDemo {
	
enum Size{
	
	SMALL, MEDIUM, LARGE, EXTRA_LARGE;
	
	Size()
	{
		System.out.println("Size Enum's constructor executed!!");
	}
	
}
	
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		double price = calculateTshirtPrice(Size.MEDIUM);
		
		System.out.println("Price for selected T Shirt is : "+price);
		System.out.println("main ended!!");
		
	}

	public static double calculateTshirtPrice(Size size) {
		double price = 0;
		
		switch(size)
		{
		 case  SMALL:
			 System.out.println("selected size is : 28");
			 return 500.00d;
		 case MEDIUM :
			 System.out.println("selected size is : 32");
			 return 700.00d;
		 case LARGE :
			 System.out.println("selected size is : 40");
			 return 800.00d;
		 case EXTRA_LARGE :
			 System.out.println("selected size is : 42");
			 return 900.00d;
		 default :
			 System.out.println("selected size is : invalid");
			 return 0.0d;
		}
		
		
	}

}

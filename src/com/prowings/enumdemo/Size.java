package com.prowings.enumdemo;

public enum Size  {
	
	SMALL_SIZE,MEDIUM_SIZE,LARGE_SIZE;

	{
		System.out.println("inside block");
	}

	static
	{
		System.out.println("inside block");
	}
	
	private Size() {
	}
	
	public void hello()
	{
		System.out.println("inside hello() of enum Size!!");
	}

}

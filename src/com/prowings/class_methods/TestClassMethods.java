package com.prowings.class_methods;

public class TestClassMethods {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		String s1 = "Hello";
		String s2 = "hi";
		Object o1 = s1;
		
		if(o1 instanceof String)
			System.out.println(">>> its string");
		
		
		if(s1.getClass().isInstance(o1))
			System.out.println("Its String Object!!!");
		
		System.out.println(s1.getClass().getName());
		
		TestClassMethods obj = new TestClassMethods();
		System.out.println(obj.getClass().getName());
		
		Class t = Class.forName("java.lang.String");
		
		System.out.println(t.getName());
		
		long[] nums = {10,20,30};
		
		myMethod(nums);
		
		myMethod2(20);
	}
	
	public static void myMethod(Object o)
	{
		if(o.getClass().isArray())
		{
			System.out.println("its array.. we can do some operation");
		}
		else
			System.out.println("Its not array.. so skipping...");
	}

	public static void myMethod2(Object o)
	{
		if(o.getClass().isPrimitive())
		{
			System.out.println("its primitive..");
		}
		else
			System.out.println("its not primitive..");
	}

}

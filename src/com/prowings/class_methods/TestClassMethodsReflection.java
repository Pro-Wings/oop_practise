package com.prowings.class_methods;

import java.lang.reflect.Field;

public class TestClassMethodsReflection {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Student s1 = new Student(10, "Ram", 99.9f);
		
		myMethod(s1);
		
	}

	private static void myMethod(Object o) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		System.out.println(o.getClass().getName());
		
		Field f = o.getClass().getDeclaredField("a");
		f.setAccessible(true);
		System.out.println(f.get(o));
		
		Field[] fields = o.getClass().getDeclaredFields();
		
		for(Field field : fields )
		{
			System.out.println(field.getName() + "   data type : "+ field.getType().getName());
		}
		
	}
}

package com.prowings.objectclassmethods.finalize;

public class TestFinalizeMethod {
	
	public static void main(String[] args) throws Throwable {
		
		Car c1 = new Car(2024, "Audi", 12);
		
		System.out.println(c1);
		
		c1 = null;

		//option1 : call to GarbageCollector
		System.gc();
		//option2 : call to GarbageCollector
		Runtime.getRuntime().gc();
		
	}

}

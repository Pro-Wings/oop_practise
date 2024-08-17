package com.prowings.immutableclass2;

public class TestImmutability {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine(999, "Fiat89");
		
		Car car1 = new Car(123, "Audi", engine);
		
		System.out.println("CAR1 : "+car1);
		
//		car1.companyName = "Mahindra";
//		car1.setCompanyName("BMW");
		
		//change in engine object
		engine.setName("v8");

		car1.getEngine().name = "v12";
		
		System.out.println("After modifying CAR1 : "+car1);
	}

}

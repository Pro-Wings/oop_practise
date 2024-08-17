package com.prowings.copyconstructor2;

public class TestCopyConstructor {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine(700, "v12");
		
		Car car1 = new Car(123, "Honda", engine);
		
		System.out.println("Car1 == "+car1);

		Car car2 = new Car(car1);
	
		System.out.println("Car2 == "+car2);
		
		System.out.println(car1 == car2);
		
		System.out.println(">>>>>>check engine ref eq<<<<<<<");
		System.out.println(car1.getEngine() == car2.getEngine());
		
		System.out.println(">>>>>>>> Car1 changing Engine<<<<<<<<");
		car1.getEngine().setEngineName("v8");
		System.out.println(">>>> After changing Engine of car1<<<<");
		System.out.println("Car1 == "+car1);
		System.out.println("Car2 == "+car2);

		
	}

}

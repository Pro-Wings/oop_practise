package com.prowings.objectclassmethods.deepclone;

public class TestClone {
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Engine engine1 = new Engine(7070, "V12", 3000);
		Bus b1 = new Bus(1212, "Tata", 40, engine1);
		
		System.out.println(b1);
		System.out.println(b1.hashCode());
		
		Bus b2 = (Bus) b1.clone();
		System.out.println(b2);
		System.out.println(b2.hashCode());
		
		System.out.println(b1 == b2);
		
		System.out.println("-----Upgrading engine of Bus2-----");
		b2.getEngine().setCc(5000);
		System.out.println(b2);
		
		System.out.println("-----After Upgrading engine of Bus2-----");
		System.out.println(b1);
		System.out.println(b2);
		
		
	}

}

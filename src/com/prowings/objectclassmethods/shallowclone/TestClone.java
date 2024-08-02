package com.prowings.objectclassmethods.shallowclone;

public class TestClone {
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Bus b1 = new Bus(1212, "Tata", 40);
		System.out.println(b1);
		System.out.println(b1.hashCode());
		
//		Bus b2 = new Bus(1212, "Tata", 40);
		Bus b2 = (Bus) b1.clone();
		System.out.println(b2);
		System.out.println(b2.hashCode());
		
		System.out.println(b1 == b2);
	}

}

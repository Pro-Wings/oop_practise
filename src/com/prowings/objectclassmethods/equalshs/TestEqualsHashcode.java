package com.prowings.objectclassmethods.equalshs;

public class TestEqualsHashcode {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(10, "Ram", "Pune");
		int hs = p1.hashCode();
		System.out.println(hs);

		Person p2 = new Person(10, "Sham", "Pune");
		int hs2 = p2.hashCode();
		System.out.println(hs2);
		
		boolean res = p1.equals(p2);
		System.out.println(res);
		//-----------------------------------//
	}

}

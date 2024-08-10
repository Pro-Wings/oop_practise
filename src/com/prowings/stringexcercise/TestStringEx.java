package com.prowings.stringexcercise;

public class TestStringEx {
	
	public static void main(String[] args) {
		
		Student std = new Student(10, "Ram", "pAtIl", "ram abc patil");
		
		System.out.println("Original Student : "+std);
		
		Student modifiedStd = capitalizeNames(std);
		
		System.out.println("Student after capitalizeNames : "+modifiedStd);
	}

	private static Student capitalizeNames(Student std) {
		
		Student modifiedStd = new Student();
		
//		String firstName = std.getFirstName();
//		String lastName = std.getLastName();
//		String fullName = std.getFullName();
//		
//		String modifiedFirstName = capitalizeString(firstName);
//		String modifiedLastName = capitalizeString(lastName);
//		String modifiedFullName = capitalizeString(fullName);
//		
//		modifiedStd.setRoll(std.getRoll());
//		modifiedStd.setFirstName(modifiedFirstName);
//		modifiedStd.setLastName(modifiedLastName);
//		modifiedStd.setFullName(modifiedFullName);

		modifiedStd.setRoll(std.getRoll());
		modifiedStd.setFirstName(capitalizeString(std.getFirstName()));
		modifiedStd.setLastName(capitalizeString(std.getLastName()));
		modifiedStd.setFullName(capitalizeString(std.getFullName()));
		
		return modifiedStd;
	}

	public static String capitalizeString(String name) {
		
		if((name != null) && !(name.isEmpty())) {
			char firstLetter = Character.toUpperCase(name.charAt(0));
			String modifiedName= firstLetter + name.substring(1).toLowerCase();
			return modifiedName;
		}
		return name;
	}

}

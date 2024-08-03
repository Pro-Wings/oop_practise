package com.prowings.objectclassmethods.deepclone;

public class TestShallowCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee originalEmployee = new Employee(10, "Ram", 990000, "HR");
		System.out.println("Original Employee : "+originalEmployee);
		
		Employee clonedEmployee = (Employee) originalEmployee.clone();
		System.out.println("Cloned Employee : "+clonedEmployee);
		
		System.out.println("Hashcode of Original Employee : "+originalEmployee.hashCode());
		System.out.println("Hashcode of Cloned Employee : "+clonedEmployee.hashCode());
		System.out.println("Reference Equality : "+ (originalEmployee == clonedEmployee));
		
		System.out.println("<<<<< Lets change Department of Original Employee >>>>>>>");
		
    	originalEmployee.setDepartment(originalEmployee.getDepartment().concat("XXXXXXX"));
		System.out.println("Original Employee after change in Department : "+originalEmployee);
		System.out.println("Cloned Employee after change in Department of Original Employee: "+clonedEmployee);
		
		
	}

}

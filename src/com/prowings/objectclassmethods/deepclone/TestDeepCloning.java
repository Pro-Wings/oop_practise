package com.prowings.objectclassmethods.deepclone;

public class TestDeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department originalDepartment = new Department(1010, "HR");
		
		ComplexEmployee originalEmployee = new ComplexEmployee(10, "Ram", 990000, originalDepartment);
		System.out.println("Original Employee : "+originalEmployee);
		
		ComplexEmployee clonedEmployee = (ComplexEmployee) originalEmployee.clone();
		System.out.println("Cloned Employee : "+clonedEmployee);
		
		System.out.println("Hashcode of Original Employee : "+originalEmployee.hashCode());
		System.out.println("Hashcode of Cloned Employee : "+clonedEmployee.hashCode());
		System.out.println("Reference Equality : "+ (originalEmployee == clonedEmployee));
		
		System.out.println("<<<<< Lets change Department of Original Employee >>>>>>>");

		originalEmployee.getDepartment().setDeptName("IT");
		
		System.out.println("Original Employee after change in Department : "+originalEmployee);
		System.out.println("Cloned Employee after change in Department of Original Employee: "+clonedEmployee);

		
	}

}

package com.prowings.objectclassmethods;

import java.util.Objects;

public class Employee implements Cloneable{

	private int empId;
	private String name;
	private String address;

	public Employee() {
	}

	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(address, empId, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(address, other.address) && empId == other.empId && Objects.equals(name, other.name);
//	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp1 = new Employee(10, "Ram", "Pune");
		
		Employee emp2 = new Employee(10, "Ram", "Pune");
		
		Employee emp3 = emp1;
		
		System.out.println(emp1 == emp2); //emp1.equals(emp2)
		System.out.println(emp1 == emp3);
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		
		Employee emp4 = (Employee) emp1.clone();
		
		System.out.println(emp1 == emp4);
		System.out.println(emp1.equals(emp4));
		
		System.out.println("-----hashcodes-----------");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		
	}

}

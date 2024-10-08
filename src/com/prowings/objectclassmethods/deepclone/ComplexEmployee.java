package com.prowings.objectclassmethods.deepclone;

public class ComplexEmployee implements Cloneable{
	
	private int id;
	private String name;
	private int salary;
	private Department department;

	public ComplexEmployee() {
	}

	public ComplexEmployee(int id, String name, int salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
		
		ComplexEmployee empClonedCopy = (ComplexEmployee) super.clone();
		
		Department deptClonedCopy = (Department) empClonedCopy.getDepartment().clone();

		empClonedCopy.setDepartment(deptClonedCopy);
		
		return empClonedCopy;
		
	}

}

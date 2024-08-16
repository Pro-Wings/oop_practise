package com.prowings.copyconstructor;

public class Employee {
	
	private int id;
	private String name;
	private Address address;
	
	public Employee() {
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

//	//Shallow Copy 
//	public Employee(Employee emp)
//	{
//		this.id = emp.id;
//		this.name = emp.name;
//		this.address = emp.address;
//	}

	//Deep Copy 
	public Employee(Employee emp)
	{
		this.id = emp.id;
		this.name = emp.name;
		//this.address = emp.address;
		Address addrCopy = new Address();
		addrCopy.setCity(emp.getAddress().getCity());
		addrCopy.setPin(emp.getAddress().getPin());
		addrCopy.setStreet(emp.getAddress().getStreet());
		this.address = addrCopy;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}

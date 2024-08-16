package com.prowings.immutableclass;

public final class Student {

	private final int roll;
	private final String name;
	private final Address address;

	public Student() {
		this.roll = 0;
		this.name = "";
		this.address = new Address();
	}

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
//		this.address = address; //<--shallow copy /reference copy

		//Deep copy / Feild by field copy
		Address dummyAddr = new Address();
		dummyAddr.setPin(address.getPin());
		dummyAddr.setCity(address.getCity());
		dummyAddr.setStreet(address.getCity());
		this.address = dummyAddr;
		
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		Address dummyAddr = new Address();
		dummyAddr.setPin(address.getPin());
		dummyAddr.setCity(address.getCity());
		dummyAddr.setStreet(address.getStreet());

		return dummyAddr;
		//		return address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	
}

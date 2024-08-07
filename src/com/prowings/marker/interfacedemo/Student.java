package com.prowings.marker.interfacedemo;

public class Student implements Deletable {

	private int roll;
	private String name;

	public Student() {
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	public void delete() {
		if (!(this instanceof Deletable)) {
			System.out.println("Error... Can not delete this object!!");
			throw new RuntimeException("DeleteNotSupportedException occurred");
		}
		System.out.println("Student object deleted successfully!!");
	}

}

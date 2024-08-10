package com.prowings.stringexcercise;

public class Student {
	
	private int roll;
	private String firstName;
	private String lastName;
	private String fullName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String firstName, String lastName, String fullName) {
		super();
		this.roll = roll;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", firstName=" + firstName + ", lastName=" + lastName + ", fullName="
				+ fullName + "]";
	}
}

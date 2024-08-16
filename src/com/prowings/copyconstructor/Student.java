package com.prowings.copyconstructor;

public class Student {
	
	private int roll;
	private String name;
	private float marks;

	public Student() {
	}

	public Student(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	//Copy constructor - performing shallow copy!!
	public Student(Student std)
	{
		
		this.roll = std.roll;
		this.name = std.name;
		this.marks = std.marks;
		
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}

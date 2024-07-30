package com.prowings.encapsulation;

/**
 * lkadsjhflksgf
 * AJSDKASJDHFKDSHF
 * slkdjflkdsjflksjf
 * 
 * @author Jaydeep Mohite
 * 
 */
public class Student {
	
	private int rollNo;
	private String name;
	private int marks;
	public int getRollNo() {
		return rollNo;
	}
	
	/**
	 * This is a method to calculate Grades based on marks
	 * 
	 * @param marks - marks must be of int type
	 * @return this method returns Grade in String format
	 * @exception This method can throws ArithMaticException
	 */
	public String calculateGrade(int marks) throws ArithmeticException
	{
		//some logic
		return "";
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}

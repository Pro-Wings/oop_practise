package com.prowings.objectclassmethods.finalize;

public class Car {
	
	private int model;
	private String companyName;
	private int milage;

	public Car() {
	}

	public Car(int model, String companyName, int milage) {
		super();
		this.model = model;
		this.companyName = companyName;
		this.milage = milage;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", companyName=" + companyName + ", milage=" + milage + "]";
	}
	
    public void finalize() throws Throwable 
    { 
    	System.out.println("finalize method invoked!!!!");
    	super.finalize();
    	System.out.println("object removed from heap memory!!!!");
    }
	

}

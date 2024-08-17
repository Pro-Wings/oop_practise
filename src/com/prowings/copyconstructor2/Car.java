package com.prowings.copyconstructor2;

public class Car {

	private int number;
	private String companyName;
	private Engine engine;

	public Car() {
	}

	public Car(int number, String companyName, Engine engine) {
		super();
		this.number = number;
		this.companyName = companyName;
		this.engine = engine;
	}

	public Car(Car car) {
		this.number = car.number;
		this.companyName = car.companyName;

//		this.engine = car.engine; //Mutable field - shallow copy
	
		//perform deep copy for Mutable filed
		Engine engineCopy = new Engine();
		engineCopy.setEngineId(car.getEngine().getEngineId());
		engineCopy.setEngineName(car.getEngine().getEngineName());
		this.engine = engineCopy;
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", companyName=" + companyName + ", engine=" + engine + "]";
	}

}

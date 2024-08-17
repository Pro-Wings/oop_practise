package com.prowings.immutableclass2;

public final class Car {

	private final int number;
	private final String companyName;
	private final Engine engine;

	public Car() {
		this.number = 0;
		this.companyName = "";
		this.engine = new Engine();
	}

	public Car(int number, String companyName, Engine engine) {
		super();
		this.number = number;
		this.companyName = companyName;
//		this.engine = engine;
		Engine copyEngine = new Engine();
		copyEngine.setModel(engine.getModel());
		copyEngine.setName(engine.getName());
		this.engine = copyEngine;
	}

	public int getNumber() {
		return number;
	}


	public String getCompanyName() {
		return companyName;
	}


	public Engine getEngine() {
		Engine dummyEngine = new Engine();
		dummyEngine.setModel(engine.getModel());
		dummyEngine.setName(engine.getName());
		return dummyEngine;
	}


	@Override
	public String toString() {
		return "Car [number=" + number + ", companyName=" + companyName + ", engine=" + engine + "]";
	}

}

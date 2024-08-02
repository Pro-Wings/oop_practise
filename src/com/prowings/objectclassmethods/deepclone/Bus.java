package com.prowings.objectclassmethods.deepclone;

public class Bus implements Cloneable{
	
	private int busNumber;
	private String busCompany;
	private int buscapacity;
	private Engine engine;

	public Bus() {
	}


	public Bus(int busNumber, String busCompany, int buscapacity, Engine engine) {
		super();
		this.busNumber = busNumber;
		this.busCompany = busCompany;
		this.buscapacity = buscapacity;
		this.engine = engine;
	}

	public int getBusNumber() {
		return busNumber;
	}


	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}


	public String getBusCompany() {
		return busCompany;
	}


	public void setBusCompany(String busCompany) {
		this.busCompany = busCompany;
	}


	public int getBuscapacity() {
		return buscapacity;
	}


	public void setBuscapacity(int buscapacity) {
		this.buscapacity = buscapacity;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", busCompany=" + busCompany + ", buscapacity=" + buscapacity
				+ ", engine=" + engine + "]";
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Bus clonedBus = (Bus) super.clone();
		Engine clonedEngine = (Engine) this.getEngine().clone();
		clonedBus.setEngine(clonedEngine);
		return clonedBus;
	}

	
}

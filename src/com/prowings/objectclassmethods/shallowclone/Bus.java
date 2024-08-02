package com.prowings.objectclassmethods.shallowclone;

public class Bus implements Cloneable{
	
	private int busNumber;
	private String busCompany;
	private int buscapacity;

	public Bus() {
	}

	public Bus(int busNumber, String busCompany, int buscapacity) {
		super();
		this.busNumber = busNumber;
		this.busCompany = busCompany;
		this.buscapacity = buscapacity;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", busCompany=" + busCompany + ", buscapacity=" + buscapacity + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}

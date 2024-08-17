package com.prowings.immutableclass2;

public class Engine {
	
	int model;
	String name;

	public Engine() {
	}

	public Engine(int model, String name) {
		super();
		this.model = model;
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + ", name=" + name + "]";
	}

	
	

}

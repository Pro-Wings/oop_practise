package com.prowings.copyconstructor2;

public class Engine {
	
	private int engineId;
	private String engineName;

	public Engine() {
	}

	public Engine(int engineId, String engineName) {
		super();
		this.engineId = engineId;
		this.engineName = engineName;
	}

	public int getEngineId() {
		return engineId;
	}

	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + "]";
	}
	
	
	

}

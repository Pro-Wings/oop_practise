package com.prowings.objectclassmethods.deepclone;

public class Engine implements Cloneable{

	private int engineId;
	private String engineName;
	private int cc;

	public Engine() {
		super();
	}

	public Engine(int engineId, String engineName, int cc) {
		super();
		this.engineId = engineId;
		this.engineName = engineName;
		this.cc = cc;
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

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + ", cc=" + cc + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}

package com.prowings.enumdemo;

public enum TrafficLight {
	
	RED(30), GREEN(60), YELLOW(5);
	
	int duration;
	
	private TrafficLight(int duration) {
		System.out.println("initializing TrafficLight with duration : "+duration);
		this.duration= duration; 
	}

	public int getDuration() {
		return duration;
	}
	
}

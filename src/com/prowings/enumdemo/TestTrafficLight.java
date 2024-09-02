package com.prowings.enumdemo;

import java.util.Arrays;

public class TestTrafficLight {
	
	public static void main(String[] args) {
		
		TrafficLight light = TrafficLight.YELLOW;
		
		System.out.println(light.name());
		System.out.println(light.getDuration());
		System.out.println("Ordinal is : "+light.ordinal());
		System.out.println(TrafficLight.valueOf("YELLOW"));
		
		
		System.out.println(Arrays.toString(TrafficLight.values()));
		
		for(TrafficLight lht : TrafficLight.values())
		{
			System.out.println(lht.name() +" and Duration : "+lht.getDuration());
		}
		
	}

}

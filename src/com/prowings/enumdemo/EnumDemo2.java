package com.prowings.enumdemo;

import java.util.Scanner;

enum Month{
	JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPETEMBER,OCTOBER,NOVEMBER,DECEMBER;
}

public class EnumDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		System.out.println("Please enter month to guess the season : ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputMonth = sc.next();
		
		guessTheSeason(Month.valueOf(inputMonth.toUpperCase()));
		
		System.out.println("main ended!!");
		
	}

	public static void guessTheSeason(Month month) {
		
		switch(month)
		{
		
		case NOVEMBER : 
		case DECEMBER : 
		case JANUARY : 
		case FEBRUARY : 
			System.out.println("its Winter Season!!!");
			System.out.println("Entered month is : "+month.name());
			break;

		case MARCH : 
		case APRIL : 
		case MAY : 
		case JUNE : 
			System.out.println("its Summer Season!!!");
			System.out.println("Entered month is : "+month.name());
			break;

		case JULY : 
		case AUGUST : 
		case SEPETEMBER : 
		case OCTOBER : 
			System.out.println("its Rainy Season!!!");
			System.out.println("Entered month is : "+month.name());
			break;
		
		default:
			System.out.println("Invalid Month...!!");
			
		}
		
	}

}

package com.prowings.enumdemo;

import java.util.Scanner;

enum Months{
	JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPETEMBER,OCTOBER,NOVEMBER,DECEMBER;
}

public class EnumDemo3 {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		System.out.println("Please enter month to guess the season : ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputMonth = sc.next();
		
		guessTheSeason(inputMonth);
		
		System.out.println("main ended!!");
		
	}

	public static void guessTheSeason(String month) {
		
		switch(Months.valueOf(month.toUpperCase()))
		{
		
		case NOVEMBER : 
		case DECEMBER : 
		case JANUARY : 
		case FEBRUARY : 
			System.out.println("its Winter Season!!!");
			break;

		case MARCH : 
		case APRIL : 
		case MAY : 
		case JUNE : 
			System.out.println("its Summer Season!!!");
			break;

		case JULY : 
		case AUGUST : 
		case SEPETEMBER : 
		case OCTOBER : 
			System.out.println("its Rainy Season!!!");
			break;
		
		default:
			System.out.println("Invalid Month...!!");
			
		}
		
	}

}

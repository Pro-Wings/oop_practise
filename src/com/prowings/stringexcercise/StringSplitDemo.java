package com.prowings.stringexcercise;

public class StringSplitDemo {
	
	public static void main(String[] args) {
		
		String fullName = "Ram Dashrath Patil";
		
		String[] words = fullName.split(" ");
		
		for(String word : words)
			System.out.println(word);
		
	}

}

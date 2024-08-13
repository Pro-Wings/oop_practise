package com.prowings.stringexcercise;

public class StringMethodsEx {
	
	public static void main(String[] args) {
		
		String str = "helloworld";
		System.out.println(str.contains("hello"));
		String str2 = "HelloWorld";
		
		System.out.println(str.equals(str2));
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		String str3 = "pro wings    ";
		System.out.println(str3.length());
		
		String s = str3.substring(3);
		
		s = s.trim();
		
		System.out.println(s);
		
		String s2 = "wings";
		
		System.out.println(s.equals(s2));
		
		String mystr = "prowings";
		System.out.println(mystr);
		String modified = mystr.replace("pro", "programming");
		System.out.println(modified);
		
		String x = "radar";
		
		System.out.println(x.indexOf('a'));
		System.out.println(x.lastIndexOf('a'));
		
		
	}

}

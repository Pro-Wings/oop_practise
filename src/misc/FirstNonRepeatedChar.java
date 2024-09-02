package misc;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static char findFirstNonRepeatedChar(String input) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();

		// Count the occurrences of each character in the string
		for (char ch : input.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
		}

		// Find the first character with a count of 1
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		// If no non-repeated character is found
		throw new IllegalArgumentException("No non-repeated character found");
	}
	
	public static void main(String[] args) {
		
		char res = findFirstNonRepeatedChar("swiss");
		System.out.println("First non repeated char is : "+res);
	}

}

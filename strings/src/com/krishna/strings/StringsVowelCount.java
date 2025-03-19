package com.krishna.strings;

public class StringsVowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "hello world";
		
		int vowelcount = 0;
		
		for(char c: input.toLowerCase().toCharArray()) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
				vowelcount ++;
				
			}
		}
		System.out.println("VowelCount : " + vowelcount);
		
	}

}

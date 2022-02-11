package com.test;

public class MainClase {

	public static void main(String[] args) {
				
	    java.util.Date date = new java.util.Date();
	    System.out.println("Init: " + date);
	    System.out.println(" ");
		
		String anagram = "army";
		String word = "mary";		
		
		System.out.println("isAnagram: " + isAnagram(anagram, word));
		
		System.out.println(" ");
		
	    java.util.Date date1 = new java.util.Date();
	    System.out.println("End: " + date1);
			
	}

	private static boolean isAnagram(String anagram, String word) {
				
		char chars[] = word.toCharArray();
		
		for( char c : chars) {
			int index = anagram.indexOf(c);
			if(index != -1) {
		
				System.out.println(index);
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
				
			}else {
				return false;
			}
		}
		
		return anagram.isEmpty();
		
	}// end method findDuplicateCharacters()
	
}

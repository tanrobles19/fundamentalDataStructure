package com.string.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StringAlgorithmTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void findDuplicateCharacters(String sourceText) {		

		char[] values = sourceText.toCharArray();
		
		Map<Character, Integer> mainList = new HashMap<Character, Integer>();
		
		for(Character item : values) {
			
			Integer c = mainList.get(item);
			
			if(c != null) {
				mainList.put(item, c + 1);
			}else {
				mainList.put(item, 1);
			}
			
		}

		Set<Map.Entry<Character, Integer>> entrySet = mainList.entrySet();
		
		for(Map.Entry<Character, Integer> entry: entrySet) {
			if(entry.getValue() > 10)
				System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
		}
		
			
	}// end method findDuplicateCharacters()
	
	public static void checkAnagramWords(String anagram, String value) {		

        if(anagram.length() != value.length()){
			System.out.println("MALLL");
            return;
        }
		
		boolean anagramY = true;
		
		for(int i = 0; i < anagram.length(); i++ ) {
			
			String anag = anagram.substring(i, i + 1);
			
			System.out.println("anag: " + anag);
			
			boolean flag = false;
			
			for(int x = 0; x < value.length(); x++ ) {
				
				String val = value.substring(x, x + 1);			
				
				if(anag.equalsIgnoreCase(val)) {
//					System.out.println("falla con: " + anag);
					flag = true;
					continue;
				}
				
			}
			
			if(!flag) {
				System.out.println("MALLL");
				anagramY = false;
				break;
			}
			
		}
		if(anagramY) {
			System.out.println("We are an Anagram!");
		}
			
	}// end method checkAnagramWords()
	
	public static void firstNonRepeatedCharater(String word) {
		
		char rawList[] = word.toCharArray();
		
		//LinkedHashMap maintains the insertion order.
		Map<Character, Integer> list = new LinkedHashMap<Character, Integer>();
		
		for (char c : rawList) {
			if(list.containsKey(c)) {
				list.put(c, list.get(c) + 1);
			}else {
				list.put(c, 1);
			}
		}// end for
		
		Set<Map.Entry<Character, Integer>> entrySet = list.entrySet();
		
		for (Entry<Character, Integer> item : entrySet) {
			if(item.getValue() == 1 ) 
				System.out.println("Key: " + item.getKey() + ", value: " + item.getValue());
		}
		
		
	}// end method firstNonRepeatedCharater()
	
	public static String reverseRecursively(String str) {

		
        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }// end method reverseRecursively()
	
	public static String reverseNoRecursive(String str) {

		String reverse = "";		
		
		for(int i = str.length(); i > 0; i--) {			
			reverse = reverse + str.substring(i- 1, i);			
		}		
		
		return reverse;
		
    }// end method reverseNoRecursive()
	
	public static int countsVowels(String dataSource) {
		
		String vowels[] = {"a","e","i","o", "u"};
		
		int vowelCount = 0;
		
		for(int i = 0; i < dataSource.length(); i++) {
			
			String letter = dataSource.substring(i, i + 1);			
			
			for(int x = 0; x < vowels.length; x++) {
				
				if(letter.equalsIgnoreCase(vowels[x])) {				
					vowelCount++;
					break;
				}// end if
				
			}// end for			
			
		}
		
		return vowelCount;
		
    }// end method countsVowels()
	
	public static int countsVowelsAndConsonants(String dataSource) {
		
		String vowels[] = {"a","e","i","o", "u"};
		
		int vowelCount = 0;
		
		for(int i = 0; i < dataSource.length(); i++) {
			
			
			// we could change for dataSource.toChartArray
			String letter = dataSource.substring(i, i + 1);			
						
			// we could change for a swith into a for
			for(int x = 0; x < vowels.length; x++) {
				
				if(letter.equalsIgnoreCase(vowels[x])) {				
					vowelCount++;
					break;
				}// end if
				
			}// end for			
			
		}
		
		return vowelCount;
		
    }// end method countsVowelsAndConsonants()

	public static void permutation(String perm, String word) { 
		//https://javarevisited.blogspot.com/2015/08/how-to-find-all-permutations-of-string-java-example.html#axzz7JrQQ4j8Q		
	}// end method permutation
	
	public static ArrayList<String> reverseWords(String sentense) {
		
		int initial = 0, end = 0;
		
		ArrayList<String> t = new ArrayList<String>();
		
		for(int i = 0; i < sentense.length(); i++) {
			String character = sentense.substring(i, i + 1);
						
			if(character.equalsIgnoreCase(" ")) {
				end = i;
				
				String word = sentense.substring(initial, end);
				t.add(word);
										
				initial = end + 1;
				end = 0;
				
			}
			
		}// end for
		
		return t;
		
	}// end method reverseWords()
	
	public static void isPalindrome(String value) {

		String newValue = "";
		
		for(int i = value.length(); i > 0; i--) {
		
			String temp = value.substring(i-1, i);
			
			newValue = newValue + temp;		
			
		}
		
		if(newValue.equalsIgnoreCase(value)) {
			System.out.println("I am a palindrome");	
		}else {
			System.out.println("I am NOT  a palindrome");
		}				
		
		
	}// end method isPalindrome()
	
	public static String isPalindromeRecursive(String value) {


		if(value.length() < 2) {
			return value;
		}
		
		return isPalindromeRecursive(value.substring(1)) + value.charAt(0);
		
	}// end method isPalindromeRecursive()
	
	

}

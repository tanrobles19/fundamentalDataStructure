package com.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import domain.Fragment;

public class MainClase {

	public static void main(String[] args) {
				
	    java.util.Date date = new java.util.Date();
	    System.out.println("Init: " + date);
	    System.out.println(" ");
		
		String data = "aswisss";		
		
		printNonRepeatedCharacter(data);
		
//		System.out.println("isAnagram: " + solution(anagram, word));
		
		System.out.println(" ");
		
	    java.util.Date date1 = new java.util.Date();
	    System.out.println("End: " + date1);
			
	}	
	
	
//	4. reverse 
	
	private static void printNonRepeatedCharacter(String dataSource) {
		
		char characterList[] = dataSource.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c : characterList) {			
			map.put(c, map.containsKey(c)? map.get(c) + 1 : 1 );						
		}
		
		System.out.println("map: " + map.toString());
		
	}
	
}
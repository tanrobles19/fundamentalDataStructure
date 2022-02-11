package com.test;

import java.util.ArrayList;

import domain.Fragment;

public class MainClase {

	public static void main(String[] args) {
				
	    java.util.Date date = new java.util.Date();
	    System.out.println("Init: " + date);
	    System.out.println(" ");
		
		String data = "aaaababababbbbbabbababbbb";		
		
		solution(data);
		
//		System.out.println("isAnagram: " + solution(anagram, word));
		
		System.out.println(" ");
		
	    java.util.Date date1 = new java.util.Date();
	    System.out.println("End: " + date1);
			
	}	
	
	
	
	public static void solution(String dataSource) {
						
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < dataSource.length(); i++) {
			
			String currentCharacter = dataSource.substring(i, i + 1);
		
			if(list.isEmpty()) {
				list.add(currentCharacter);
			}else {
				
				int lastIndex = list.size() -1;
				String last = list.get( lastIndex );
				
				if(last.substring(0, 1).equalsIgnoreCase(currentCharacter)) {
					list.set(lastIndex, last + currentCharacter);
				}else {
					list.add(currentCharacter);
				}
			}// end else
			
		}// end for
				
		for(String s : list)
			System.out.println(s);
		
	}// end method solution()	

	
}

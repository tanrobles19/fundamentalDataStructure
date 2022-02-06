package com.test;

import list.LinkedList;
import list.Node;

public class MainClase {

	public static void main(String[] args) {

		
		LinkedList linkedList = new LinkedList();
		
	    Node head = linkedList.head();
	      
		linkedList.add( new Node("1"));
		linkedList.add( new Node("2"));
		linkedList.add( new Node("3"));
		linkedList.add( new Node("4"));
		linkedList.add( new Node("5"));
		linkedList.add( new Node("6"));
		linkedList.add( new Node("7"));
		linkedList.add( new Node("8"));
		linkedList.add( new Node("9"));
		
		Node current = head;
	      int length = 0;
	    Node middle = head;
	   
	      while(current.next() != null){
	          length++;
	          if(length%2 ==0){
	              middle = middle.next();
	          }
	          current = current.next();
	      }
	    
	      if(length%2 == 1){
	          middle = middle.next();
	      }

	      System.out.println("length of LinkedList: " + length);
	      System.out.println("middle element of LinkedList : "                                  + middle);

			
//		Matrix matrix = new Matrix(1,3);
//		matrix.read("first");
//		
//		Matrix matrix2 = new Matrix(2,2);
//		matrix2.read("second");

	}

}

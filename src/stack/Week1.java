package stack;

import java.util.Stack;

public class Week1 {

	public static void main(String[] args) {
		
		System.out.print(isBalanced());

	}// end main

	public static boolean isBalanced() {
		
		String list = "((([([])]))())";
		
		char[] charList = list.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(char bracket : charList) {
			
			if(bracket ==  '(' || bracket ==  ')' || bracket ==  '[' || 
					bracket ==  ']' || bracket ==  '{' || bracket ==  '}' ) {
			
				if(bracket ==  '(' || bracket ==  '[' || bracket ==  '{') {
					stack.push(bracket);
				}else {
					if( stack.empty() ) { 
						return false;
					}
					
					Character top = stack.pop();
					
					if( (top == '[' && bracket != ']') || (top == '(' && bracket != ')') || (top == '{' && bracket != '}') ) {
						return false;
					}  
					
				}// end else 
			
			}// end if
			
		}// end for
		
		System.out.print("step 3");
		return stack.empty();

	}// end method isBalanced()
	
}

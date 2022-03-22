import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

import java.io.IOException;


class check_brackets {
	
    public static void main(String[] args) throws IOException {
		System.out.print(isBalanced());        
    }
    
	public static class Bracket {
		
	    char type;
	    int position;
	    
	    Bracket(int position, char type) {
	        this.type = type;
	        this.position = position;
	    }
	}
    
	public static String isBalanced() {
		
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = "";
        
		try {
			text = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int position = 0;
		
		char[] charList = text.toCharArray();
		
		Stack<Bracket> stack = new Stack<>();
		
		for(char bracket : charList) {
			
			position++;
			
			if(bracket ==  '(' || bracket ==  ')' || bracket ==  '[' || 
					bracket ==  ']' || bracket ==  '{' || bracket ==  '}' ) {
			
				if(bracket ==  '(' || bracket ==  '[' || bracket ==  '{') {										
					
					stack.push(new Bracket(position, bracket));
				}else {
					if(stack.empty() && validClose(bracket)) {
						return position+"";
					}
					
					Bracket top = stack.pop();
					
					if( (top.type == '[' && bracket != ']') || (top.type == '(' && bracket != ')') || (top.type == '{' && bracket != '}') ) {
						return position+"";
					}  
					
				}// end else 
			
			}// end if
			
		}// end for
		
		if(stack.empty()) {
			return "Success";	
		}else {
			return stack.pop().position+"";
		}		

	}// end method isBalanced()
	
	public static boolean validClose(char bracket) {
		
		if(bracket ==  ')' || bracket ==  ']' || bracket ==  '}') {
			return true;
		}else {
			return false;
		}
		
	}//end method validClose()
	
}

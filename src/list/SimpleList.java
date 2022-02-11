package list;

public class SimpleList {

    public static int solution(int[] A) {
        
        int smallest = 100000;
        int posibleSmallest = 1;

        for(int index = 0; index < A.length; index++) {

            posibleSmallest = A[index];
            posibleSmallest++;  
            
            if(check(A, posibleSmallest)) {            	
            	
            	if(posibleSmallest < smallest) {
            		smallest = posibleSmallest;
            	}
            	
            }

        }// end for
        
        return smallest;
    }// end method solution()
    
    public static boolean check(int[] A, int smallest) {
    	
        int temp = 1;
        
    	for(int i = 0; i < A.length; i++) {
            temp = A[i];

            if(smallest == temp) {
                return false;
            }

        }
        
    	return true;
    }
	
}
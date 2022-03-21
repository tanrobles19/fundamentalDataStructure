package programming.challenge;

import java.util.Scanner;

public class AlgorithmTest {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
				
		long list[] = new long[n];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt();
		}
		
		System.out.println(maxPairWiseProductImprove2(list));
				
		
	}// end method main()

	public static long maxPairWiseProductImprove2(long[] numberList) {
		
		int max_index1 = -1;
		int max_index2 = -1;
		
        int length = numberList.length;
        
        for(int i = 0; i < length; i++) {		
        	if((max_index1 == -1) || ( numberList[i] > numberList[max_index1]) ) {
        		max_index1 = i;
        	}
        }
        
        for(int j = 0; j < length; j++) {		
        	if(  j != max_index1 && ((max_index2 == -1) || ( numberList[j] > numberList[max_index2]) ) ) {
        		max_index2 = j;
        	}
        }               
        
		return numberList[max_index1] * numberList[max_index2];
	}
		
}

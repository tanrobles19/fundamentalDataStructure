package microsoft.algorithm;

import java.util.ArrayList;

public class Algorithm {
	
	public static void solution(String dataSource) {
		
		String inicial, next, fragment = "";
		
		ArrayList<String> fragmentList = new ArrayList<String>();
		
		for(int i = 0; i < dataSource.length()-1; i++ ) {
			
			inicial = dataSource.substring(i, i + 1);
			next = dataSource.substring(i + 1, i + 2);
			
			if(inicial.equalsIgnoreCase(next)) {
				
				if(fragment.equalsIgnoreCase("")) {
					fragment = fragment + inicial + next;
				}else {
					fragment = fragment + next;
				}							

			}else {
				
				if(i == 0) {
					fragmentList.add(inicial);
					fragment = next;
					continue;
				}
				
				if(fragment.equalsIgnoreCase("")) {
					fragmentList.add(inicial);
				}else {
					fragmentList.add(fragment);
					fragment = next;
				}
			}
			
		}// end for
		
		if(!fragment.equalsIgnoreCase("")) {
			fragmentList.add(fragment);
		}
		
		System.out.println(fragmentList.toString());
		
	}// end method solution()
	
}
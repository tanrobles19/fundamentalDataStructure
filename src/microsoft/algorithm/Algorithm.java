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
	
	public static void solution2(String dataSource) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < dataSource.length(); i++) {
			
			String currentCharacter = dataSource.substring(i, i + 1);
		
			if(list.isEmpty()) {
				list.add(currentCharacter);
			}else {
				
				int lastIndex = list.size() -1;
				String lastValue = list.get( lastIndex );
				
				if(lastValue.substring(0, 1).equalsIgnoreCase(currentCharacter)) {
					list.set(lastIndex, lastValue + currentCharacter);
				}else {
					list.add(currentCharacter);
				}
			}// end else
			
		}// end for
				
		for(String s : list)
			System.out.println(s);
		
	}// end method solution2()	
	
}
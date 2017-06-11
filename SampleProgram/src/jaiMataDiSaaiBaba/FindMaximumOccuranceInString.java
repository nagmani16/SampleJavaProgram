package jaiMataDiSaaiBaba;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMaximumOccuranceInString {

	public static void main(String[] args) {
		
		String input= "Hello World";
		
		
		getMaximumOccuranceChar(input);
		getMaximumOccuranceChar("HO HELLO");
		

	}

	private static void getMaximumOccuranceChar(String input) {
		
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		Character ch;
		
		for (int i=0;i<input.length();i++){
			ch= input.charAt(i);
			if (map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		// retrieve the key for max value
		
		int maxValueinMap= (Collections.max(map.values()));
		
		for (Map.Entry<Character, Integer> entry: map.entrySet()){
			if (entry.getValue()==maxValueinMap){
				 
				System.out.println(entry.getKey());
				return;
				
			}
		}
		
	}

}

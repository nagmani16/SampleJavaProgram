package jaiMataDiSaaiBaba;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	
	
	public static void main (String [] args){
		
		String input = "nagmani";
		
		System.out.println(removeDuplicatefrom(input));
		
	}

	private static String removeDuplicatefrom(String input) {
		
		Set<Character> set = new HashSet<Character> ();
		StringBuffer sf= new StringBuffer();
		
		for (int i=0; i<input.length();i++) {
			Character ch= input.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
				sf.append(ch);
				
			}
			
		}
		
		return sf.toString();
	}

}

package jaiMataDiSaaiBaba;

import java.util.HashMap;

public class CheckFirstNonRepetativeCharacterWithHash {

	public static void main(String[] args) {
		String input= "aaaa";
		findFirstNonRepatative(input);

	}

	private static void findFirstNonRepatative(String input) {
		
		int length = input.length();
		
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		Character ch;
		for (int i=0; i<length;i++){
			ch= input.charAt(i);
			if (map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		
		
		// retrieve the count for each character
		
		for (int j=0; j<length; j++){
			ch= input.charAt(j);
			
			if (map.get(ch)==1){
				System.out.println("the first non repeatative character is" + " " + ch);
				return;
			}else {
				System.out.println("No repetation");
			}
			
			
		}
		
	}

}

package jaiMataDiSaaiBaba;

public class CheckFirstNonRepetiveCharacter {

	public static void main(String[] args) {

		String input= "aaar";
		String lowercaseinput= input.toLowerCase();
		firstNonRepetative(lowercaseinput);
		
		
		
		
	}

	private static void firstNonRepetative(String input) {
		
		for (int i=0; i<input.length();i++) {
			
			Character ch =input.charAt(i);
			System.out.println(input.substring(0, i));
		
			if (!(input.substring(i+1).contains(ch.toString())||input.substring(0, i).contains(ch.toString())))
			{
				
				System.out.println("the first non repeatative character is" + " " + ch);
				break;
					
				
			} 
			
			if (i == (input.length()-1)){
			System.out.println("no characters are repetative");
			}
			
			
				
			}	
		
		
		
		
	}

}

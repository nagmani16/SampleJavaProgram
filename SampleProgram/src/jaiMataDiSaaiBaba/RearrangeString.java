package jaiMataDiSaaiBaba;

public class RearrangeString {

	public static void main(String[] args) {
		
		String input = "naag";
		
		System.out.println(rearrangeValue(input));

	}

	private static String rearrangeValue(String input) {
		StringBuilder sb= new StringBuilder();
		sb.append(input.charAt(0));
		for (int i=1; i<input.length();i++) {
			if (input.charAt(i)==input.charAt(i-1)) {
				
			}
					
		}
		
		return sb.toString();
	}

}

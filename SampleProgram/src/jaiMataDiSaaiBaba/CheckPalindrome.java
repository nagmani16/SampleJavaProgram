package jaiMataDiSaaiBaba;

public class CheckPalindrome {
	
	public static void main (String[]args){
		
		String a= "abbac";
		if (getPalindromeStatus(a) == true){
			System.out.println("String" + a + "is Palindrome");
		} else {
		System.out.println("String" + a + "is not Palindrome");
		}
	}

	private static boolean getPalindromeStatus(String a) {
		StringBuffer rev= new StringBuffer(a).reverse();
		String arev= rev.toString();
		if (arev.equalsIgnoreCase(a)){
			return true;
		}else{
		return false;
		}
	}

}

package jaiMataDiSaaiBaba;

/*
 * Get String length and set an interval
 * 
 * check if String length is greater than the input string
 * 
 * if String is bigger than interval, then call reverse method from start point to interval
 * 
 * increase start to start + interval
 * 
 *  check again if String from new start point is bigger than the interval , if yes the call reveser function and increase start
 *  repeat this till Strings from new start point is bigger then interval. 
 *  if it is not bigger than the interval than reverse the remaining one 	
 * 
 */
public class ReverseStringWithInterval {
	
			public static void main(String[] args){
			String input = "abcd";
			Integer interval = 4;

			Integer start = 0;
			String revInput = "";
			
			/*
			 * need to start the loop from start+interval because if the initial string length is less then this loop will not run 
			 * 
			 */
			while((start + interval) < input.length()){
				revInput = reverseMe(input, start, start + interval, revInput);
				start = start + interval;
			}
			// this line of code is get the remaining character after interval
			if(revInput.length() < input.length()){
				revInput = reverseMe(input, start, input.length(), revInput);
			}
			System.out.println(revInput);
		}
		
		/*
		 * This method is to get the input, 
		 * get the start and end substring, 
		 * Reverse it
		 * put it in required String and then return
		 */
		public static String reverseMe(String input, Integer start, Integer end, String addTo){
			StringBuilder sb = new StringBuilder(input.substring(start, end));
			return (addTo + sb.reverse());	
		}
	}
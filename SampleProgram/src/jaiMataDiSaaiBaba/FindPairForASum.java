package jaiMataDiSaaiBaba;

public class FindPairForASum {
	/*
	 * in this example we are going  through an array 
	 * 1. set counter =0;
	 * 2. get first number of array
	 * 3. sum it with all the subsequnt number
	 * 4. if it equals the given sum then increase the counter
	 * 5. do it for all the numbers and find the total number of pairs
	 */
	

	public static void main(String[] args) {
		
		int a[] = {2,3,5,5,6,4};
		int numberToFindByPair= 8;
		
		findPair(numberToFindByPair,a);
			
		

	}

	private static void findPair(int numberToFindByPair, int[] a) {
		int counter=0;
		for(int i=0; i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			  if (a[i]+a[j]== numberToFindByPair){
				  counter +=1;
				    System.out.println("the required pair for" + numberToFindByPair + "is" + a[i] + " and" + a[j]);
				 continue;
			  }
			}
			
		}
		if (counter == 0){
		System.out.println("no pair found");
		} else {
			System.out.println("total pairs found =" + " " + counter );
		}
	}
	

}

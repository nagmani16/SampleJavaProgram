
package jaiMataDiSaaiBaba;
public class FindConsecutiveMax {
	
	/*
	 * The Algorithm for finding the consecutive max in an array comes from Kadane's logic which is described below. 
	 * 
	 * 1. Set the max_consecutiveSum_=a[0] first element of the array
	 * 2. set current_max=a[0] first element of the array
	 * 3. for each array element
	 * 4. make curret_max = current_max+currentArrayElement(a[i})
	 * 5. If max_consecutiveSum > curret_max then set curret_max=curret_max
	 * 6. if curret_max<a[i] that perticular element of array then set current_max= a[i]
	 * 7. return max_consecutiveSum as largest sum 
	 * 
	 */

	public static void main(String[] args) {
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println("The max of consecutive integers in an array is " + getConsecutiveMax(a));

	}

	private static int getConsecutiveMax(int[] a) {
		int max_consecutiveSum_=a[0];
		int current_max=a[0];
		int size= a.length;
		
		for (int i=1; i<size;i++){
			
			current_max= current_max+a[i];
			
			if (max_consecutiveSum_< current_max){
				max_consecutiveSum_=current_max;
			}
			
			if (current_max<a[i]){
				current_max=a[i];
			}
			
		}
		
		return max_consecutiveSum_;
	}

}

package jaiMataDiSaaiBaba;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	
	public static int[] mergeTwoSortedArray(int[]a, int[]b){
		
		/*
		 * find the corner case, 
		 * case 1 - if both arrays are null
		 * case 2- if one of array is empty
		 */
		
		if (a== null && b== null) {
			
			return null;
			
		}
		
		if (a==null){
			return Arrays.copyOf(b,b.length);
		}
		
		if (b==null){
			return Arrays.copyOf(a, a.length);
		}
		
		/* Use the merge sort logic to combine two arrays
		 * Initialize i for array a, j for array b and k for array c
		 *  
		 */
		 
		int i=0; int j=0; int k=0;
		
		//array c is the new array where all the combined sorted array will be place
		int []c= new int[a.length+b.length];
		
		while (i<a.length && j<b.length){
			
			if (a[i]<b[j]){
				c[k]=a[i];
				i++;
				
			} else {
				
				c[k]=b[j];
				j++;
			}
			
			k++;
			
			
			
		}
		
		// to get the remaining one
		
		if (i==a.length) {
			while (j<b.length){
				c[k++]=b[j++];
			}
		} else {
			
			while(i<a.length){
				c[k++]=a[i++];
			}
		}
		
		
		
		return c;
		
	}
	

	public static void main(String[] args) {

		int [] a= {2,2,4,6,8};
		int [] b = {2,3,7,10,12,15};
		int []c = mergeTwoSortedArray(a,b);
		
		for (int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		

	}

}

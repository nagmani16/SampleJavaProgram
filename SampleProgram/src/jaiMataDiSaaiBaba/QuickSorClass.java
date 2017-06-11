package jaiMataDiSaaiBaba;

import java.util.Arrays;

public class QuickSorClass {
	
	private int array[];
	private int length;
	
	public void sort(int [] input){
		
		if (input ==null || input.length ==0){
			return;
		}
		this.array=input;
		length= input.length;
		
		QuickSort(0,length-1);
		
	}
	
	
	private void QuickSort(int lowerIndex, int higherIndex) {
			System.out.println("lowerindex =" + lowerIndex );
			System.out.println("higherIndex =" + higherIndex );

			int i= lowerIndex;
			int j= higherIndex;
	
			
			
			//get the pivot array element
		//	int pivot= array[lowerIndex+(higherIndex-lowerIndex)/2];	
			
			int pivot= array[lowerIndex+(higherIndex-lowerIndex)/2];
			System.out.println("pivot =" + pivot  );
		   // based on the pivot , divide the array in two parts
			
			while (i<=j){
				
				/*
				 * Need to iterate to find a number from right side which is lesser than pivot value and left side which is greater than pivot, so we can swap the right side 
				 * value with left side
				 */
				
				while (array[i]<pivot){
					i++;
				}
				
				while (array [j]>pivot) {
					j--;
				}
				
				if (i<=j){
					exchangeNumber(i,j);
				
				
				i++;
				j--;
				
				System.out.println("i =" + i);
				System.out.println("j =" + j);
				}
			}
		
		 
			
			// call quickSort() method recursively
	        if (lowerIndex < j)
	        	QuickSort(lowerIndex, j);
	        if (i < higherIndex)
	        	QuickSort(i, higherIndex);
	    }
	 
	
	


	private void exchangeNumber(int i, int j) {
		int temp= array[i];
		array[i]= array[j];
		array[j]= temp;
		
	}

	
	

	public static void main(String []args){
		
		int [] input = {17,41,5,22,54,6,29,3,13};
		
		
		QuickSorClass QS= new QuickSorClass();
		
		QS.sort(input);
		
		
		for (int i=0;i<input.length;i++){
			System.out.println(input[i]);
			System.out.println(" ");

		}
		
		
	}

	
}

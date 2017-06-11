package jaiMataDiSaaiBaba;

public class CountMaxOne {

	public static void main(String[] args) {
		
		int [] binaryArray= {0,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,1,1,1,0};
		
		getMaxOnes(binaryArray);

	}
	/* 
	 * First set the counter and max as 0
	 * navigate the array , 
	 * set the counter as 0 if navigation encounters 0 else
	 * increase counter
	 * set maxOnes equal to counter if it is greater than current max
	 * return max
	 */
	
	private static void getMaxOnes(int[] binaryArray) {
		
		int counter=0;
		int maxOnes=0;
		
		for (int i=0;i<binaryArray.length;i++){
			if (binaryArray[i]==0){
				counter = 0;
			} else {
				counter++;
			}
			
			maxOnes= counter>maxOnes ? counter:maxOnes;
		}
		
		
		System.out.println("Max Consecutive 1's in array is " + maxOnes);
		
	}

}

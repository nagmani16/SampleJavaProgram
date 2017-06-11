package jaiMataDiSaaiBaba;

public class FindPairInTwoArrayForASum {

	public static void main(String[] args) {
        int [] a= {1,2,3,4,6};
        int [] b= {6,0,9,9,1};
        int sum= 17;
        
        getPairforGivenSum(a,b,sum);
	}

	private static void getPairforGivenSum(int[] a, int[] b, int sum) {
		int counter =0;
		for (int i=0; i<a.length;i++){
			
			for (int j=0;j<b.length;j++){
				if (sum -( a[i]+b[j])==0){
					System.out.println(a[i] + "and" + " " +b[j] + "has sum of" + sum);
					counter+=1;
					continue;
				} 
			}
		}
		
		if (counter == 0){
			System.out.println("No pair found");
		}
		
	}

}

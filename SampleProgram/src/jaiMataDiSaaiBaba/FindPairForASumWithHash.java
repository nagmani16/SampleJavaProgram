package jaiMataDiSaaiBaba;

import java.util.HashSet;

public class FindPairForASumWithHash {
	

	public static void main(String[] args) {
		
		int a[]= {2,3,5,5,6,4};
		int numberToFindByPair= 8;
		
		findPair(numberToFindByPair,a);
		
		

	}

	private static void findPair(int numberToFindByPair, int[] a) {
		
		HashSet<Integer> set= new HashSet<Integer>();
		int counter= 0;
		
		for (int i=0; i<a.length;i++){
			
			if (set.contains(numberToFindByPair - a[i])){
				System.out.println("the pair found is" + a[i] + "and" + (numberToFindByPair - a[i]));
				counter+=1;
				continue;
			} else {
				set.add(a[i]);
			}
			
			
		}
		
		if (counter ==0){
		System.out.println("no pair found");
		} else{
			System.out.println("total pairs found =" + " " + counter );
		}
	}

}

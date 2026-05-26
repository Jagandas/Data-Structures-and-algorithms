package Infosys.arrays;

import java.util.HashSet;

public class findpairswithgivensum {
	public static void findpairs(int arr[],int target) {
		HashSet<Integer>set=new HashSet<>();
		 System.out.println("Pairs with sum " + target + ":");

	        for (int i = 0; i < arr.length; i++) {

	            int complement = target - arr[i];
	            if(set.contains(complement)) {
	            	System.out.println(complement +"+" +arr[i]+ "="+target);
	            }
	            set.add(arr[i]);
	        }
	}
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int target=8;
		findpairs(arr,target);
	}
}

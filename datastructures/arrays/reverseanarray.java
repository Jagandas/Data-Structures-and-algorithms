package Infosys.arrays;

import java.util.Arrays;

public class reverseanarray {
	public int[] reverse(int arr[]) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
			
		}
		return arr;
	}
	public static void main(String[]args) {
		reverseanarray rev=new reverseanarray();
		int arr[]= {2,7,9,11,15,4,3};
		int result[]=rev.reverse(arr);
		System.out.println(Arrays.toString(result));
	}
}

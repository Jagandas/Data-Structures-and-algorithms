package Infosys.arrays;

public class smallestelement {
	public int findsmallest(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[]args) {
		smallestelement se=new smallestelement();
		int arr[]= {4,5,11,2,7,9};
		int result=se.findsmallest(arr);
		System.out.println(result);
	}
}

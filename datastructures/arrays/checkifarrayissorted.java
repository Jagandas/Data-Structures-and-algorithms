package Infosys.arrays;

public class checkifarrayissorted {
	public boolean issorted(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args) {
		checkifarrayissorted check=new checkifarrayissorted();
		int []arr= {10,20,30,40,50};
		boolean result=check.issorted(arr);
		
		if(result) {
			System.out.println("array is sorted");
		}
		else {
			System.out.println("array is not sorted");
		}
	}
}

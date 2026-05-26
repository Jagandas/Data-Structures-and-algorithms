package Infosys.arrays;

public class missingnumber {
	public int findmissing(int arr[],int n) {
		int expectedsum=n*(n+1)/2;
		int actualsum=0;
		for(int i=0;i<arr.length;i++) {
			actualsum+=arr[i];
		}
		int totalsum=expectedsum-actualsum;
		
		return totalsum;
	}
	public static void main(String[]args) {
		missingnumber miss= new missingnumber();
		int[]arr = {1,2,3,5};
		int n=5;
		int result=miss.findmissing(arr,n);
		System.out.println(result);
	}
}

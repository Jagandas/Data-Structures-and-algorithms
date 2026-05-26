package Infosys.arrays;

public class largestelement {
	public int findlargest( int arr[]) {
		 int max=arr[0];
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 return max;
	}
	public static void main(String[]args) {
		largestelement le=new largestelement();
		int arr[]= {2,7,11,9,5};
		int result=le.findlargest(arr);
		System.out.println(result);
	}
}

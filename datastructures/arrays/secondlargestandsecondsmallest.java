package Infosys.arrays;

public class secondlargestandsecondsmallest {
	public  int[] findnums(int arr[]) {
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int secondmin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			else if(arr[i]>secondmax && arr[i]<max) {
				secondmax=arr[i];
			}
			
			if(arr[i]<min) {
				secondmin=min;
				min=arr[i];
			}
			else if(arr[i]<secondmin && arr[i]>min) {  
				secondmin=arr[i];
			}
		}
		return new int[] {secondmax,secondmin};
	}
	public static void main(String[]args) {
		secondlargestandsecondsmallest sls=new secondlargestandsecondsmallest();
		int arr[]= {2,5,11,9,7};
		int result[]=sls.findnums(arr);
		System.out.println("second largest:" +result[0]);
		System.out.println("second smallest:" +result[1]);
	}
}

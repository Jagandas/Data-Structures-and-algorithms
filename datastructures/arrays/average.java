package Infosys.arrays;

public class average {
	public int findaverage(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		int average=sum/arr.length;
		
		return average;
	}
	public static void main(String[]args) {
		average avg=new average();
		int arr[]= {2,3,7,9,11};
		int result=avg.findaverage(arr);
		System.out.println(result);
	}
}

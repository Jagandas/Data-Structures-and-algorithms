package Infosys.arrays;

import java.util.Scanner;

public class sumofarray {
	public static int sum(int[]arr) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		return total;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int result=sumofarray.sum(arr);
		System.out.println(result);
		sc.close();
	}
}

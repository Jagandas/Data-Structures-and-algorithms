package Infosys.arrays;

public class removeduplicatesfromsortedarray {
	public int remove(int arr[]) {
		
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		}
		return j+1;
	}
	public static void main(String[]args) {
		removeduplicatesfromsortedarray dup=new removeduplicatesfromsortedarray();
		int arr[]= {1,1,2,3,4,4,5,6,7,7};
		int result=dup.remove(arr);
		System.out.println("Arrays after removing duplicates:");
		
		for(int i=0;i<result;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

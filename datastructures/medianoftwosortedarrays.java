package firstweek;

public class medianoftwosortedarrays {
	public static double findMedianoftwoSortedArrays(int[]nums1,int[]nums2) {
		int merged[]=new int[nums1.length+nums2.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				merged[k++]=nums1[i++];
			}
			else {
				merged[k++]=nums2[j++];
			}
		}
		
		while(i<nums1.length) {
			merged[k++]=nums1[i++];
		}
		
		while(j<nums2.length) {
			merged[k++]=nums2[j++];
		}
		
		int n=merged.length;
		
		if(n%2==1) {
			return merged[n/2];
		}
		return (merged[n / 2] + merged[(n / 2) - 1]) / 2.0;
	}
	public static void main(String[]args) {
		int nums1[]= {1,2};
		int nums2[]= {3,4};
		double result = findMedianoftwoSortedArrays(nums1, nums2);

		System.out.println(result);
	}
}

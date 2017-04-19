package com.hmm.test;

public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int midRes = 0;
		int mid = (m + n) / 2;
		for (int i = 0, j = 0; i < m && j < n;) {
			if (nums1[i] <= nums2[j]) {
				i++;	
				midRes++;
			}else {
				j++;
				midRes++;
			}
			if(midRes == mid)
				break;
		}
		return 0.0;
	}
}

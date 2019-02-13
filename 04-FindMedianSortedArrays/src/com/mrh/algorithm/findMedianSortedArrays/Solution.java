package com.mrh.algorithm.findMedianSortedArrays;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == nums2.length) {
        	if(nums1[nums1.length-1] <= nums2[0]) {
        		return ((double)nums1[nums1.length-1] + (double)nums2[0])/2;
        	} else if(nums1[0] >= nums2[nums2.length-1]) {
        		return ((double)nums2[nums2.length-1] + (double)nums1[0])/2;
        	}
        }
        
        return 0;
    }
}

package com.mrh.algorithm.sumtwonum;

/**
 * 暴力法（直接遍历)
 * @author tbtx
 *
 */
public class Answer01Violence implements Answer {

	@Override
	public int[] solve(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > target) {
				continue;
			}
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j] > target) {
					continue;
				}
				if(nums[i]+nums[j] == target) {
					int[] result = {i,j};
					return result;
				}
			}
		}
		return null;
	}

}

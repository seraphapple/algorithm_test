package com.mrh.algorithm.sumtwonum;

import java.util.HashMap;
import java.util.Map;

public class Answer03HashMapOnce implements Answer {

	@Override
	public int[] solve(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
			int another = target - nums[i];
			Integer index = map.get(another);
			if(index != null) {
				return new int[] {index, i};
			}
		}
		return null;
	}

}

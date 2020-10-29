package com.cognixia.javaprep.weektwo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum2(int[] nums,int target) {
		Map<Integer,Integer> numMap = new HashMap<>();
		for (int i=0; i<nums.length;i++) {
			if (numMap.containsKey(target - nums[i])) {
				return new int[] {i, numMap.get(target-nums[i])};
			}
			numMap.put(nums[i],i);
		}
		return null;
		
	}

	
	public static int[] twoSum(int[] nums,int target) {
		int startInt = 0;
		for (int i=0;i<nums.length;i++) {
			for (int j=startInt;j<nums.length;j++) {
				if(nums[i] + nums[j] == target & i!=j) {
					int[] returnArray = {i,j};
					return returnArray;
				}
			}
			startInt++;
		}
		return null;
	}
	
	public static int[] twoSumFinal(int [] nums,int target) {
		Map <Integer,Integer> numMap = new HashMap<>();
		for (int i=0; i < nums.length;i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] {i,numMap.get(complement)};
			}
			numMap.put(nums[i], i);
		}
		return null;
	}
}

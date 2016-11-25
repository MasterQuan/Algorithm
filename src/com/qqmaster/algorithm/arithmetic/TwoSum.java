package com.qqmaster.algorithm.arithmetic;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * @author zhaoshiquan
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	int length = nums.length;
    	if(length<2)
    		return null;
    	
    	int[] locs = new int[2];
    	int temp = 0;
    	for(int i=0; i<length-1; i++){
    		temp = target-nums[i];
    		for(int j = i+1; j<length; j++){
    			if(nums[j]==temp){
    				locs[0] = i;
    				locs[1] = j;
    				return locs;
    			}
    		}
    	}
		return locs;
    }
}
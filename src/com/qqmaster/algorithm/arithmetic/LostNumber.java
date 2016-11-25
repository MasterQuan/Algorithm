package com.qqmaster.algorithm.arithmetic;

/**
 * 99个不同的整数，对应1-100之间，少一个数，给出这个数
 * @author zhaoshiquan
 *
 */
public class LostNumber {
	private final int NUMS = 100;
	
	/**
	 * 连续所有数之和减去，数组中所有数之和，结果为丢失的整数
	 * 时间复杂度O(n),空间复杂度O(1)
	 * @param nums
	 * @return
	 */
	private int getlost1(int nums[]){
		int sum =0;
		int sumAll = 0;
		for(int i=0; i<nums.length; i++){
			sum +=nums[i];
			sumAll += i;
		}
		sumAll = sumAll + NUMS + NUMS-1;
		return sumAll-sum;
	}
	
	//利用hash的思想。
	/**
	 * 利用hash的思想，映射到对应的数组上
	 * 时间复杂度O(n),空间复杂度O(n)
	 * @param nums
	 * @return
	 */
	private int getlost2(int nums[]){
		boolean[] sig = new boolean[NUMS];
		for(int i=0; i<nums.length; i++){
			sig[nums[i]]=true;
		}
		for(int i = 0; i<NUMS; i++){
			if(!sig[i]){
				return i+1;
			}
		}
		return 0;
	}
	
	/**
	 * 利用异或，效率更高
	 * 时间复杂度O(n)，空间复杂度O(1)
	 * @param nums
	 * @return
	 */
	private int getlost3(int nums[]){
		
		int num=0;
		for(int i=0; i<nums.length; i++){
			num = num^nums[i]^i;
		}
		num = num ^ NUMS^(NUMS-1);
		return num;
	}
}

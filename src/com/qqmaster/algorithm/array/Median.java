package com.qqmaster.algorithm.array;
/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 * Example 1:
 * 	nums1 = [1, 3]
 * 	nums2 = [2]
 * 	The median is 2.0
 * Example 2:
 * 	nums1 = [1, 2]
 * 	nums2 = [3, 4]
 * 	The median is (2 + 3)/2 = 2.5
 * 
 * 
 * 
 * 
 * @author zhaoshiquan 2017年4月15日 上午10:03:48
 *
 */
public class Median {

	public static void main(String[] args) {
		int[] num1 = {1,2};
		int[] num2 = {3,4,5};
		System.out.println(findMedianSortedArrays(num1, num2)); 
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1 = nums1.length, len2 = nums2.length, totalsize = len1 + len2;
		boolean even = totalsize % 2 == 0 ? true : false;
		int totalLen = (totalsize>>1) + 1;
		int[] total = new int[totalLen];
		int index1 = 0, index2 = 0;
		for(int i = 0; i < totalLen; i++){
			if(index1 >= len1){
				total[i] = nums2[index2];
				index2++;
				continue;
			}else if(index2 >= len2){
				total[i] = nums1[index1];
				index1++;
				continue;
			}

			if(nums1[index1] < nums2[index2]){
				total[i] = nums1[index1];
				index1++;
			}else{
				total[i] = nums2[index2];
				index2++;
			}
		}
		if(even){
			return (total[totalLen-1] + total[totalLen-2])/2.0;
		}
		return total[totalLen-1];
	}
}

package com.qqmaster.algorithm.array;

import java.util.HashSet;

/**
 * 请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。
 * 
 * @author zhaoshiquan
 * 
 */
public class ClearZero {
	
	public int[][] clearZero(int[][] mat, int n) {
		if(n<1) return mat;
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n;j++){
				if(mat[i][j]==0){
					h1.add(i);
					h2.add(j);
				}
			}
		}
		
		for (Integer i : h1) {
			for(int j = 0; j < n; j++){
				mat[i][j] = 0;
			}
		}
		
		for (Integer j : h2) {
			for(int i=0; i<n; i++){
				mat[i][j] = 0;
			}
		}
		
		return mat;
    }
}

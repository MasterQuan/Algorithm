package com.algorithm.sort;

public class InsertSort {  
	
	public int[] inserSort(int[] arrays){
		int temp = 0;  
		for(int i = 1; i < arrays.length; i++){  
			int j = i-1;  
			temp = arrays[i];  
			for(; j >= 0 && temp < arrays[j]; j--){  
				arrays[j+1] = arrays[j];  //将大于temp的值整体后移一个单位  
			}  
			arrays[j+1] = temp;  
		}
		return arrays;
	}
	
	public String toString(int[] arrays){
		StringBuilder sb = new StringBuilder();
		for(int a:arrays){
			sb.append(a).append(" ");
		}
		return sb.toString();
	}
}
package com.algorithm.sort;

public class SelectSort {

	public int[] selectSort(int[] a){

		int position = 0;  
		
		for(int i = 0; i < a.length; i++){       
			int j = i + 1;  
			position = i;  
			int temp = a[i];  
			for(; j < a.length; j++){  
				if(a[j] < temp){  
					temp = a[j];  
					position = j;  
				}  
			}  
			a[position] = a[i];  
			a[i] = temp;  
		}  
		return a;
	}
}

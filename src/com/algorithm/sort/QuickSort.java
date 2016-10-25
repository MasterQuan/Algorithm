package com.algorithm.sort;

public class QuickSort {
	public void quickSort(int[] input){
		sort(input, 0, input.length-1);
	}

	public void sort(int[] input,int low,int high){
		if (high <= low){
			return;
		}

		int mid=partition (input, low, high);

		sort (input, low, mid-1);
		sort (input, mid+1, high);
	}

	public int partition(int[] input, int low, int high){
		
		return 0;
	}
	
	public String toString(int[] input){
		StringBuilder sb = new StringBuilder();
		for(int a:input){
			sb.append(a).append(" ");
		}
		return sb.toString();
	}
}

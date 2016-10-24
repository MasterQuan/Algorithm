package com.algorithm.sort;

public class SortTest {
	public static void main(String[] args) {
		
		int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,
				      99,98,54,56,17,18,23,34,15,35,25,53,51};
		
		InsertSort insertSort = new InsertSort();
		System.out.println(insertSort.toString(insertSort.inserSort(a)));
	}
}

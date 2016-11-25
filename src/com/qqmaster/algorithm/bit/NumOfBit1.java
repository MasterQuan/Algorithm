package com.qqmaster.algorithm.bit;

//求一个数的二进制表示中1的个数
public class NumOfBit1 {
	public static int getNumOfBit1(int num){
		int total = 0;
		for(int n = num; n!=0; n=(n&(n-1))){
			++total;
		}
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(getNumOfBit1(0));
		System.out.println(getNumOfBit1(1));
		System.out.println(getNumOfBit1(15));
		System.out.println(getNumOfBit1(1024));
	}
}

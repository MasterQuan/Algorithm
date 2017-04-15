package com.qqmaster.algorithm.bit;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
		return bitCount(x^y);
	}
	private int bitCount(int i){
		int count = 0;
		for(;i!=0;count++){
			i &= (i-1);
		}
		return count;
	}
}

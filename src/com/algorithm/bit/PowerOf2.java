package com.algorithm.bit;

//判断一个数是不是2的N次方
public class PowerOf2 {
	public static boolean isPowerOf2(int num){
		if(num<1){
			return false;
		}
		if((num&(num-1)) == 0){
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPowerOf2(0));
		System.out.println(isPowerOf2(1));
		System.out.println(isPowerOf2(2));
		System.out.println(isPowerOf2(1024));
		System.out.println(isPowerOf2(1023));
	}
}

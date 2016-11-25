package com.qqmaster.algorithm.arithmetic;

public class GCD {
	public static void main(String[] args) {

	}
	//---------------------------------------------------

	//暴力枚举，从最小的数到1依次枚举，找出第一个能同时整除的数
	public static int gcd1(int a, int b){

		int min = a<b?a:b;
		for(int i = min; i > 1; i++){
			if((a%i)==0 && (b%i)==0){
				return i;
			}
		}

		return 1;
	}
	//---------------------------------------------------

	//辗转相除
	public static int gcd2(int a, int b){

		int min = (a<b)?a:b;
		int max = (min==a)?b:a;

		return gcd2s(max,min);
	}
	private static int gcd2s(int max, int min){

		if(max%min==0) return min;

		return gcd2s(min,max%min);
	}
	//---------------------------------------------------

	//更相减损法
	public static int gcd3(int a, int b){

		while(a!=b){
			if(a>b)
				a -= b;
			b -= a;
		}
		return a;
	}
	//---------------------------------------------------
	
	//更相减损+位移
	public static int gcd4(int a, int b){
		if(a == b) return a;
		if(a < b) return gcd4(b,a);
		else{
			if(a%2==0 && b%2==0){
				return gcd4(a>>1, b>>1)<<1;
			}else if(a%2==0 && b%2 != 0){
				return gcd4(a>>1,b);
			}else if(a%2!=0 && b%2 == 0){
				return gcd4(a,b>>1);
			}
			return gcd4(b, a-b);
		}
	}
}

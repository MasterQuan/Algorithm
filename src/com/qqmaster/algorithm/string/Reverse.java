package com.qqmaster.algorithm.string;

/**
 * 实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
 * @author zhaoshiquan
 */
public class Reverse {
	public static String reverseString(String iniString) {
		int len = iniString.length();
		if(iniString == null || len<=1)
			return iniString;
		// write code here
		StringBuffer sb = new StringBuffer();
		for(int i = len-1; i>=0; i--){
			sb.append(iniString.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("a"));
		System.out.println(reverseString(null));
		System.out.println(reverseString("null"));
		System.out.println(reverseString("wocaonidayede!"));
	}
}
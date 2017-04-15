package com.qqmaster.algorithm.string;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println("-->" + reverseString2("abcdefg" ,2));
	}

	/**
	 * Write a function that takes a string as input 
	 * and returns the string reversed.
	 * @param s
	 * @return
	 */
	public static String reverseString1(String s) {
		return reverse(s);
	}

	/**
	 * Given a string and an integer k, you need to reverse the first k 
	 * characters for every 2k characters counting from the start of the string. 
	 * If there are less than k characters left, 
	 * reverse all of them. If there are less than 2k but greater than or equal to 
	 * k characters, then reverse the first k 
	 * characters and left the other as original.
	 * 
	 * @param s
	 * @return
	 */
	public  static String reverseString2(String s, int k) {
		int len = 0;
		if(s == null || (len = s.length()) <= 1 || k <=1){
			return s;
		}
		
		if(len <= (k<<1)){
			return reverseSub(s,k);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(reverseSub(s.substring(0, k<<1),k)).append(reverseString2(s.substring(k<<1),k));
		
		return sb.toString();
	}

	/**
	 * Given a string, you need to reverse the order of characters
	 *  in each word within a sentence while still preserving 
	 *  whitespace and initial word order.
	 * @param s
	 * @return
	 */
	public static String reverseString3(String s) {
		if(s == null || s.length() <2){
			return s;
		}
		StringBuilder sb = new StringBuilder();
		for(String ss: s.split(" ")){
			sb.append(reverse(ss)).append(" ");
		}
		
		return sb.substring(0, s.length());
	}

	private static String reverse(String s){

		if(s == null || s.length() <= 1){
			return s;
		}
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		for(int i = len-1; i >=0 ; i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	private static String reverseSub(String s, int k){
		if(s == null || s.length()< k)
			return reverse(s);
		StringBuilder sb = new StringBuilder(reverse(s.substring(0, k)))
				.append(s.substring(k));
		return sb.toString();
	}
}

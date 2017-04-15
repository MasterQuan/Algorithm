package com.qqmaster.algorithm.string;

public class ReverseString {

	/**
	 * Write a function that takes a string as input 
	 * and returns the string reversed.
	 * @param s
	 * @return
	 */
	public String reverseString1(String s) {
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
	public String reverseString2(String s, int index) {
		if(s == null || s.length() <= 1 || index <=1){
			return s;
		}

		return null;
	}

	/**
	 * Given a string, you need to reverse the order of characters
	 *  in each word within a sentence while still preserving 
	 *  whitespace and initial word order.
	 * @param s
	 * @return
	 */
	public String reverseString3(String s) {
		if(s == null || s.length() <2){
			return s;
		}
		StringBuilder sb = new StringBuilder();
		for(String ss: s.split(" ")){
			sb.append(reverse(ss)).append(" ");
		}
		
		return sb.substring(0, s.length());
	}

	private String reverse(String s){

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
}

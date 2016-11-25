package com.qqmaster.algorithm.string;

/**
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，
 * 能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
 * @author zhaoshiquan
 *
 */
public class SameString {
	public static boolean checkSam(String stringA, String stringB) {
		int lenA = stringA.length();
		int lenB = stringB.length();
		if(lenA != lenB){
			return false;
		}
		int countA[] = new int[256];
		int countB[] = new int[256];
		for(int i=0; i<lenA; i++){
			countA[stringA.charAt(i)]++;
			countB[stringB.charAt(i)]++;
		}
		for(int i=0; i<256; i++){
			if(countA[i]!=countB[i]) 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkSam("This is nowcoder","is This nowcoder"));
		System.out.println(checkSam("Here you are","Are you here"));
		System.out.println(checkSam("",""));
	}
}

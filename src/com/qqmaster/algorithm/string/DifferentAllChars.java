package com.qqmaster.algorithm.string;

/**
 * 实现一个算法，确定一个字符串的所有字符是否全都不同。
 * @author zhaoshiquan
 *
 */
public class DifferentAllChars {
	//使用额外内存
	public static boolean checkDifferent1(String iniString) {
		int len = iniString.length();
		if(iniString == null || len<=1)
			return true;
		if(iniString.length()>256)
			return false;

		boolean [] flags = new boolean[256];
		for(int i=0; i<len; i++){
			char c = iniString.charAt(i);
			if(flags[c]){
				return false;
			}
			flags[c] = true;
		}
		return true;
	}

	//不适用额外内存
	public static boolean checkDifferent2(String iniString) {
		int len = iniString.length();
		if(iniString == null || len<=1)
			return true;
		if(iniString.length()>256)
			return false;
		
		for(int i=0; i<len; i++){
			for(int j = i+1; j<len; j++){
				if(iniString.charAt(i)==iniString.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkDifferent1(""));
		System.out.println(checkDifferent1("abjielw"));
		System.out.println(checkDifferent1("abjiela"));
		System.out.println();
		System.out.println(checkDifferent2(""));
		System.out.println(checkDifferent2("abjielw"));
		System.out.println(checkDifferent2("abjiela"));
	}
}

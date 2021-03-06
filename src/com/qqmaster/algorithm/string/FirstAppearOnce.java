package com.qqmaster.algorithm.string;

/**
 * 找出一个字符串中第一个出现不重复字符，没有输出'#'
 * @author zhaoshiquan
 */
public class FirstAppearOnce {

	public static char getFirstAppearOnce(String str){

		int count[] = new int[256];
		for(int i=0; i<str.length(); i++){
			count[str.charAt(i)]++;
		}
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if(count[c] == 1)
				return c;
		}
		return '#';
	}
	
	public static void main(String[] args) {
		System.out.println(getFirstAppearOnce("google"));
		System.out.println(getFirstAppearOnce("go"));
		System.out.println(getFirstAppearOnce("goog"));
		System.out.println(getFirstAppearOnce("!@#$%^&*()!"));
	}
}

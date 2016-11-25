package com.qqmaster.algorithm.string;

/**
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。
 * 比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
 * 若压缩后的字符串没有变短，则返回原先的字符串。
 * @author zhaoshiquan
 */
public class ZipString {
	public static String zipString(String iniString){
		int len = iniString.length();
		if(len<=2){
			return iniString;
		}
		
		StringBuffer sb = new StringBuffer();
		char[] chars = iniString.toCharArray();
		char temp = chars[0];
		int count = 1;
		for(int i=0; i<len-1; i++){
			temp = chars[i];
			if(chars[i+1]!=temp){
				sb.append(temp).append(count);
				temp = chars[i+1];
				count = 1;
			}else{
				count++;
			}
		}
		sb.append(temp).append(count);
		if(sb.length()>len)
			return iniString;
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(zipString(""));
		System.out.println(zipString("a"));
		System.out.println(zipString("aa"));
		System.out.println(zipString("aabcccccaaa"));
		System.out.println(zipString("welcometonowcoderrrrr"));
	}
}

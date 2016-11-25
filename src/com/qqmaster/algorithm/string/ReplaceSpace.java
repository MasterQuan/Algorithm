package com.qqmaster.algorithm.string;

/**
 * 将字符串中所有的" "替换成"20%"
 * @author zhaoshiquan
 */
public class ReplaceSpace {
	public static String replaceSpace(String str) {
		if(str == null || str.length()<1)
			return str;
		int len = str.length();
		StringBuffer sb = new StringBuffer(str);
		for(int i=len-1; i>=0;i--){
			if(sb.charAt(i)==' ')
				sb.replace(i, i+1, "20%");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(replaceSpace(" "));
		System.out.println(replaceSpace("wo cao!"));
		System.out.println(replaceSpace(""));
		System.out.println(replaceSpace(" n i m a g e d a n "));
	}
}

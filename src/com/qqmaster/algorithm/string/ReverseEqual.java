package com.qqmaster.algorithm.string;

/**
 * 假定我们都知道非常高效的算法来检查一个单词是否为其他字符串的子串。
 * 请将这个算法编写成一个函数，给定两个字符串s1和s2，请编写代码检查
 * s2是否为s1旋转而成，要求只能调用一次检查子串的函数。给定两个字符
 * 串s1,s2,请返回bool值代表s2是否由s1旋转而成。字符串中字符为英
 * 文字母和空格，区分大小写，字符串长度小于等于1000。
 * "waterbottle","erbottlewat"   true
 * @author zhaoshiquan
 *
 */
public class ReverseEqual {
	public static boolean checkReverseEqual(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1!=len2)
			return false;
		String s3 = s1+s1;
		return s3.contains(s2);
	}

	public static void main(String[] args) {
		System.out.println(checkReverseEqual(" ",""));
		System.out.println(checkReverseEqual("",""));
		System.out.println(checkReverseEqual("waterbottle","erbottlewat"));
		System.out.println(checkReverseEqual("waterBottle","erbottlewat"));
	}
}

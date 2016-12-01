package com.qqmaster.algorithm.linkedList;

import java.util.Stack;
/**
 * 请编写一个函数，检查链表是否为回文。
 * @author zhaoshiquan
 *
 */
public class Palindrome {
	public boolean isPalindrome(ListNode pHead) {
		if(pHead == null || pHead.next == null)
			return true;
		ListNode fast = pHead;
		ListNode slow = pHead;
		Stack<Integer> stk = new Stack<Integer>();
		for(;(fast != null)&&(fast.next!=null);){
			fast = fast.next.next;
			stk.push(slow.val);
			slow = slow.next;
		}
		if(fast!=null){
			slow = slow.next;
		}
		for(;slow!=null; slow = slow.next){
			if(slow.val != stk.pop()){
				return false;
			}
		}
		return true;
    }
}

package com.qqmaster.algorithm.linkedList;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author zhaoshiquan
 *
 */
public class KthToTailNode {
	public ListNode FindKthToTail(ListNode head,int k) {
//		if(RoundList.hasRound(head))
//			return null;
		ListNode first = head;
		for(int i=0; i<k; i++){
			if(first == null)return null;
			first = first.next;
		}
		ListNode last = head;
		for(; first!=null; first = first.next){
			last = last.next;
		}
		return last;
	}
}

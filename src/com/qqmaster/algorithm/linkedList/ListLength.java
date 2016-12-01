package com.qqmaster.algorithm.linkedList;

/**
 * 求一个链表的节点数，考虑有环节点。
 * @author zhaoshiquan
 *
 */
public class ListLength {
	public static int getListLength(ListNode list){
		int len = 0;
		if(list == null){
			return len;
		}
		if(RoundList.hasRound(list)){
			
			return 0;
		}
		ListNode node = list;
		while(node != null){
			len++;
			node = node.next;
		}
		return len;
	}
}

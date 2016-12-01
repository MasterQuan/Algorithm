package com.qqmaster.algorithm.linkedList;
/**
 * 给出一个有环链表的如环点，若无环，返回null
 * @author zhaoshiquan
 *
 */
public class RoundListEntryPoint {
	public ListNode getEntryPoint(ListNode list){
		if(list == null)
			return null;
		ListNode first = list.next;
		ListNode last = list;
		for(;;first = first.next.next,last = last.next){
			if(first!=null&&first.next!=null)
				return null;
			if(first == last)break;
		}
		ListNode newLast = list;
		for(;;newLast=newLast.next,last=last.next){
			if(newLast==last)
				return last;
		}
	}
}

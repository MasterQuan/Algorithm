package com.qqmaster.algorithm.linkedList;

public class RoundList {
	public static boolean hasRound(ListNode list){

		if(list == null || list.next == null)
			return false;
		
		ListNode node1 = list;
		ListNode node2 = list;
		
		do{
			if(node2.next == null){
				return false;
			}
			node2 = node2.next.next;
			node1 = node1.next;
			if(node2 == node1) return true;
			
		}while(node1!=null && node2!=null);
		return false;
	}
}

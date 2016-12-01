package com.qqmaster.algorithm.linkedList;

public class TwoListMerge {
	public static ListNode getMergePoint(ListNode list1, ListNode list2){

		int len1 = ListLength.getListLength(list1);
		int len2 = ListLength.getListLength(list2);
		ListNode head1 = list1;
		ListNode head2 = list2;

		if(len1>len2){
			int dif = len1 - len2;
			for(int i=1; i<= dif; i++){
				head1 = head1.next;
			}
		}else if(len1<len2){
			int dif = len2 - len1;
			for(int i=1; i<= dif; i++){
				head2 = head2.next;
			}
		}
		while(head1!=head2){
			head1 = head1.next;
			head2 = head2.next;
		}
		return head1;
	}
}

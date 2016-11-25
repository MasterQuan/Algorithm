package com.qqmaster.algorithm.linkedList;

public class LinkedList {
	
	/**
	 * 判断一个链表是否有环
	 * @param list
	 * @return
	 */
	public boolean hashRound(Node list){
		if(list == null || list.next == null)
			return false;
		
		Node node1 = list;
		Node node2 = list;
		
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
	
	//-------------------------------------------------------
	/**
	 * 找出一个链表的入环点
	 * @param list
	 * @return
	 */
	public Node getEntryPoint(Node list){
		
		if(!hashRound(list)){
			return null;
		}
		return null;
	}
	
	//--------------------------------------------------
	/**
	 * 找两个链表的交点
	 * @param list1
	 * @param list2
	 * @return
	 */
	public Node getMergePoint(Node list1, Node list2){
	
		int len1 = getLength(list1);
		int len2 = getLength(list2);
		Node head1 = list1;
		Node head2 = list2;
		
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
	private int getLength(Node list){
		int len = 0;
		Node node = list;
		while(node != null){
			node = node.next;
			len++;
		}
		return len;
	}
}

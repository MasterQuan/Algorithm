package com.qqmaster.algorithm.linkedList;
/**
 * 有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，
 * 也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果
 * @author zhaoshiquan
 */
public class ListPlusB {
	public ListNode plusAB(ListNode a, ListNode b) {
		int temp = 0;
		return plusAB(a, b, temp);
	}
	private ListNode plusAB(ListNode a, ListNode b, int temp){
		if(a == null){
			if(temp == 0)
				return b;
			if(b == null){
				return new ListNode(temp);
			}
			int sum = b.val + temp;
			ListNode result = new ListNode(sum%10);
			temp = sum/10;
			result.next = plusAB(a, b.next, temp);
			return result;
		}else{
			if(b == null){
				if(temp == 0)
					return a;
				int sum = a.val + temp;
				ListNode result = new ListNode(sum%10);
				temp = sum/10;
				result.next = plusAB(a.next, b, temp);
				return result;
			}
			int sum = a.val + temp + b.val;
			ListNode result = new ListNode(sum%10);
			temp = sum/10;
			result.next = plusAB(a.next, b.next, temp);
			return result;
		}
	}
}

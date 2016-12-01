package com.qqmaster.algorithm.linkedList;

import java.util.Stack;

/**
 * 有两个用链表表示的整数，每个结点包含一个数位。这些数位是正向存放的，
 * 也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果
 * @author zhaoshiquan
 */
public class ListPlusA{
	public ListNode plusAB(ListNode a, ListNode b) {
		if(a == null)
			return b;
		if(b == null)
			return a;
		
		Stack<Integer> stkA = new Stack<>();
		Stack<Integer> stkB = new Stack<>();
		ListNode listA = a;
		ListNode listB = b;
		while(listA!=null){
			stkA.push(listA.val);
			listA = listA.next;
		}
		
		while(listB!=null){
			stkB.push(listB.val);
			listB = listB.next;
		}
		
		ListNode last = null;
		int temp = 0;
		while((!stkA.isEmpty())||(!stkB.isEmpty())){
			if(stkA.isEmpty()){
				int sum = temp + stkB.pop();
				temp = sum/10;
				ListNode lsum = new ListNode(sum%10);
				lsum.next = last;
				last = lsum;
			}else if(stkB.isEmpty()){
				int sum = temp + stkA.pop();
				temp = sum/10;
				ListNode lsum = new ListNode(sum%10);
				lsum.next = last;
				last = lsum;
			}else{
				int sum = temp + stkA.pop() + stkB.pop();
				temp = sum/10;
				ListNode lsum = new ListNode(sum%10);
				lsum.next = last;
				last = lsum;
			}
		}
		if(temp!=0){
			ListNode lsum = new ListNode(temp);
			lsum.next = last;
			last = lsum;
		}
		return last;
    }
}

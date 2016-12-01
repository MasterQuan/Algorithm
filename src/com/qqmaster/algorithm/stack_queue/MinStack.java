package com.qqmaster.algorithm.stack_queue;

import java.util.Stack;

/**
 * 实现一个Stack，可以获取栈的最小元素。栈中的元素为int类型。
 * @author zhaoshiquan
 *
 */
public class MinStack {
	Stack<Integer> stk1 = new Stack<Integer>();
	Stack<Integer> minstk = new Stack<Integer>();
	int min = Integer.MAX_VALUE;

	public void push(int item){
		stk1.push(item);
		if(minstk.isEmpty() || item<=minstk.peek()){
			minstk.push(item);
		}
	}

	public int pop(){
		if(stk1.peek() == minstk.peek()){
			minstk.pop();
		}
		return stk1.pop();
	}
	public int getMin(){
		return minstk.peek();
	}
}

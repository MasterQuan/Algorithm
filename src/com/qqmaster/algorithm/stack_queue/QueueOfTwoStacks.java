package com.qqmaster.algorithm.stack_queue;

import java.util.Stack;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author zhaoshiquan
 */
public class QueueOfTwoStacks {
	private static Stack<Integer> stk1 = new Stack<Integer>();
    private static Stack<Integer> stk2 = new Stack<Integer>();
    
    public void push(int node) {
        while(!stk2.isEmpty()){
        	stk1.push(stk2.pop());
        }
        stk1.push(node);
    }
    
    public int pop() {
    	while(!stk1.isEmpty()){
    		stk2.push(stk1.pop());
    	}
    	return stk2.pop();
    }
}

package com.algorithm.tree;

public class BSTtest {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(5);
		bst.insert(6);
		bst.insert(2);
		bst.toString(bst.root);
		System.out.println();
		bst.insert(3);
		bst.insert(1);
		bst.insert(4);
		bst.toString(bst.root);
		System.out.println();
		bst.delete(2);
		bst.toString(bst.root);
		System.out.println();
	}
}

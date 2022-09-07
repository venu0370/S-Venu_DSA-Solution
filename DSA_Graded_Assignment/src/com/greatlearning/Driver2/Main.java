package com.greatlearning.Driver2;

import com.greatlearning.Service2.Node;
import com.greatlearning.Service2.Service;

public class Main {
	
	public static void main(String [] args) {
		
		Service obj = new Service();
		Node node;
		
		node = new Node(50);
		node.left = new Node(30);
		node.right =new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(55);
				
		Node rightSkewedTree = obj.completeBSTtoSkewed(node);
		
		System.out.println("The Resultant Output is :");
		
		obj.traverseRightSkewedTree(rightSkewedTree);	
	}
}

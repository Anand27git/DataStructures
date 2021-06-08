package com.BridgeLabz.linkedlistjava;

public class LinkedList {

	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	// add method
	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// append method
	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	// method to print the values of Linked List
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes are :");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}

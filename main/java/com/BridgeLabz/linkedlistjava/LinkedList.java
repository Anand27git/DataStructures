package com.BridgeLabz.linkedlistjava;

public class LinkedList {

	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	// add method UC - 1
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

	// append method UC-2
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

	// insert middle node UC3

	public void insertmiddleNode(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
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

	// delete node value UC-5
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	// method to delete last element of node UC6
	public void popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode.setNext(null);
	}
	// method for search element within node UC7
	 public boolean search(INode key) 
	 {
	        INode tempNode = head;
	        while(tempNode !=null && tempNode.getNext()!=null) {
	            if (tempNode.getKey()==key.getKey()) {
	                return true;
	            }
	            tempNode = tempNode.getNext();
	        }
	        return false;
	 }
	 
}

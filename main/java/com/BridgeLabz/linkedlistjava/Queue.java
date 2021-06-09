package com.BridgeLabz.linkedlistjava;

/********
 * 
 * @author ANAND 
 * purpose: Delete Queue
 *
 *********/
public class Queue {

	
	private final LinkedList myLinkedList;

	public Queue() {
		this.myLinkedList = new LinkedList();
	}
	// enqueue method is used for creation
	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}
	// dequeue method used for deletion
    public void dequeue() {
        myLinkedList.pop();
    }

	// This method will print the nodes.
	public void printQueue() {
		myLinkedList.printMyNodes();
	}

	// This method will return first value
	public INode peak() {
		return myLinkedList.head;
	}

}

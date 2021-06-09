package com.BridgeLabz.linkedlistjava;

/*********
 * 
 * @author ANAND purpose:pop the values from Stack
 */
public class Stack {

	private final LinkedList linkedList;

	public Stack() {
		this.linkedList = new LinkedList();
	}

	public void push(INode myNode) {
		linkedList.add(myNode);
	}

	public INode peak() {

		return linkedList.head;
	}

	public void printStack() {
		linkedList.printMyNodes();

	}

	public INode pop() {

		return linkedList.pop();
	}
}

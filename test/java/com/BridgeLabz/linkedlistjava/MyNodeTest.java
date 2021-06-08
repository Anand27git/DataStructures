package com.BridgeLabz.linkedlistjava;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/*************
 * 
 * @author ANAND 
 * purpose: Add Value In LinkedList 
 * 
 * 
 **************/
public class MyNodeTest {
	// UC-1 create simple Linked List
	@Test
	public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {

		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);

		System.out.println(result);
	}

	// UC-2  Add value in Linked list TestCase
	@Test
	public void given3elementsWhenLinkedShouldBeAddedToTop() {
		MyNode<Integer> myfirstNode = new MyNode<>(70);
		MyNode<Integer> mysecondNode = new MyNode<>(30);
		MyNode<Integer> mythirdNode = new MyNode<>(56);
		LinkedList linkedList = new LinkedList();
		// Adding Node to LinkedList
		linkedList.add(myfirstNode);
		linkedList.add(mysecondNode);
		linkedList.add(mythirdNode);
		// Printing Output of LinkedList Node 56->30->70
		linkedList.printMyNodes();
		boolean result = linkedList.head.equals(mythirdNode) && linkedList.head.getNext().equals(mysecondNode)
				&& linkedList.tail.equals(myfirstNode);
		Assert.assertTrue(result);
	}

}

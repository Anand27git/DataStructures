package com.BridgeLabz.linkedlistjava;

import org.junit.Assert;
import org.junit.Test;

/*************
 * 
 * @author ANAND
 * purpose: Deletion of last value of Node In LinkedList UC-6
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

	// UC-2 Add value in Linked list TestCase
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

	// UC-3 Append value in Linked list TestCase
	@Test
	public void given3elementsWhenLinkedShouldBeAddedAtEnd() {
		MyNode<Integer> myfirstNode = new MyNode<>(56);
		MyNode<Integer> mysecondNode = new MyNode<>(30);
		MyNode<Integer> mythirdNode = new MyNode<>(70);
		LinkedList linkedList = new LinkedList();
		// Append Node to LinkedList
		linkedList.append(myfirstNode);
		linkedList.append(mysecondNode);
		linkedList.append(mythirdNode);
		// Printing Output of LinkedList Node 56->30->70
		linkedList.printMyNodes();
		boolean result = linkedList.head.equals(myfirstNode) && linkedList.head.getNext().equals(mysecondNode)
				&& linkedList.tail.equals(mythirdNode);
		Assert.assertTrue(result);
	}

	// UC4 insert node b/w two nodes in linked list
	@Test
	public void given3elements_WhenInsertedBetweenLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(40);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		LinkedList myLinkList = new LinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.append(myThirdNode);
		// insertion of a Node
		myLinkList.insertmiddleNode(myFirstNode, mySecondNode);
		myLinkList.printMyNodes();
		boolean result = myLinkList.head.equals(myFirstNode) && myLinkList.head.getNext().equals(mySecondNode)
				&& myLinkList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	// UC-5 Delete First  Value of Node in test case
		  @Test
		    public void given3elements_WhenDeletedFirstNodeLinkedList() {
		        MyNode<Integer> myFirstNode = new MyNode<>(26);
		        MyNode<Integer> mySecondNode = new MyNode<>(30);
		        MyNode<Integer> myThirdNode = new MyNode<>(70);
		        LinkedList myLinkList = new LinkedList();
		        myLinkList.add(myFirstNode);
		        myLinkList.append(mySecondNode);
		        myLinkList.append(myThirdNode);
		        myLinkList.printMyNodes();
		        myLinkList.pop();
		        myLinkList.printMyNodes();
		        boolean result = myLinkList.head.equals(mySecondNode) &&
		                myLinkList.tail.equals(myThirdNode);
		        Assert.assertTrue(result);
		    }
		// UC-6 Delete last value in node of linked list
		  @Test
		   public void given3element_WhenDeletedLastNodePrintLinkedList() {
		        MyNode<Integer> myFirstNode = new MyNode<>(56);
		        MyNode<Integer> mySecondNode = new MyNode<>(30);
		        MyNode<Integer> myThirdNode = new MyNode<>(70);
		        LinkedList myLinkList = new LinkedList();
		        myLinkList.add(myFirstNode);
		        myLinkList.append(mySecondNode);
		        myLinkList.append(myThirdNode);
		        myLinkList.printMyNodes();
		        //deletion of last value of Node
		        myLinkList.popLast();
		        myLinkList.printMyNodes();
		        boolean result = myLinkList.head.equals(myFirstNode) &&
		                myLinkList.tail.equals(mySecondNode);
		        Assert.assertTrue(result);
		}

}

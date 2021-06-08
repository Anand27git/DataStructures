package com.BridgeLabz.linkedlistjava;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/*************
 * 
 * @author ANAND
 * purpose: Simple Linked List with Test Case
 *
 **************/
public class LinkedListTest {
	
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
}

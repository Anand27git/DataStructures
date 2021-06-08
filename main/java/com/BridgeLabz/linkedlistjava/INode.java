package com.BridgeLabz.linkedlistjava;

//Creating an Interface For INode

public interface INode<K> {

	K getKey();

	void setKey(K key);

	INode<K> getNext();

	void setNext(INode<K> next);

}
package com.bridgelabz.datastructures;

public interface INode<K extends Comparable<K>> {

	K getKey();
	void setKey(K Key);
	
	INode getNext();
	void setNext(INode next);
	
}

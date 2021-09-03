package com.bridgelabz.datastructures;

public class SortedLinkedList {

	private INode head;
	private INode tail;
	private int size;

	public SortedLinkedList() {
		this.head = null;
		this.tail=null;
		this.size=0;
	}

	public void add(INode myNode) {

		boolean flag = true;
		if(this.tail==null) {
			this.tail=myNode;
		}
		if(this.head==null) {
			this.head=myNode;
		}
		else {
			INode tempNode = this.head;
			if(tempNode.getKey().compareTo(myNode.getKey()) > 0) {
				myNode.setNext(tempNode);
				this.head = myNode;
			}
			else {
				while(tempNode.getNext()!=null) {
					if(tempNode.getNext().getKey().compareTo(myNode.getKey()) > 0) {
						myNode.setNext(tempNode.getNext());
						tempNode.setNext(myNode);
						flag=false;
						break;
					}
					tempNode = tempNode.getNext();
				}
				if(tempNode.getNext()==null && tempNode.getKey().compareTo(myNode.getKey()) > 0) {
					myNode.setNext(tempNode.getNext());
					tempNode.setNext(myNode	);
				}
				else if(tempNode.getNext()==null) {
					this.tail.setNext(myNode);
					this.tail = myNode;
				}
			}

		}
		this.size++;
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My nodes: ");
		INode tempNode = this.head;
		if(tempNode==null)
			System.out.println("Empty List!");
		else {
			while(tempNode.getNext()!=null) {
				myNodes.append(tempNode.getKey());
				if(!tempNode.equals(tail))
					myNodes.append("->");
				tempNode = tempNode.getNext();
			}
			myNodes.append(tempNode.getKey());
			System.out.println(myNodes);
		}
	}

	public INode pop() {

		INode tempNode = this.head;
		this.head=tempNode.getNext();
		return tempNode;

	}

	public INode popLast() {
		INode tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		this.tail.setNext(null);
		return tempNode;
	}

	public <K> INode search(K key) {
		INode tempNode = head;
		while(tempNode!=null) {
			//System.out.println(tempNode.getKey()+" "+key);
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode=tempNode.getNext();
		}
		return null;
	}

	public <K> boolean remove(K key) {

		INode tempNode = head, prevNode=null;
		while(tempNode!=null) {
			if(tempNode.getKey().equals(key)) {
				if(tempNode.equals(head))
					this.head=tempNode.getNext();
				else
					prevNode.setNext(tempNode.getNext());
				if(tempNode.equals(tail))
					this.tail=prevNode;

				this.size--;
				return true;
			}
			prevNode = tempNode;
			tempNode=tempNode.getNext();
		}
		return false;

	}
}

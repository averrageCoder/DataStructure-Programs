package com.bridgelabz.hashmap;

import java.util.ArrayList;

public class MyLinkedHashMap<K> {
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;

	public MyLinkedHashMap() {
		this.numBuckets = 11;
		this.myBucketArray = new ArrayList<>(numBuckets) ;

		for(int i=0; i < numBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}

	private int getBucketIndex(K key) {
		//int hashCode = Math.abs(key.hashCode());
		int index = (Integer) key % numBuckets;
		//System.out.println("Key: "+key+", HashCode: "+hashCode+", index: "+index);
		return index;
	}

	public K get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList == null) return null;
		MyMapNode<K> myMapNode = (MyMapNode<K>) myLinkedList.search(key) ;
		return (myMapNode == null) ? null : myMapNode.getKey();
	}

	public void add(K key) {
		int index = this.getBucketIndex(key) ;
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index) ;
		if(myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList) ;
		}
		MyMapNode<K> myMapNode = (MyMapNode<K>) myLinkedList.search(key) ;

		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key);
			myLinkedList.append(myMapNode) ;
		}
		else {
			myLinkedList.remove(key) ;
		}
	}

	public String toString() {
		return "“MyLinkedHashMap List{" + myBucketArray + '}';
	}

	public void remove(K key) {
		int index = this.getBucketIndex(key) ;
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index) ;
		if(myLinkedList == null) {
			System.out.println("Empty linked list");
			return;
		}
		MyMapNode<K> myMapNode = (MyMapNode<K>) myLinkedList.search(key) ;

		if (myMapNode == null) {
			System.out.println("Key not found");
			return;
		}
		else {
			myLinkedList.remove(key);
		}
	}
}


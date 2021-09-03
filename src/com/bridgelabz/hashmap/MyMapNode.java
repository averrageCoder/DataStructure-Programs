package com.bridgelabz.hashmap;

public class MyMapNode<K> implements INode<K> {

	private K key;
	//private V value;
	private MyMapNode<K> next;
	
	public MyMapNode(K key) {
		this.key = key;
		this.next=null;
	}
	
	public void setNext(INode<K> next){
		this.next=(MyMapNode<K>) next;
	}

	public INode<K> getNext(){
		return this.next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K Key) {
		this.key = key;
	}
	
	public String toString() {
		StringBuffer myNodes = new StringBuffer();
		myNodes.append(" MyMapNode{"+"K=").append(key).append('}');
		
		if(next!=null)
			myNodes.append(" -> ").append(next);
		return myNodes.toString();
	}
}

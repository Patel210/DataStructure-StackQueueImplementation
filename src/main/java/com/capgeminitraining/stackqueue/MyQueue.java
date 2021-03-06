package com.capgeminitraining.stackqueue;

public class MyQueue<K extends Comparable> {
	MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}

	/**
	 * @param newNode Enqueuing new element in the queue
	 */
	public void enqueue(INode newNode) {
		myLinkedList.append(newNode);
	}

	/**
	 * @return
	 */
	public INode dequeue() {
		return myLinkedList.pop();
	}

	/**
	 * Printing queue
	 */
	public void viewMyQueue() {
		myLinkedList.printLinkedList();
	}
}

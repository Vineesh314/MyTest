/**
 * 
 */
package com.mytest.Datastructures;

import java.util.LinkedList;

/**
 * @author Vineesh
 * 
 */
public class LinkedListTest {

	/**
	 * can contain duplicate elements. maintains insertion order. non
	 * synchronized. manipulation is fast because no shifting needs to be
	 * occurred can be used as list, stack or queue
	 */
	public LinkedListTest() {

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void linkedListDemo() {
		// create a linked list
		LinkedList ll = new LinkedList();
		// add elements to the linked list
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);

		// remove elements from the linked list
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: " + ll);

		// remove first and last elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: " + ll);

		// get and set a value
		Object val = ll.get(2);
		ll.set(2, (String) val + " Changed");
		System.out.println("ll after change: " + ll);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListTest LLT = new LinkedListTest();
		LLT.linkedListDemo();
	}

}

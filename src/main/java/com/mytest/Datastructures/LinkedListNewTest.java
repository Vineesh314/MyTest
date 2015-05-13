/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Vineesh
 * 
 */
public class LinkedListNewTest {

	/**
	 * 
	 */
	public LinkedListNewTest() {

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void AddElementsAtStartEndLinkedListExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

		/*
		 * To add an element at the beginning of the LinkedList, use void
		 * addFirst(Object obj) method.
		 * 
		 * This method inserts object at the beginning of the LinkedList.
		 */

		lList.addFirst("0");
		System.out
				.println("After inserting 0 at beginning, LinkedList contains :"
						+ lList);

		/*
		 * To append an element at end of the LinkedList, use void
		 * addLast(Object obj) method.
		 * 
		 * This method append specified element at the end of the LinkedList.
		 */

		lList.addLast("6");
		System.out.println("After appending 0 at end, LinkedList contains :"
				+ lList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckElementLinkedListExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		/*
		 * To check if a particular element exists in a LinkedList, use boolean
		 * contains(Object obj) method.
		 * 
		 * This method returns true if LinkedList contains a particular element,
		 * false otherwise.
		 */

		boolean blnElement = lList.contains("4");

		if (blnElement) {
			System.out.println("LinkedList contains 4");
		} else {
			System.out.println("LinkedList does not contain 4");
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ObjectArrayFromElementsOfLinkedListExample() {

		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		/*
		 * To create an Object array from elements of Java LinkedList, use
		 * Object[] toArray() method.
		 * 
		 * This method returns an array of Objects containing the elements of
		 * Java LinkedList in correct order.
		 */

		Object[] objArray = lList.toArray();

		System.out.println("Object array created from Java LinkedList.");
		System.out.println("Object array contains : ");

		for (int i = 0; i < objArray.length; i++) {
			System.out.println(objArray[i]);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSubListLinkedListJavaExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

		/*
		 * To get a sublist from Java LinkedList, use List subList(int start,
		 * int end) method.
		 * 
		 * This method returns portion of list containing element from start
		 * index inclusive to end index exclusive.
		 */

		List lst = lList.subList(1, 4);
		System.out.println("Sublist contains : " + lst);

		/*
		 * Please note that sublist is backed by the original list, so any
		 * changes made to sublist will also be reflected back to original
		 * LinkedList
		 */

		// remove element from sublist
		lst.remove(2);
		System.out.println("Sublist now contains : " + lst);
		System.out.println("Original LinkedList now contains : " + lList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetElementsLinkedListExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		/*
		 * To get element at specified index from Java LinkedList, use Object
		 * get(int index) method.
		 * 
		 * This method returns element at sepcified index from LinkedList.
		 */

		System.out.println("LinkedList contains : ");
		for (int i = 0; i < lList.size(); i++) {
			System.out.println(lList.get(i));
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetFirstAndLastElementLinkedListExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		/*
		 * To get first element from Java LinkedList, use Object getFirst()
		 * method.
		 * 
		 * This method returns first element stored in LinkedList.
		 */

		System.out.println("First element of LinkedList is : "
				+ lList.getFirst());

		/*
		 * To get last element from Java LinkedList, use Object getLast()
		 * method.
		 * 
		 * This method returns last element stored in LinkedList.
		 */

		System.out
				.println("Last element of LinkedList is : " + lList.getLast());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void LinkedListInsertElementExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

		/*
		 * To insert an element into LinkedList object, use void add(int index ,
		 * Object element) method.
		 * 
		 * It inserts specified element at specified index in the LinkedList by
		 * shifting current elements and subsequent elements to the right.
		 */

		lList.add(2, "2.5");
		System.out.println("After inserting 2.5, LinkedList contains : "
				+ lList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughLinkedListUsingIteratorExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		/*
		 * To get an Iterator object of LinkedList, use Iterator iterator()
		 * method.
		 */

		Iterator itr = lList.iterator();

		System.out.println("Iterating through elements of Java LinkedList...");
		System.out.println("LinkedList contains : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateLinkedListUsingListIteratorExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		/*
		 * To get an ListIterator object of LinkedList, use ListIterator
		 * listIterator() method.
		 */

		ListIterator itr = lList.listIterator();

		System.out
				.println("Iterating through elements of Java LinkedList using  ListIterator in forward direction...");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out
				.println("Iterating through elements of Java LinkedList using   ListIterator in reverse direction...");
		while (itr.hasPrevious())
			System.out.println(itr.previous());

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveFirstLastElementsLinkedListExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

		/*
		 * To remove first element of Java LinkedList, use Object removeFirst()
		 * method.
		 * 
		 * This method removes first element of LinkedList and shifts the
		 * subsequent elements to the left. It returns the element previously at
		 * the first index of the LinkedList.
		 */

		Object object = lList.removeFirst();
		System.out.println(object
				+ " has been removed from the first index  of LinkedList");
		System.out.println("LinkedList now contains : " + lList);

		/*
		 * To remove last element of Java LinkedList, use Object removeLast()
		 * method.
		 * 
		 * This method removes last element of LinkedList. It returns the
		 * element previously at the last index of the LinkedList.
		 */

		object = lList.removeLast();
		System.out.println(object
				+ " has been removed from the last index  of LinkedList");
		System.out.println("LinkedList now contains : " + lList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveRangeElementsLinkedListExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

		/*
		 * Removing range of elements is not directly supported. However, it can
		 * be done by using subList and clear methods.
		 */

		// remove elements from index 2(inclusive) to 5(exclusive)
		lList.subList(2, 5).clear();

		System.out.println("Range of elements removed from LinkedList");
		System.out.println("LinkedList now contains : " + lList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveElementLinkedListExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

		/*
		 * To remove a specified element from Java LinkedList, use boolean
		 * remove(Object obj) method.
		 * 
		 * This method removes the first occurrence of the specified element
		 * from Java LinkedList and returns true if LinkedList contained the
		 * specified element.
		 * 
		 * If LinkedList did not contain the specified element, it remains
		 * unchanged.
		 */

		boolean isRemoved = lList.remove("2");
		System.out.println("Is 2 removed from LinkedList ? :" + isRemoved);
		System.out.println("LinkedList now contains : " + lList);

		/*
		 * To remove an element at specified index of LinkedList, use Object
		 * remove(int index) method.
		 * 
		 * This method removes an element from specified index and shifts
		 * subsequent elements to the left. It returns an element previously at
		 * the specified index.
		 */

		Object obj = lList.remove(2);
		System.out.println(obj + " has been removed from LinkedList");
		System.out.println("LinkedList now contains : " + lList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void LinkedListReplaceElementExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

		/*
		 * To replace an element of LinkedList at specified index, use Object
		 * set(int index, Object element) method.
		 * 
		 * It replaces specified element at specified index in the LinkedList
		 * and returns the element previously at the specified index.
		 */

		lList.set(3, "Replaced");
		System.out.println("After replacing 4, LinkedList contains : " + lList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SearchElementLinkedListExample() {
		// create LinkedList object
		LinkedList lList = new LinkedList();

		// add elements to LinkedList
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		lList.add("2");

		/*
		 * To search first occurrence of an element of LinkedList, use int
		 * indexOf(Object element) method.
		 * 
		 * This method returns index of first occurrence of element if found in
		 * the LinkedList. It returns -1 if element not found.
		 */

		int index = lList.indexOf("2");
		if (index != -1) {
			System.out
					.println("First occurrence of 2 in LinkedList is at index : "
							+ index);
		} else {
			System.out.println("LinkedList does not contain 2");
		}

		/*
		 * To search last occurrence of an element of LinkedList, use int
		 * lastIndexOf(Object element) method.
		 * 
		 * This method returns index of last occurrence of element if found in
		 * the LinkedList. It returns -1 if element not found.
		 */

		index = lList.lastIndexOf("2");
		if (index != -1) {
			System.out
					.println("Last occurrence of 2 in LinkedList is at index : "
							+ index);
		} else {
			System.out.println("LinkedList does not contain 2");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListNewTest LSN = new LinkedListNewTest();
		// LSN.AddElementsAtStartEndLinkedListExample();
		// LSN.CheckElementLinkedListExample();
		// LSN.ObjectArrayFromElementsOfLinkedListExample();
		// LSN.GetSubListLinkedListJavaExample();
		// LSN.GetElementsLinkedListExample();
		// LSN.GetFirstAndLastElementLinkedListExample();
		// LSN.LinkedListInsertElementExample();
		// LSN.IterateThroughLinkedListUsingIteratorExample();
		// LSN.IterateLinkedListUsingListIteratorExample();
		// LSN.RemoveFirstLastElementsLinkedListExample();
		// LSN.RemoveRangeElementsLinkedListExample();
		// LSN.RemoveElementLinkedListExample();
		// LSN.LinkedListReplaceElementExample();
		LSN.SearchElementLinkedListExample();

	}

}

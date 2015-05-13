/**
 * 
 */
package com.mytest.Datastructures;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Vineesh
 * 
 */
public class ListIteratorTest {

	/**
	 * 
	 */
	public ListIteratorTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void AddAnElementUsingListIteratorExample() {
		// create an object of ArrayList
		ArrayList aList = new ArrayList();

		// Add elements to ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		// Get an object of ListIterator using listIterator() method
		ListIterator listIterator = aList.listIterator();

		/*
		 * Use void add(Object o) method of ListIterator to add or insert an
		 * element to List. It adds an element just before the element that
		 * would have been returned by next method call and after the element
		 * that would have returned by previous call.
		 */

		listIterator.next();

		// Add an element
		listIterator.add("Added Element");
		/*
		 * add method can throw UnsupportedOperationException if add operation
		 * is not supported by this ListIterator.
		 * 
		 * Please also note that, sebsequent call to previous method after
		 * adding an element, would return the newly added element.
		 */

		System.out.println("After inserting element, ArrayList contains");
		for (int intIndex = 0; intIndex < aList.size(); intIndex++)
			System.out.println(aList.get(intIndex));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetPreviousAndNextIndexListIteratorExample() {
		// create an object of ArrayList
		ArrayList aList = new ArrayList();

		// Add elements to ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		// Get an object of ListIterator using listIterator() method
		ListIterator listIterator = aList.listIterator();

		/*
		 * Use nextIndex and previousIndex methods of ListIterator to get next
		 * and previous index from the current position in the list.
		 */

		System.out.println("Previous Index is : "
				+ listIterator.previousIndex());
		System.out.println("Next Index is : " + listIterator.nextIndex());

		// advance current position by one using next method
		listIterator.next();

		System.out
				.println("After increasing current position by one element : ");
		System.out.println("Previous Index is : "
				+ listIterator.previousIndex());
		System.out.println("Next Index is : " + listIterator.nextIndex());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void RemoveAnElementUsingListIteratorExample() {
		// create an object of ArrayList
		ArrayList aList = new ArrayList();

		// Add elements to ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		// Get an object of ListIterator using listIterator() method
		ListIterator listIterator = aList.listIterator();

		/*
		 * Use void remove() method of ListIterator to remove an element from
		 * List. It removes the last element returned by next or previous
		 * methods. Please note that, remove method removes the element from
		 * underlying list.
		 */

		listIterator.next();
		listIterator.next();

		// remove element returned by last next method
		listIterator.remove();
		/*
		 * Remove method can throw UnsupportedOperationException if remove
		 * operation is not supported by this ListIterator.
		 * 
		 * In addition to that, it can also throw IllegalStateException if
		 * remove is called before call of neither previous nor next methods or
		 * after the last call of next or previous methods.
		 */

		System.out.println("After removing 2, ArrayList contains");
		for (int intIndex = 0; intIndex < aList.size(); intIndex++)
			System.out.println(aList.get(intIndex));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void ReplaceAnElementUsingListIteratorExample() {
		// create an object of ArrayList
		ArrayList aList = new ArrayList();

		// Add elements to ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		// Get an object of ListIterator using listIterator() method
		ListIterator listIterator = aList.listIterator();

		/*
		 * Use void set(Object o) method of ListIterator to replace an element
		 * from List. It replaces the last element returned by next or previous
		 * methods. Please note that, set method replaces the element from
		 * underlying list.
		 */

		listIterator.next();

		// replace element returned by last next method i.e. 1
		listIterator.set("100");
		/*
		 * Set method can throw UnsupportedOperationException if set operation
		 * is not supported by this ListIterator.
		 * 
		 * In addition to that, it can also throw IllegalStateException if set
		 * is called before call of neither previous nor next methods or after
		 * the last call of next or previous methods.
		 * 
		 * Please also note that, set method can only be called if neither add
		 * or remove called after last call of next of previous methods.
		 */

		System.out.println("After replacing 1 with 100, ArrayList contains");
		for (int intIndex = 0; intIndex < aList.size(); intIndex++)
			System.out.println(aList.get(intIndex));

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void TraverseForwardUsingListIteratorExample() {
		// create an object of ArrayList
		ArrayList aList = new ArrayList();

		// Add elements to ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		// Get an object of ListIterator using listIterator() method
		ListIterator listIterator = aList.listIterator();

		/*
		 * Traverse the ArrayList in forward direction using hasNext and next
		 * methods of ListIterator. hasNext method returns true if ListIterator
		 * has more elements to traverse in forward direction. Next method
		 * returns next element in the list.
		 */
		System.out
				.println("Traversing ArrayList in forward direction using ListIterator");
		while (listIterator.hasNext())
			System.out.println(listIterator.next());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void TraverseReverseUsingListIteratorExample() {
		// create an object of ArrayList
		ArrayList aList = new ArrayList();

		// Add elements to ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		// Get an object of ListIterator using listIterator() method
		ListIterator listIterator = aList.listIterator();

		// Traverse in forward direction
		System.out
				.println("Traversing ArrayList in forward direction  using ListIterator");
		while (listIterator.hasNext())
			System.out.println(listIterator.next());

		/*
		 * Traverse the ArrayList in reverse direction using hasPrevious and
		 * previous methods of ListIterator. hasPrevious method returns true if
		 * ListIterator has more elements to traverse in reverse direction.
		 * Previous method returns previous element in the list.
		 */
		System.out
				.println("Traversing ArrayList in reverse direction using ListIterator");
		while (listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListIteratorTest LIT = new ListIteratorTest();
		// LIT.AddAnElementUsingListIteratorExample();
		// LIT.GetPreviousAndNextIndexListIteratorExample();
		// LIT.RemoveAnElementUsingListIteratorExample();
		// LIT.ReplaceAnElementUsingListIteratorExample();
		LIT.TraverseForwardUsingListIteratorExample();
		LIT.TraverseReverseUsingListIteratorExample();

	}

}

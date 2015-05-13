/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Vineesh
 * 
 */
public class LinkedHashSetTest {

	/**
	 * 
	 */
	public LinkedHashSetTest() {

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckElementLinkedHashSetExample() {
		// create object of LinkedHashSet
		LinkedHashSet lhashSet = new LinkedHashSet();

		// add elements to LinkedHashSet object
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));

		/*
		 * To check whether a particular value exists in LinkedHashSet use
		 * boolean contains(Object value) method of LinkedHashSet class. It
		 * returns true if the LinkedHashSet contains the value, otherwise
		 * false.
		 */

		boolean blnExists = lhashSet.contains(new Integer("3"));
		System.out.println("3 exists in LinkedHashSet ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfHashSetToArrayExample() {
		// create object of LinkedHashSet
		LinkedHashSet lhashSet = new LinkedHashSet();

		// add elements to LinkedHashSet object
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));

		/*
		 * To copy all elements of java LinkedHashSet object into array use
		 * Object[] toArray() method.
		 */

		Object[] objArray = lhashSet.toArray();

		// display contents of Object array
		System.out
				.println("LinkedHashSet elements are copied into an Array.  Now Array Contains..");
		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughElementsOfLinkedHashSetExample() {
		// create object of LinkedHashSet
		LinkedHashSet lhashSet = new LinkedHashSet();

		// add elements to LinkedHashSet object
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));

		// get the Iterator
		Iterator itr = lhashSet.iterator();

		System.out.println("LinkedHashSet contains : ");
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveAllElementsFromLinkedHashSetExample() {
		// create object of LinkedHashSet
		LinkedHashSet lhashSet = new LinkedHashSet();

		// add elements to LinkedHashSet object
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));

		System.out.println("LinkedHashSet before removal : " + lhashSet);

		/*
		 * To remove all elements from Java LinkedHashSet or to clear
		 * LinkedHashSet object use, void clear() method. This method removes
		 * all elements from LinkedHashSet.
		 */

		lhashSet.clear();
		System.out.println("LinkedHashSet after removal : " + lhashSet);

		/*
		 * To check whether LinkedHashSet contains any elements or not use
		 * boolean isEmpty() method. This method returns true if the
		 * LinkedHashSet does not contains any elements otherwise false.
		 */

		System.out.println("Is LinkedHashSet empty ? " + lhashSet.isEmpty());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveSpecifiedElementFromLinkedHashSetExample() {
		// create object of LinkedHashSet
		LinkedHashSet lhashSet = new LinkedHashSet();

		// add elements to LinkedHashSet object
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));

		System.out.println("LinkedHashSet before removal : " + lhashSet);

		/*
		 * To remove an element from Java LinkedHashSet object use, boolean
		 * remove(Object o) method. This method removes an element from
		 * LinkedHashSet if it is present and returns true. Otherwise remove
		 * method returns false.
		 */

		boolean blnRemoved = lhashSet.remove(new Integer("2"));
		System.out.println("Was 2 removed from LinkedHashSet ? " + blnRemoved);

		System.out.println("LinkedHashSet after removal : " + lhashSet);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSetTest LS = new LinkedHashSetTest();
		LS.CheckElementLinkedHashSetExample();
		LS.CopyElementsOfHashSetToArrayExample();
		LS.IterateThroughElementsOfLinkedHashSetExample();
		LS.RemoveAllElementsFromLinkedHashSetExample();
		LS.RemoveSpecifiedElementFromLinkedHashSetExample();
	}

}

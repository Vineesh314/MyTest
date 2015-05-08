/**
 * 
 */
package com.mytest.Datastructures;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Vineesh
 * 
 */
public class HashSetTest {

	/**
	 * 
	 */
	public HashSetTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckElementHashSetExample() {
		// create object of HashSet
		HashSet hSet = new HashSet();

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		/*
		 * To check whether a particular value exists in HashSet use boolean
		 * contains(Object value) method of HashSet class. It returns true if
		 * the HashSet contains the value, otherwise false.
		 */

		boolean blnExists = hSet.contains(new Integer("3"));
		System.out.println("3 exists in HashSet ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfHashSetToArrayExample() {
		// create object of HashSet
		HashSet hSet = new HashSet();

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		/*
		 * To copy all elements of java HashSet object into array use Object[]
		 * toArray() method.
		 */

		Object[] objArray = hSet.toArray();

		// display contents of Object array
		System.out
				.println("HashSet elements are copied into an Array. Now Array Contains..");
		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSizeOfJavaHashSetExample() {
		// create HashSet object
		HashSet hSet = new HashSet();

		/*
		 * To get the size of HashSet use int size() method of HashSet class. It
		 * returns the number of elements stored in HashSet object.
		 */
		System.out.println("Size of HashSet : " + hSet.size());

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		System.out.println("Size of HashSet after addition : " + hSet.size());

		// remove one element from HashSet using remove method
		hSet.remove(new Integer("1"));
		System.out.println("Size of HashSet after removal : " + hSet.size());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughElementsOfHashSetExample() {
		// create object of HashSet
		HashSet hSet = new HashSet();

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		// get the Iterator
		Iterator itr = hSet.iterator();

		System.out.println("HashSet contains : ");
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveAllElementsFromHashSetExample() {
		// create object of HashSet
		HashSet hSet = new HashSet();

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		System.out.println("HashSet before removal : " + hSet);

		/*
		 * To remove all elements from Java HashSet or to clear HashSet object
		 * use, void clear() method. This method removes all elements from
		 * HashSet.
		 */

		hSet.clear();
		System.out.println("HashSet after removal : " + hSet);

		/*
		 * To check whether HashSet contains any elements or not use boolean
		 * isEmpty() method. This method returns true if the HashSet does not
		 * contains any elements otherwise false.
		 */

		System.out.println("Is HashSet empty ? " + hSet.isEmpty());

		/*
		 * Please note that removeAll method of Java HashSet class can also be
		 * used to remove all elements from HashSet object.
		 */}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveSpecifiedElementFromHashSetExample() {
		// create object of HashSet
		HashSet hSet = new HashSet();

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		System.out.println("HashSet before removal : " + hSet);

		/*
		 * To remove an element from Java HashSet object use, boolean
		 * remove(Object o) method. This method removes an element from HashSet
		 * if it is present and returns true. Otherwise remove method returns
		 * false.
		 */

		boolean blnRemoved = hSet.remove(new Integer("2"));
		System.out.println("Was 2 removed from HashSet ? " + blnRemoved);

		System.out.println("HashSet after removal : " + hSet);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSetTest HT = new HashSetTest();
		HT.CheckElementHashSetExample();
		HT.CopyElementsOfHashSetToArrayExample();
		HT.GetSizeOfJavaHashSetExample();
		HT.IterateThroughElementsOfHashSetExample();
		HT.RemoveAllElementsFromHashSetExample();
		HT.RemoveSpecifiedElementFromHashSetExample();

	}

}

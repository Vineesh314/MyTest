/**
 * 
 */
package com.mytest.Datastructures;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Vineesh
 * 
 */
public class IteratorTest {

	/**
	 * 
	 */
	public IteratorTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void JavaIteratorExample() {
		// create an ArrayList object
		ArrayList aList = new ArrayList();

		// populate ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		/*
		 * Get Iterator object by invoking iterator method of collection.
		 * Iterator provides hasNext() method which returns true if has more
		 * elements. next() method returns the element in iteration.
		 */
		Iterator itr = aList.iterator();

		// iterate through the ArrayList values using Iterator's hasNext and
		// next methods
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveElementThroughIteratorExample() {
		// create an ArrayList object
		ArrayList aList = new ArrayList();

		// populate ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		System.out.println("ArrayList before removal : ");
		for (int i = 0; i < aList.size(); i++)
			System.out.println(aList.get(i));

		// get an Iterator
		Iterator itr = aList.iterator();

		// remove 2 from ArrayList using Iterator's remove method.
		String strElement = "";
		while (itr.hasNext()) {

			/*
			 * Iterator's next method returns an Object so we need to cast it
			 * into appropriate class before using it.
			 */
			strElement = (String) itr.next();
			if (strElement.equals("2")) {
				/*
				 * Remove an element using remove() method of Iterator Remove
				 * method removes an element from underlying collection and it
				 * may throw a UnsupportedOperationException if the remove
				 * operation is not supported.
				 */
				itr.remove();
				break;
			}

		}

		System.out.println("ArrayList after removal : ");
		for (int i = 0; i < aList.size(); i++)
			System.out.println(aList.get(i));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IteratorTest IT = new IteratorTest();
		IT.JavaIteratorExample();
		IT.RemoveElementThroughIteratorExample();

	}

}

/**
 * 
 */
package com.mytest.Datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * @author Vineesh
 * 
 */
public class ComparatorTest {

	/**
	 * 
	 */
	public ComparatorTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SortArrayListInDescendingOrderExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		/*
		 * To get comparator that imposes reverse order on a Collection use
		 * static Comparator reverseOrder() method of Collections class
		 */

		Comparator comparator = Collections.reverseOrder();

		System.out.println("Before sorting ArrayList in descending order : "
				+ arrayList);

		/*
		 * To sort an ArrayList using comparator use, static void sort(List
		 * list, Comparator c) method of Collections class.
		 */

		Collections.sort(arrayList, comparator);
		System.out.println("After sorting ArrayList in descending order : "
				+ arrayList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SortVectorInDescendingOrderExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		/*
		 * To get comparator that imposes reverse order on a Collection use
		 * static Comparator reverseOrder() method of Collections class
		 */

		Comparator comparator = Collections.reverseOrder();

		System.out.println("Before sorting Vector in descending order : " + v);

		/*
		 * To sort an Vector using comparator use, static void sort(List list,
		 * Comparator c) method of Collections class.
		 */

		Collections.sort(v, comparator);
		System.out.println("After sorting Vector in descending order : " + v);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComparatorTest CT = new ComparatorTest();
		// CT.SortArrayListInDescendingOrderExample();
		CT.SortVectorInDescendingOrderExample();

	}

}

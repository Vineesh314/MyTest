/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Vineesh
 * 
 */
public class EnumerationTest {

	/**
	 * 
	 */
	public EnumerationTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void EnumerateThroughVectorExample() {
		// create a Vector object
		Vector v = new Vector();

		// populate the Vector
		v.add("One");
		v.add("Two");
		v.add("Three");
		v.add("Four");

		// Get Enumeration of Vector's elements using elements() method
		Enumeration e = v.elements();

		/*
		 * Enumeration provides two methods to enumerate through the elements.
		 * It's hasMoreElements method returns true if there are more elements
		 * to enumerate through otherwise it returns false. Its nextElement
		 * method returns the next element in enumeration.
		 */

		System.out.println("Elements of the Vector are : ");

		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EnumerationTest ET = new EnumerationTest();
		ET.EnumerateThroughVectorExample();

	}

}

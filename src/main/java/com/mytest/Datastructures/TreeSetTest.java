/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Vineesh
 * 
 */
public class TreeSetTest {

	/**
	 * 
	 */
	public TreeSetTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckValueOfTreeSetExample() {
		// create TreeSet object
		TreeSet tSet = new TreeSet();

		// add elements to TreeSet
		tSet.add("1");
		tSet.add("3");
		tSet.add("2");
		tSet.add("5");
		tSet.add("4");

		/*
		 * To check whether a particular value exists in TreeSet use boolean
		 * contains(Object value) method of TreeSet class. It returns true if
		 * the TreeSet contains the value, otherwise false.
		 */

		boolean blnExists = tSet.contains("3");
		System.out.println("3 exists in TreeSet ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfTreeSetToArrayExample() {
		// create object of TreeSet
		TreeSet tSet = new TreeSet();

		// add elements to TreeSet object
		tSet.add(new Integer("1"));
		tSet.add(new Integer("2"));
		tSet.add(new Integer("3"));

		/*
		 * To copy all elements of java TreeSet object into array use Object[]
		 * toArray() method.
		 */

		Object[] objArray = tSet.toArray();

		// display contents of Object array
		System.out
				.println("TreeSet elements are copied into an Array.  Now Array Contains..");
		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetHeadSetFromTreeSetExample() {
		// create TreeSet object
		TreeSet tSet = new TreeSet();

		// add elements to TreeSet
		tSet.add("1");
		tSet.add("3");
		tSet.add("2");
		tSet.add("5");
		tSet.add("4");

		/*
		 * To get a Head Set from Java TreeSet use, SortedSet headSet(Object
		 * fromElement) method of Java TreeSet class.
		 * 
		 * This method returns the portion of TreeSet containing elements less
		 * than fromElement.
		 * 
		 * Please note that, the SortedSet returned by this method is backed by
		 * the original TreeSet. So any changes made to SortedSet will be
		 * reflected back to original TreeSet.
		 */

		SortedSet sortedSet = tSet.headSet("3");

		System.out.println("Head Set Contains : " + sortedSet);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSubSetFromTreeSetExample() {
		// create TreeSet object
		TreeSet tSet = new TreeSet();

		// add elements to TreeSet
		tSet.add("1");
		tSet.add("3");
		tSet.add("2");
		tSet.add("5");
		tSet.add("4");

		/*
		 * To get the sub Set from Java TreeSet use, SortedSet subSet(int from,
		 * int to) method of TreeSet class.
		 * 
		 * This method returns portion of the TreeSet whose elements range from
		 * from (inclusive) to to(exclusive).
		 * 
		 * Please note that, the SortedSet returned by this method is backed by
		 * the original TreeSet. So any changes made to SortedSet will be
		 * reflected back to original TreeSet.
		 */

		SortedSet sortedSet = tSet.subSet("2", "5");

		System.out.println("SortedSet Contains : " + sortedSet);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetTailSetFromTreeSetExample() {
		// create TreeSet object
		TreeSet tSet = new TreeSet();

		// add elements to TreeSet
		tSet.add("1");
		tSet.add("3");
		tSet.add("2");
		tSet.add("5");
		tSet.add("4");

		/*
		 * To get a Tail Set from Java TreeSet use, SortedSet tailSet(Object
		 * fromElement) method of Java TreeSet class.
		 * 
		 * This method returns the portion of TreeSet containing elements grater
		 * than or equal to fromElement.
		 * 
		 * Please note that, the SortedSet returned by this method is backed by
		 * the original TreeSet. So any changes made to SortedSet will be
		 * reflected back to original TreeSet.
		 */

		SortedSet sortedSet = tSet.tailSet("2");

		System.out.println("Tail Set Contains : " + sortedSet);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetLowestHighestValueTreeSetExample() {
		// create TreeSet object
		TreeSet tSet = new TreeSet();

		// add elements to TreeSet
		tSet.add("1");
		tSet.add("3");
		tSet.add("2");
		tSet.add("5");
		tSet.add("4");

		/*
		 * To get the lowest value currently stored in Java TreeSet use, Object
		 * first() method of TreeSet class.
		 * 
		 * This method returns the first or lowest value currently stored in the
		 * TreeSet object.
		 */

		System.out.println("Lowest value Stored in Java TreeSet is : "
				+ tSet.first());

		/*
		 * To get the highest value currently stored in Java TreeSet use, Object
		 * last() method of TreeSet class.
		 * 
		 * This method returns the last or highest value currently stored in the
		 * TreeSet object.
		 */

		System.out.println("Highest value Stored in Java TreeSet is : "
				+ tSet.last());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughElementsOfTreeSetExample() {
		// create object of TreeSet
		TreeSet tSet = new TreeSet();

		// add elements to TreeSet object
		tSet.add(new Integer("1"));
		tSet.add(new Integer("2"));
		tSet.add(new Integer("3"));

		// get the Iterator
		Iterator itr = tSet.iterator();

		System.out.println("TreeSet contains : ");
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSetTest TS = new TreeSetTest();
		TS.CheckValueOfTreeSetExample();
		TS.CopyElementsOfTreeSetToArrayExample();
		TS.GetHeadSetFromTreeSetExample();
		TS.GetSubSetFromTreeSetExample();
		TS.GetTailSetFromTreeSetExample();
		TS.GetLowestHighestValueTreeSetExample();
		TS.IterateThroughElementsOfTreeSetExample();

	}

}

/**
 * 
 */
package com.mytest.Datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author Vineesh
 * 
 */
public class ArrayListTest {

	/**
	 * 
	 */
	public ArrayListTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void AddElementToSpecifiedIndexArrayListExample() {
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		/*
		 * To add an element at the specified index of ArrayList use void
		 * add(int index, Object obj) method. This method inserts the specified
		 * element at the specified index in the ArrayList.
		 */
		arrayList.add(1, "INSERTED ELEMENT");

		/*
		 * Please note that add method DOES NOT overwrites the element
		 * previously at the specified index in the list. It shifts the elements
		 * to right side and increasing the list size by 1.
		 */

		System.out.println("ArrayList contains...");
		// display elements of ArrayList
		for (int index = 0; index < arrayList.size(); index++)
			System.out.println(arrayList.get(index));

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void AppendAllElementsOfOtherCollectionToArrayListExample() {
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		// create a new Vector object
		Vector v = new Vector();
		v.add("4");
		v.add("5");

		/*
		 * To append all elements of another Collection to ArrayList use boolean
		 * addAll(Collection c) method. It returns true if the ArrayList was
		 * changed by the method call.
		 */

		// append all elements of Vector to ArrayList
		arrayList.addAll(v);

		// display elements of ArrayList
		System.out
				.println("After appending all elements of Vector,ArrayList contains..");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfArrayListToArrayExample() {
		ArrayList arrayList = new ArrayList();

		// Add elements to ArrayList
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");

		/*
		 * To copy all elements of java ArrayList object into array use Object[]
		 * toArray() method.
		 */

		Object[] objArray = arrayList.toArray();

		// display contents of Object array
		System.out
				.println("ArrayList elements are copied into an Array.Now Array Contains..");
		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSizeOfArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist using
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		// To get size of Java ArrayList use int size() method
		int totalElements = arrayList.size();

		System.out.println("ArrayList contains...");
		// loop through it
		for (int index = 0; index < totalElements; index++)
			System.out.println(arrayList.get(index));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSubListOfJavaArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");

		/*
		 * To get a sub list of Java ArrayList use List subList(int startIndex,
		 * int endIndex) method. This method returns an object of type List
		 * containing elements from startIndex to endIndex - 1.
		 */

		List lst = arrayList.subList(0, 3);

		// display elements of sub list.
		System.out.println("Sub list contains : ");
		for (int i = 0; i < lst.size(); i++)
			System.out.println(lst.get(i));

		/*
		 * Sub List returned by subList method is backed by original Arraylist.
		 * So any changes made to sub list will also be REFLECTED in the
		 * original Arraylist.
		 */
		// remove one element from sub list
		Object obj = lst.remove(0);
		System.out.println(obj + " is removed from sub list");

		// print original ArrayList
		System.out.println("After removing " + obj
				+ " from sub list, original ArrayList contains : ");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void InsertAllElementsOfOtherCollectionToArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		// create a new Vector object
		Vector v = new Vector();
		v.add("4");
		v.add("5");

		/*
		 * To insert all elements of another Collection to sepcified index of
		 * ArrayList use boolean addAll(int index, Collection c) method. It
		 * returns true if the ArrayList was changed by the method call.
		 */

		// insert all elements of Vector to ArrayList at index 1
		arrayList.addAll(0, v);

		// display elements of ArrayList
		System.out
				.println("After inserting all elements of Vector at index 0, ArrayList contains..");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughArrayListUsingIteratorExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");

		// get an Iterator object for ArrayList using iterator() method.
		Iterator itr = arrayList.iterator();

		// use hasNext() and next() methods of Iterator to iterate through the
		// elements
		System.out.println("Iterating through ArrayList elements...");
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughArrayListUsingListIteratorExample() {
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");

		/*
		 * Get a ListIterator object for ArrayList using listIterator() method.
		 */
		ListIterator itr = arrayList.listIterator();

		/*
		 * Use hasNext() and next() methods of ListIterator to iterate through
		 * the elements in forward direction.
		 */
		System.out
				.println("Iterating through ArrayList elements in forward  direction...");
		while (itr.hasNext())
			System.out.println(itr.next());

		/*
		 * Use hasPrevious() and previous() methods of ListIterator to iterate
		 * through the elements in backward direction.
		 */
		System.out
				.println("Iterating through ArrayList elements in backward  direction...");
		while (itr.hasPrevious())
			System.out.println(itr.previous());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SimpleArrayListExample() {
		ArrayList arrayList = new ArrayList();

		/*
		 * Add elements to Arraylist using boolean add(Object o) method. It
		 * returns true as a general behavior of Collection.add method. The
		 * specified object is appended at the end of the ArrayList.
		 */
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		/*
		 * Use get method of Java ArrayList class to display elements of
		 * ArrayList. Object get(int index) returns and element at the specified
		 * index in the ArrayList
		 */
		System.out.println("Getting elements of ArrayList");
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveAllElementsOfArrayListExample() {
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		System.out.println("Size of ArrayList before removing elements : "
				+ arrayList.size());
		/*
		 * To remove all elements from the ArrayList use void clear() method.
		 */
		arrayList.clear();
		System.out.println("Size of ArrayList after removing elements : "
				+ arrayList.size());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveElementFromArrayListExample() {
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		/*
		 * To remove an element from the specified index of ArrayList use Object
		 * remove(int index) method. It returns the element that was removed
		 * from the ArrayList.
		 */
		Object obj = arrayList.remove(1);
		System.out.println(obj + " is removed from ArrayList");

		System.out.println("ArrayList contains...");
		// display elements of ArrayList
		for (int index = 0; index < arrayList.size(); index++)
			System.out.println(arrayList.get(index));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ReplaceElementAtSpecifiedIndexArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		/*
		 * To replace an element at the specified index of ArrayList use Object
		 * set(int index, Object obj) method. This method replaces the specified
		 * element at the specified index in the ArrayList and returns the
		 * element previously at the specified position.
		 */
		arrayList.set(1, "REPLACED ELEMENT");

		System.out.println("ArrayList contains...");
		// display elements of ArrayList
		for (int index = 0; index < arrayList.size(); index++)
			System.out.println(arrayList.get(index));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SearchAnElementInArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		arrayList.add("1");
		arrayList.add("2");

		/*
		 * To check whether the specified element exists in Java ArrayList use
		 * boolean contains(Object element) method. It returns true if the
		 * ArrayList contains the specified objct, false otherwise.
		 */

		boolean blnFound = arrayList.contains("2");
		System.out.println("Does arrayList contain 2 ? " + blnFound);

		/*
		 * To get an index of specified element in ArrayList use int
		 * indexOf(Object element) method. This method returns the index of the
		 * specified element in ArrayList. It returns -1 if not found.
		 */

		int index = arrayList.indexOf("4");
		if (index == -1)
			System.out.println("ArrayList does not contain 4");
		else
			System.out.println("ArrayList contains 4 at index :" + index);

		/*
		 * To get last index of specified element in ArrayList use int
		 * lastIndexOf(Object element) method. This method returns index of the
		 * last occurrence of the specified element in ArrayList. It returns -1
		 * if not found.
		 */

		int lastIndex = arrayList.lastIndexOf("1");
		if (lastIndex == -1)
			System.out.println("ArrayList does not contain 1");
		else
			System.out
					.println("Last occurrence of 1 in ArrayList is at index :"
							+ lastIndex);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SortJavaArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("3");
		arrayList.add("5");
		arrayList.add("2");
		arrayList.add("4");

		/*
		 * To sort an ArrayList object, use Collection.sort method. This is a
		 * static method. It sorts an ArrayList object's elements into ascending
		 * order.
		 */
		Collections.sort(arrayList);

		// display elements of ArrayList
		System.out
				.println("ArrayList elements after sorting in ascending order : ");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayListTest ALT = new ArrayListTest();
		// ALT.AddElementToSpecifiedIndexArrayListExample();
		// ALT.AppendAllElementsOfOtherCollectionToArrayListExample();
		// ALT.CopyElementsOfArrayListToArrayExample();
		// ALT.GetSizeOfArrayListExample();
		// ALT.GetSubListOfJavaArrayListExample();
		// ALT.InsertAllElementsOfOtherCollectionToArrayListExample();
		// ALT.IterateThroughArrayListUsingIteratorExample();
		// ALT.IterateThroughArrayListUsingListIteratorExample();
		// ALT.SimpleArrayListExample();
		// ALT.RemoveAllElementsOfArrayListExample();
		// ALT.RemoveElementFromArrayListExample();
		// ALT.ReplaceElementAtSpecifiedIndexArrayListExample();
		ALT.SortJavaArrayListExample();

	}
}

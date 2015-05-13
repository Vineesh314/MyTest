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
public class VectorTest {

	/**
	 * 
	 */
	public VectorTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void AddElementToSpecifiedIndexVectorExample() {
		// create an Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");

		/*
		 * To add an element at the specified index of Vector use void add(int
		 * index, Object obj) method. This method inserts the specified element
		 * at the specified index in the Vector.
		 */
		v.add(1, "INSERTED ELEMENT");

		/*
		 * Please note that add method DOES NOT overwrites the element
		 * previously at the specified index in the Vector. It shifts the
		 * elements to right side and increasing the Vector size by 1.
		 */

		System.out.println("Vector contains...");
		// display elements of Vector
		for (int index = 0; index < v.size(); index++)
			System.out.println(v.get(index));

		/*
		 * To append an element at the end of Vector use boolean add(Object o)
		 * method. It returns true as a general behavior of the Collection.add
		 * method and appends the specified element at the end of Vector.
		 */
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void AppendAllElementsOfOtherCollectionToVectorExample() {
		// create Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");

		// create a new ArrayList object
		ArrayList arrayList = new ArrayList();
		arrayList.add("4");
		arrayList.add("5");

		/*
		 * To append all elements of another Collection to Vector use boolean
		 * addAll(Collection c) method. It returns true if the Vector was
		 * changed by the method call.
		 */

		// append all elements of ArrayList to Vector
		v.addAll(arrayList);

		// display elements of Vector
		System.out
				.println("After appending all elements of ArrayList, Vector contains..");
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfVectorToArrayExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		// declare an array to hold elements of Vector
		Object[] objArray = new Object[5];

		/*
		 * To copy all elements of java vector object into array use void
		 * copyInTo(Ojbect[] obj) method. Here obj is an array into which
		 * elements will get copied. Please note that the array should be big
		 * enough to hold all elements of java vector object. If not,
		 * ArrayIndexOutOfBoundException would be thrown.
		 */

		v.copyInto(objArray);

		// display contents of Object array
		System.out
				.println("Vector elements are copied into an Array. Now Array Contains..");
		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSizeOfVectorExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector using
		v.add("1");
		v.add("2");
		v.add("3");

		// To get size of Java Vector use int size() method
		int totalElements = v.size();

		System.out.println("Vector contains...");
		// loop through it
		for (int index = 0; index < totalElements; index++)
			System.out.println(v.get(index));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSubListOfJavaVectorExample() {
		// create Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		/*
		 * To get a sub list of Java Vector use List subList(int startIndex, int
		 * endIndex) method. This method returns an object of type List
		 * containing elements from startIndex to endIndex - 1.
		 */

		List lst = v.subList(1, 3);

		// display elements of sub list.
		System.out.println("Sub list contains : ");
		for (int i = 0; i < lst.size(); i++)
			System.out.println(lst.get(i));

		/*
		 * Sub List returned by subList method is backed by original Vector. So
		 * any changes made to sub list will also be REFLECTED in the original
		 * Vector.
		 */
		// remove one element from sub list
		Object obj = lst.remove(0);
		System.out.println(obj + " is removed from sub list");

		// print original Vector
		System.out.println("After removing " + obj
				+ " from sub list,  original Vector contains : ");
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void InsertAllElementsOfOtherCollectionToVectorExample() {
		// create Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");

		// create a new ArrayList object
		ArrayList arrayList = new ArrayList();
		arrayList.add("4");
		arrayList.add("5");

		/*
		 * To insert all elements of another Collection to sepcified index of
		 * Vector use boolean addAll(int index, Collection c) method. It returns
		 * true if the Vector was changed by the method call.
		 */

		// insert all elements of ArrayList to Vector at index 1
		v.addAll(0, arrayList);

		// display elements of Vector
		System.out
				.println("After inserting all elements of ArrayList at index 1, Vector contains..");
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughVectorUsingIteratorExample() {

		// create Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		// get an Iterator object for Vector using iterator() method.
		Iterator itr = v.iterator();

		// use hasNext() and next() methods of Iterator to iterate through the
		// elements
		System.out.println("Iterating through Vector elements...");
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughVectorUsingListIteratorExample() {
		// create Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		/*
		 * Get a ListIterator object for Vector using listIterator() method.
		 */
		ListIterator itr = v.listIterator();

		/*
		 * Use hasNext() and next() methods of ListIterator to iterate through
		 * the elements in forward direction.
		 */
		System.out
				.println("Iterating through Vector elements in forward direction...");
		while (itr.hasNext())
			System.out.println(itr.next());

		/*
		 * Use hasPrevious() and previous() methods of ListIterator to iterate
		 * through the elements in backward direction.
		 */
		System.out
				.println("Iterating through Vector elements in backward direction...");
		while (itr.hasPrevious())
			System.out.println(itr.previous());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SearchAnElementInVectorExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		v.add("1");
		v.add("2");

		/*
		 * To check whether the specified element exists in Java Vector use
		 * boolean contains(Object element) method. It returns true if the
		 * Vector contains the specified objct, false otherwise.
		 */

		boolean blnFound = v.contains("3");
		System.out.println("Does Vector contain 3 ? " + blnFound);

		/*
		 * To get an index of specified element in Vector use int indexOf(Object
		 * element) method. This method returns the index of the specified
		 * element in Vector. It returns -1 if not found.
		 */

		int index = v.indexOf("5");
		if (index == -1)
			System.out.println("Vector does not contain 5");
		else
			System.out.println("Vector contains 5 at index :" + index);

		/*
		 * To get last index of specified element in Vector use int
		 * lastIndexOf(Object element) method. This method returns index of the
		 * last occurrence of the specified element in Vector. It returns -1 if
		 * not found.
		 */

		int lastIndex = v.lastIndexOf("2");
		if (lastIndex == -1)
			System.out.println("Vector does not contain 2");
		else
			System.out.println("Last occurrence of 2 in Vector is at index :"
					+ lastIndex);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SearchAnElementFromSpecificIndexVectorExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		v.add("1");
		v.add("2");

		/*
		 * To search an index of specified element in Vector from specified
		 * index use int indexOf(Object element, int startIndex) method. This
		 * method returns the index of the first occurence of the specified
		 * element after startIndex in Vector. It returns -1 if not found.
		 */

		int index = v.indexOf("1", 4);
		if (index == -1)
			System.out.println("Vector does not contain 1 after index # 4");
		else
			System.out.println("Vector contains 1 after index # 4 at index #"
					+ index);

		/*
		 * To get last index of specified element after specified index in
		 * Vector use int lastIndexOf(Object element, int startIndex) method.
		 * This method returns index of the last occurrence of the specified
		 * element after startIndex in Vector. It returns -1 if not found.
		 */

		int lastIndex = v.lastIndexOf("2", 5);
		if (lastIndex == -1)
			System.out.println("Vector does not contain 2 after index # 5");
		else
			System.out
					.println("Last occurrence of 2  after index # 5 in Vector is at index #"
							+ lastIndex);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SetSizeOfJavaVectorExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		/*
		 * To set the size of Vector use void setSize(int newSize) method.
		 * Please note that if the newSize is less than the current size of the
		 * Vector elements at and after newSize index will be discarded, and if
		 * the newSize is grater than the current size of Vector, null values
		 * are added at the end of the Vector.
		 */
		// set size of Vector to 3. The Last 2 elements would be discarded.
		v.setSize(3);

		// display elements of the Vector
		System.out.println("Vector elements after setting size to 3");
		for (int index = 0; index < v.size(); index++)
			System.out.println(v.get(index));

		// set size of Vector to 5. null values would be inserted in the Vector.
		v.setSize(5);

		// display elements of the Vector
		System.out.println("Vector elements after setting size to 5");
		for (int index = 0; index < v.size(); index++)
			System.out.println(v.get(index));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SortJavaVectorExample() {
		// create Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("3");
		v.add("5");
		v.add("2");
		v.add("4");

		/*
		 * To sort a Vector object, use Collection.sort method. This is a static
		 * method. It sorts an Vector object's elements into ascending order.
		 */
		Collections.sort(v);

		// display elements of Vector
		System.out
				.println("Vector elements after sorting in ascending order : ");
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VectorTest VT = new VectorTest();
		VT.AppendAllElementsOfOtherCollectionToVectorExample();
		VT.AddElementToSpecifiedIndexVectorExample();
		VT.CopyElementsOfVectorToArrayExample();
		VT.GetSizeOfVectorExample();
		VT.GetSubListOfJavaVectorExample();
		VT.AppendAllElementsOfOtherCollectionToVectorExample();
		VT.IterateThroughVectorUsingIteratorExample();
		VT.IterateThroughVectorUsingListIteratorExample();
		VT.SearchAnElementInVectorExample();
		VT.SearchAnElementFromSpecificIndexVectorExample();
		VT.SetSizeOfJavaVectorExample();
		VT.SortJavaVectorExample();
	}

}

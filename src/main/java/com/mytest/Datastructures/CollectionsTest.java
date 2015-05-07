/**
 * 
 */
package com.mytest.Datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author Vineesh
 * 
 */
public class CollectionsTest {

	/**
	 * 
	 */
	public CollectionsTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfArrayListToVectorExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("4");
		arrayList.add("2");
		arrayList.add("5");
		arrayList.add("3");

		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("A");
		v.add("B");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");
		v.add("H");

		/*
		 * To copy elements of Java ArrayList to Java Vector use, static void
		 * copy(List dstList, List sourceList) method of Collections class.
		 * 
		 * This method copies all elements of source list to destination list.
		 * After copy index of the elements in both source and destination lists
		 * would be identical.
		 * 
		 * The destination list must be long enough to hold all copied elements.
		 * If it is longer than that, the rest of the destination list's elments
		 * would remain unaffected.
		 */

		System.out.println("Before copy, Vector Contains : " + v);

		// copy all elements of ArrayList to Vector using copy method of
		// Collections class
		Collections.copy(v, arrayList);

		/*
		 * Please note that, If Vector is not long enough to hold all elements
		 * of ArrayList, it throws IndexOutOfBoundsException.
		 */

		System.out.println("After Copy, Vector Contains : " + v);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfArrayListToArrayListExample() {
		// create first ArrayList object
		ArrayList arrayList1 = new ArrayList();

		// Add elements to ArrayList
		arrayList1.add("1");
		arrayList1.add("2");
		arrayList1.add("3");

		// create another ArrayList object
		ArrayList arrayList2 = new ArrayList();

		// Add elements to Arraylist
		arrayList2.add("One");
		arrayList2.add("Two");
		arrayList2.add("Three");
		arrayList2.add("Four");
		arrayList2.add("Five");

		/*
		 * To copy elements of one Java ArrayList to another use, static void
		 * copy(List dstList, List sourceList) method of Collections class.
		 * 
		 * This method copies all elements of source list to destination list.
		 * After copy index of the elements in both source and destination lists
		 * would be identical.
		 * 
		 * The destination list must be long enough to hold all copied elements.
		 * If it is longer than that, the rest of the destination list's elments
		 * would remain unaffected.
		 */

		System.out.println("Before copy, Second ArrayList Contains : "
				+ arrayList2);

		// copy all elements of ArrayList to another ArrayList using copy
		// method of Collections class
		Collections.copy(arrayList2, arrayList1);

		/*
		 * Please note that, If destination ArrayList object is not long enough
		 * to hold all elements of source ArrayList, it throws
		 * IndexOutOfBoundsException.
		 */

		System.out.println("After copy, Second ArrayList Contains : "
				+ arrayList2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfVectorToVectorExample() {
		// create first Vector object
		Vector v1 = new Vector();

		// Add elements to Vector
		v1.add("1");
		v1.add("2");
		v1.add("3");

		// create another Vector object
		Vector v2 = new Vector();

		// Add elements to Vector
		v2.add("One");
		v2.add("Two");
		v2.add("Three");
		v2.add("Four");
		v2.add("Five");

		/*
		 * To copy elements of one Java Vector to another use, static void
		 * copy(List dstList, List sourceList) method of Collections class.
		 * 
		 * This method copies all elements of source list to destination list.
		 * After copy index of the elements in both source and destination lists
		 * would be identical.
		 * 
		 * The destination list must be long enough to hold all copied elements.
		 * If it is longer than that, the rest of the destination list's elments
		 * would remain unaffected.
		 */

		System.out.println("Before copy, Second Vector Contains : " + v2);

		// copy all elements of Vector to another Vector using copy
		// method of Collections class
		Collections.copy(v2, v1);

		/*
		 * Please note that, If destination Vector object is not long enough to
		 * hold all elements of source Vector, it throws
		 * IndexOutOfBoundsException.
		 */

		System.out.println("After copy, Second Vector Contains : " + v2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CopyElementsOfVectorToArrayListExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");

		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		arrayList.add("Five");

		/*
		 * To copy elements of Java Vector to Java ArrayList use, static void
		 * copy(List dstList, List sourceList) method of Collections class.
		 * 
		 * This method copies all elements of source list to destination list.
		 * After copy index of the elements in both source and destination lists
		 * would be identical.
		 * 
		 * The destination list must be long enough to hold all copied elements.
		 * If it is longer than that, the rest of the destination list's elments
		 * would remain unaffected.
		 */

		System.out.println("Before copy ArrayList Contains : " + arrayList);

		// copy all elements of Vector to ArrayList using copy method of
		// Collections class
		Collections.copy(arrayList, v);

		/*
		 * Please note that, If ArrayList is not long enough to hold all
		 * elements of Vector, it throws IndexOutOfBoundsException.
		 */

		System.out.println("After Copy ArrayList Contains : " + arrayList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CreateArrayListFromEnumerationExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("A");
		v.add("B");
		v.add("D");
		v.add("E");
		v.add("F");

		System.out.println("Vector contains : " + v);

		/*
		 * To create ArrayList from any Enumeration, use static ArrayList
		 * list(Enumeration e) method of Collections class.
		 * 
		 * This method returns the ArrayList containing the elements returned by
		 * specified Enumeration object in order they are returned.
		 */

		// Get Enumeration over Vector
		Enumeration e = v.elements();

		// Create ArrayList from Enumeration of Vector
		ArrayList aList = Collections.list(e);

		System.out.println("Arraylist contains : " + aList);
	}

	@SuppressWarnings("rawtypes")
	public void CreateListOfNCopiesExample() {
		/*
		 * To create a List containing n copies of specified Object use, static
		 * List nCopies(int n, Object obj) method of Java Collections class.
		 * 
		 * This method returns immutable List containing n copies of the
		 * specified Object.
		 */

		List list = Collections.nCopies(5, "A");

		// iterate through newly created list
		System.out.println("List contains, ");
		Iterator itr = list.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void FindMinimumOfArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add(new Integer("327482"));
		arrayList.add(new Integer("13408"));
		arrayList.add(new Integer("802348"));
		arrayList.add(new Integer("345308"));
		arrayList.add(new Integer("509324"));

		/*
		 * To find minimum element of Java ArrayList use, static Object
		 * min(Collection c) method of Collections class.
		 * 
		 * This method returns the minimum element of Java ArrayList according
		 * to its natural ordering.
		 */

		Object obj = Collections.min(arrayList);

		System.out.println("Minimum Element of Java ArrayList is : " + obj);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void FindMinimumOfHashSetExample() {
		// create a HashSet object
		HashSet hashSet = new HashSet();

		// Add elements to HashSet
		hashSet.add(new Long("923740927"));
		hashSet.add(new Long("4298748382"));
		hashSet.add(new Long("2374324832"));
		hashSet.add(new Long("2473483643"));
		hashSet.add(new Long("32987432984"));

		/*
		 * To find minimum element of Java HashSet use, static Object
		 * min(Collection c) method of Collections class.
		 * 
		 * This method returns the minimum element of Java HashSet according to
		 * its natural ordering.
		 */

		Object obj = Collections.min(hashSet);

		System.out.println("Minimum Element of Java HashSet is : " + obj);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetEnumerationOverArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to ArrayList
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");

		/*
		 * Get Enumeration over Java ArrayList object using, static Enumeration
		 * enumeration(Collection c) method of Collections class.
		 * 
		 * This method returns the enumeration object over the specified
		 * Collection.
		 */

		// get the Enumeration object
		Enumeration e = Collections.enumeration(arrayList);

		// enumerate through the ArrayList elements
		System.out.println("Enumerating through Java ArrayList");
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSynchronizedListFromArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		/*
		 * Java ArrayList is NOT synchronized. To get synchronized list from
		 * ArrayList use static void synchronizedList(List list) method of
		 * Collections class.
		 */

		List list = Collections.synchronizedList(arrayList);

		/*
		 * Use this list object to prevent any unsynchronized access to original
		 * ArrayList object.
		 */
	}

	public void UnmodifiableCollection() {
		List<String> list = new ArrayList<String>();

		list.add("This");
		list.add("is");
		list.add("Unmodifiable Collection");

		System.out.println("Element added to list: " + list.get(2));

		Collection<String> immutableCol = Collections
				.unmodifiableCollection(list);

		Iterator<String> iterator = immutableCol.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void BinarySearchArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("4");
		arrayList.add("2");
		arrayList.add("5");
		arrayList.add("3");

		/*
		 * To Search an element of Java ArrayList using binary search algorithm
		 * use, static int binarySearch(List list, Object element) method of
		 * Collections class.
		 * 
		 * This method returns the index of the value to be searched, if found
		 * in the ArrayList. Otherwise it returns (- (X) - 1) where X is the
		 * index where the the search value would be inserted. i.e. index of
		 * first element that is grater than the search value or
		 * ArrayList.size(), if all elements of an ArrayList are less than the
		 * search value.
		 * 
		 * Please note that the ArrayList MUST BE SORTED before it can be
		 * searched using binarySearch method.
		 */

		// First sort an ArrayList using sort method of Collections class
		Collections.sort(arrayList);
		System.out.println("Sorted ArrayList contains : " + arrayList);

		// search an element using binarySearch method of Collections class
		int index = Collections.binarySearch(arrayList, "4");

		System.out.println("Element found at : " + index);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void BinarySearchVectorExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("A");
		v.add("B");
		v.add("D");
		v.add("E");
		v.add("F");

		/*
		 * To Search an element of Java Vector using binary search algorithm
		 * use, static int binarySearch(List list, Object element) method of
		 * Collections class.
		 * 
		 * This method returns the index of the value to be searched, if found
		 * in the Vector. Otherwise it returns (- (X) - 1) where X is the index
		 * where the the search value would be inserted. i.e. index of first
		 * element that is grater than the search value or Vector.size(), if all
		 * elements of an Vector are less than the search value.
		 * 
		 * Please note that the Vector MUST BE SORTED before it can be searched
		 * using binarySearch method.
		 */

		// First sort Vector using sort method of Collections class
		Collections.sort(v);
		System.out.println("Sorted Vector contains : " + v);

		// search an element using binarySearch method of Collections class
		int index = Collections.binarySearch(v, "D");

		System.out.println("Element found at : " + index);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ReplaceAllElementsOfArrayListExample() {
		// create a ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to ArrayList
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");

		/*
		 * To replace all elements of Java ArrayList with specified element use,
		 * static void fill(List list, Object element) method of Collections
		 * class.
		 */

		System.out.println("Before replacement, ArrayList contains : "
				+ arrayList);

		Collections.fill(arrayList, "REPLACED");

		System.out.println("After replacement, ArrayList contains : "
				+ arrayList);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ReverseOrderVectorExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");

		System.out.println("Before Reverse Order, Vector Contains : " + v);

		/*
		 * To reverse the order of all elements of Java Vector use, static void
		 * reverse(List list) method of Collections class.
		 * 
		 * This method reverse the order of elements of specified list.
		 */

		Collections.reverse(v);

		System.out.println("After Reverse Order, Vector Contains : " + v);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ShuffleElementsOfArrayListExample() {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		System.out.println("Before shuffling, ArrayList contains : "
				+ arrayList);

		/*
		 * To shuffle elements of Java ArrayList use, static void shuffle(List
		 * list) method of Collections class.
		 */

		Collections.shuffle(arrayList);

		System.out
				.println("After shuffling, ArrayList contains : " + arrayList);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void SwapElementsOfVectorExample() {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		System.out.println("Before swaping, Vector contains : " + v);

		/*
		 * To swap elements of Java Vector use, static void swap(List list, int
		 * firstElement, int secondElement) method of Collections class. Where
		 * firstElement is the index of first element to be swapped and
		 * secondElement is the index of the second element to be swapped.
		 * 
		 * If the specified positions are equal, list remains unchanged.
		 * 
		 * Please note that, this method can throw IndexOutOfBoundsException if
		 * any of the index values is not in range.
		 */

		Collections.swap(v, 0, 4);

		System.out.println("After swaping, Vector contains : " + v);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CollectionsTest CT = new CollectionsTest();
		// CT.CopyElementsOfArrayListToVectorExample();
		// CT.CopyElementsOfArrayListToArrayListExample();
		// CT.CopyElementsOfVectorToVectorExample();
		// CT.CopyElementsOfVectorToArrayListExample();
		// CT.CreateArrayListFromEnumerationExample();
		// CT.CreateListOfNCopiesExample();
		// CT.FindMinimumOfArrayListExample();
		// CT.FindMinimumOfHashSetExample();
		// CT.GetEnumerationOverArrayListExample();
		// CT.GetSynchronizedListFromArrayListExample();
		// CT.UnmodifiableCollection();
		// CT.BinarySearchArrayListExample();
		// CT.BinarySearchVectorExample();
		// CT.ReplaceAllElementsOfArrayListExample();
		// CT.ReverseOrderVectorExample();
		// CT.ShuffleElementsOfArrayListExample();
		CT.SwapElementsOfVectorExample();

	}

}

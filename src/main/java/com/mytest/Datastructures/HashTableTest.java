/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Vineesh
 * 
 */
public class HashTableTest {

	/**
	 * 
	 */
	public HashTableTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckKeyOfHashtableExample() {
		// create Hashtable object
		Hashtable ht = new Hashtable();

		// add key value pairs to Hashtable
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		/*
		 * To check whether a particular key exists in Hashtable use boolean
		 * containsKey(Object key) method of Hashtable class. It returns true if
		 * the Hashtable contains mapping for specified key otherwise false.
		 */

		boolean blnExists = ht.containsKey("2");
		System.out.println("2 exists in Hashtable ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckValueOfHashtableExample() {
		// create Hashtable object
		Hashtable ht = new Hashtable();

		// add key value pairs to Hashtable
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		/*
		 * To check whether a particular value exists in Hashtable use boolean
		 * contains(Object key) method of Hashtable class. It returns true if
		 * the value is mapped to one or more keys in the Hashtable otherwise
		 * false.
		 */

		boolean blnExists = ht.contains("Two");
		System.out.println("Two exists in Hashtable ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CreateHashtableFromHashMap() {
		// create HashMap
		HashMap hMap = new HashMap();

		// populate HashMap
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");

		// create new Hashtable
		Hashtable ht = new Hashtable();

		// populate Hashtable
		ht.put("1", "This value would be REPLACED !!");
		ht.put("4", "Four");

		// print values of Hashtable before copy from HashMap
		System.out.println("Hashtable contents before copy");
		Enumeration e = ht.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());

		/*
		 * To copy values from HashMap to Hashtable use void putAll(Map m)
		 * method of Hashtable class.
		 * 
		 * Please note that this method will REPLACE existing mapping of a key
		 * if any in the Hashtable
		 */

		ht.putAll(hMap);

		// display contents of Hashtable
		System.out.println("Hashtable contents after copy");
		e = ht.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetCollectionOfValuesFromHashtableExample() {

		// create Hashtable object
		Hashtable ht = new Hashtable();

		// add key value pairs to Hashtable
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		/*
		 * get Collection of values contained in Hashtable using Collection
		 * values() method of Hashtable class
		 */

		Collection c = ht.values();

		System.out.println("Values of Collection created from Hashtable are :");
		// iterate through the collection
		Iterator itr = c.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		/*
		 * Please note that resultant Collection object is backed by the
		 * Hashtable. Any value that is removed from Collection will also be
		 * removed from original Hashtable object. The same is not the case with
		 * the element addition.
		 */

		// remove One from collection
		c.remove("One");

		// print values of original values of Hashtable
		System.out
				.println("Hashtable values after removal from Collection are :");
		Enumeration e = ht.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSetViewOfKeysFromHashtableExample() {
		// create Hashtable object
		Hashtable ht = new Hashtable();

		// add key value pairs to Hashtable
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		/*
		 * get Set of keys contained in Hashtable using Set keySet() method of
		 * Hashtable class
		 */

		Set st = ht.keySet();

		System.out.println("Set created from Hashtable Keys contains :");
		// iterate through the Set of keys
		Iterator itr = st.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		/*
		 * Please note that resultant Set object is backed by the Hashtable. Any
		 * key that is removed from Set will also be removed from original
		 * Hashtable object. The same is not the case with the element addition.
		 */

		// remove 2 from Set
		st.remove("2");

		// print keys of original Hashtable
		System.out.println("Hashtable keys after removal from Set are :");
		Enumeration e = ht.keys();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateThroughKeysOfHashtableExample() {
		// create Hashtable object
		Hashtable ht = new Hashtable();

		// add key value pairs to Hashtable
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		/*
		 * get Enumeration of keys contained in Hashtable using Enumeration
		 * keys() method of Hashtable class
		 */
		Enumeration e = ht.keys();

		// iterate through Hashtable keys Enumeration
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateValuesOfHashtableExample() {
		// create Hashtable object
		Hashtable ht = new Hashtable();

		// add key value pairs to Hashtable
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		/*
		 * get Enumeration of values contained in Hashtable using Enumeration
		 * elements() method of Hashtable class
		 */
		Enumeration e = ht.elements();

		// iterate through Hashtable values Enumeration
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void EmptyHashtableExample() {
		// create Hashtable object
		Hashtable ht = new Hashtable();

		// add key value pairs to Hashtable
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		/*
		 * To remove all values or clear Hashtable use void clear method() of
		 * Hashtable class. Remove method removes all key value pairs contained
		 * in Hashtable.
		 */

		ht.clear();

		System.out.println("Total key value pairs in Hashtable are : "
				+ ht.size());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveValueFromHashtableExample() {
		// create Hashtable object
		Hashtable ht = new Hashtable();

		// add key value pairs to Hashtable
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		/*
		 * To remove a key value pair from Hashtable use Object remove(Object
		 * key) method of Hashtable class. It returns either the value mapped
		 * with the key or null if no value was mapped.
		 */

		Object obj = ht.remove("2");
		System.out.println(obj + " Removed from Hashtable");

		// print remaining Hashtable values
		Enumeration e = ht.elements();

		// iterate through Hashtable values Enumeration
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashTableTest HT = new HashTableTest();
		// HT.CheckKeyOfHashtableExample();
		// HT.CheckValueOfHashtableExample();
		// HT.CreateHashtableFromHashMap();
		// HT.GetSetViewOfKeysFromHashtableExample();
		// HT.IterateThroughKeysOfHashtableExample();
		// HT.IterateValuesOfHashtableExample();
		HT.EmptyHashtableExample();
		HT.RemoveValueFromHashtableExample();
	}

}

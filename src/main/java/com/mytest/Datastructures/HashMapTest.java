/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Vineesh
 * 
 */
public class HashMapTest {

	/**
	 * 
	 */
	public HashMapTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckKeyOfHashMapExample() {
		// create HashMap object
		HashMap hMap = new HashMap();

		// add key value pairs to HashMap
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");

		/*
		 * To check whether a particular key exists in HashMap use boolean
		 * containsKey(Object key) method of HashMap class. It returns true if
		 * the HashMap contains mapping for specified key otherwise false.
		 */

		boolean blnExists = hMap.containsKey("3");
		System.out.println("3 exists in HashMap ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckValueOfHashMapExample() {
		// create HashMap object
		HashMap hMap = new HashMap();

		// add key value pairs to HashMap
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");

		/*
		 * To check whether a particular value exists in HashMap use boolean
		 * containsValue(Object key) method of HashMap class. It returns true if
		 * the value is mapped to one or more keys in the HashMap otherwise
		 * false.
		 */

		boolean blnExists = hMap.containsValue("Two");
		System.out.println("Two exists in HashMap ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSetViewOfKeysFromHashMapExample() {
		// create HashMap object
		HashMap hMap = new HashMap();

		// add key value pairs to HashMap
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");

		/*
		 * get Set of keys contained in HashMap using Set keySet() method of
		 * HashMap class
		 */

		Set st = hMap.keySet();

		System.out.println("Set created from HashMap Keys contains :");
		// iterate through the Set of keys
		Iterator itr = st.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		/*
		 * Please note that resultant Set object is backed by the HashMap. Any
		 * key that is removed from Set will also be removed from original
		 * HashMap object. The same is not the case with the element addition.
		 */

		// remove 2 from Set
		st.remove("2");

		// check if original HashMap still contains 2
		boolean blnExists = hMap.containsKey("2");
		System.out.println("Does HashMap contain 2 ? " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSizeOfHashMapExample() {
		// create HashMap object
		HashMap hMap = new HashMap();

		/*
		 * To get the size of HashMap use int size() method of HashMap class. It
		 * returns the number of key value pairs stored in HashMap object.
		 */
		System.out.println("Size of HashMap : " + hMap.size());

		// add key value pairs to HashMap using put method
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");
		System.out.println("Size of HashMap after addition : " + hMap.size());

		// remove one element from HashMap using remove method
		Object obj = hMap.remove("2");
		System.out.println("Size of HashMap after removal : " + hMap.size());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateValuesOfHashMapExample() {
		// create HashMap object
		HashMap hMap = new HashMap();

		// add key value pairs to HashMap
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");

		/*
		 * get Collection of values contained in HashMap using Collection
		 * values() method of HashMap class
		 */
		Collection c = hMap.values();

		// obtain an Iterator for Collection
		Iterator itr = c.iterator();

		// iterate through HashMap values iterator
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void EmptyHashMapExample() {
		// create HashMap object
		HashMap hMap = new HashMap();

		// add key value pairs to HashMap
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");

		/*
		 * To remove all values or clear HashMap use void clear method() of
		 * HashMap class. Clear method removes all key value pairs contained in
		 * HashMap.
		 */

		hMap.clear();

		System.out.println("Total key value pairs in HashMap are : "
				+ hMap.size());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void RemoveValueFromHashMapExample() {
		// create HashMap object
		HashMap hMap = new HashMap();

		// add key value pairs to HashMap
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");

		/*
		 * To remove a key value pair from HashMap use Object remove(Object key)
		 * method of HashMap class. It returns either the value mapped with the
		 * key or null if no value was mapped.
		 */

		Object obj = hMap.remove("2");
		System.out.println(obj + " Removed from HashMap");
	}

	public static void main(String[] args) {
		HashMapTest HT = new HashMapTest();
		HT.CheckKeyOfHashMapExample();
		HT.CheckValueOfHashMapExample();
		HT.GetSetViewOfKeysFromHashMapExample();
		HT.GetSizeOfHashMapExample();
		HT.IterateValuesOfHashMapExample();
		HT.EmptyHashMapExample();
		HT.RemoveValueFromHashMapExample();

	}

}

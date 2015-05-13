/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author Vineesh
 * 
 */
public class LinkedHashMapTest {

	/**
	 * 
	 */
	public LinkedHashMapTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckKeyOfLinkedHashMapExample() {
		// create LinkedHashMap object
		LinkedHashMap lHashMap = new LinkedHashMap();

		// add key value pairs to LinkedHashMap
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");

		/*
		 * To check whether a particular key exists in LinkedHashMap use boolean
		 * containsKey(Object key) method of LinkedHashMap class. It returns
		 * true if the LinkedHashMap contains mapping for specified key
		 * otherwise false.
		 */

		boolean blnExists = lHashMap.containsKey("3");
		System.out.println("3 exists in LinkedHashMap ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckValueOfLinkedHashMapExample() {

		// create LinkedHashMap object
		LinkedHashMap lHashMap = new LinkedHashMap();

		// add key value pairs to LinkedHashMap
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");

		/*
		 * To check whether a particular value exists in LinkedHashMap use
		 * boolean containsValue(Object key) method of LinkedHashMap class. It
		 * returns true if the value is mapped to one or more keys in the
		 * LinkedHashMap otherwise false.
		 */

		boolean blnExists = lHashMap.containsValue("Two");
		System.out.println("Two exists in LinkedHashMap ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSetViewOfKeysFromLinkedHashMapExample() {
		// create LinkedHashMap object
		LinkedHashMap lHashMap = new LinkedHashMap();

		// add key value pairs to LinkedHashMap
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");

		/*
		 * get Set of keys contained in LinkedHashMap using Set keySet() method
		 * of LinkedHashMap class
		 */

		Set st = lHashMap.keySet();

		System.out.println("Set created from LinkedHashMap Keys contains :");
		// iterate through the Set of keys
		Iterator itr = st.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		/*
		 * Please note that resultant Set object is backed by the LinkedHashMap.
		 * Any key that is removed from Set will also be removed from original
		 * LinkedHashMap object. The same is not the case with the element
		 * addition.
		 */

		// remove 2 from Set
		st.remove("2");

		// check if original LinkedHashMap still contains 2
		boolean blnExists = lHashMap.containsKey("2");
		System.out.println("Does LinkedHashMap contain 2 ? " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateValuesOfLinkedHashMapExample() {
		// create LinkedHashMap object
		LinkedHashMap lHashMap = new LinkedHashMap();

		// add key value pairs to LinkedHashMap
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");

		/*
		 * get Collection of values contained in LinkedHashMap using Collection
		 * values() method of LinkedHashMap class
		 */
		Collection c = lHashMap.values();

		// obtain an Iterator for Collection
		Iterator itr = c.iterator();

		// iterate through LinkedHashMap values iterator
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashMapTest LT = new LinkedHashMapTest();
		LT.CheckKeyOfLinkedHashMapExample();
		LT.CheckValueOfLinkedHashMapExample();
		LT.GetSetViewOfKeysFromLinkedHashMapExample();
		LT.IterateValuesOfLinkedHashMapExample();

	}

}

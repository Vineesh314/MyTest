/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Vineesh
 * 
 */
public class TreeMapJavaTest {

	/**
	 * 
	 */
	public TreeMapJavaTest() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckKeyOfTreeMapExample() {

		// create TreeMap object
		TreeMap treeMap = new TreeMap();

		// add key value pairs to TreeMap
		treeMap.put("1", "One");
		treeMap.put("2", "Two");
		treeMap.put("3", "Three");

		/*
		 * To check whether a particular key exists in TreeMap use boolean
		 * containsKey(Object key) method of TreeMap class. It returns true if
		 * the TreeMap contains mapping for specified key otherwise false.
		 */

		boolean blnExists = treeMap.containsKey("1");
		System.out.println("1 exists in TreeMap ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void CheckValueOfTreeMapExample() {
		// create TreeMap object
		TreeMap treeMap = new TreeMap();

		// add key value pairs to TreeMap
		treeMap.put("1", "One");
		treeMap.put("2", "Two");
		treeMap.put("3", "Three");

		/*
		 * To check whether a particular value exists in TreeMap use boolean
		 * containsValue(Object key) method of TreeMap class. It returns true if
		 * the value is mapped to one or more keys in the TreeMap otherwise
		 * false.
		 */

		boolean blnExists = treeMap.containsValue("Three");
		System.out.println("Three exists in TreeMap ? : " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetHeadMapFromTreeMapExample() {
		// create TreeMap object
		TreeMap treeMap = new TreeMap();

		// add key value pairs to TreeMap
		treeMap.put("1", "One");
		treeMap.put("3", "Three");
		treeMap.put("2", "Two");
		treeMap.put("5", "Five");
		treeMap.put("4", "Four");

		/*
		 * To get a Head Map from Java TreeMap use, SortedMap headMap(Object
		 * toKey) method of Java TreeMap class.
		 * 
		 * This method returns the portion of TreeMap whose keys are less than
		 * toKey.
		 * 
		 * Please note that, the SortedMap returned by this method is backed by
		 * the original TreeMap. So any changes made to SortedMap will be
		 * reflected back to original TreeMap.
		 */

		SortedMap sortedMap = treeMap.headMap("4");

		System.out.println("Head Map Contains : " + sortedMap);
		System.out.println("Map Contains : " + treeMap);

		/*
		 * Please also note that, - SortedMap throws IllegalArgumentException
		 * for any attempts to insert the key grater than or equal to toKey.
		 * 
		 * - subMap throws ClassCastException, if toKey can not be compared
		 * using Map's Comparators
		 */}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSetViewOfKeysFromTreeMapExample() {
		// create TreeMap object
		TreeMap treeMap = new TreeMap();

		// add key value pairs to TreeMap
		treeMap.put("1", "One");
		treeMap.put("3", "Three");
		treeMap.put("2", "Two");

		/*
		 * get Set of keys contained in TreeMap using Set keySet() method of
		 * TreeMap class
		 */

		Set st = treeMap.keySet();

		System.out.println("Set created from TreeMap Keys contains :");

		/*
		 * Iterate through the Set of keys. Please note that Set's iterator will
		 * return the keys in ascending order.
		 */
		Iterator itr = st.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		/*
		 * Please note that resultant Set object is backed by the TreeMap. Any
		 * key that is removed from Set will also be removed from original
		 * TreeMap object. The same is not the case with the element addition.
		 */

		// remove 1 from Set
		st.remove("1");

		// check if original TreeMap still contains 2
		boolean blnExists = treeMap.containsKey("1");
		System.out.println("Does TreeMap contain 1 ? " + blnExists);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetSubMapFromTreeMapExample() {
		// create TreeMap object
		TreeMap treeMap = new TreeMap();

		// add key value pairs to TreeMap
		treeMap.put("1", "One");
		treeMap.put("3", "Three");
		treeMap.put("2", "Two");
		treeMap.put("5", "Five");
		treeMap.put("4", "Four");

		/*
		 * To get the sub Map from Java TreeMap use, SortedMap subMap(int
		 * fromKey, int toKey) method of TreeMap class.
		 * 
		 * This method returns portion of the TreeMap whose keys range from
		 * fromKey (inclusive) to toKey(exclusive).
		 * 
		 * Please note that, the SortedMap returned by this method is backed by
		 * the original TreeMap. So any changes made to SortedMap will be
		 * reflected back to original TreeMap.
		 */

		SortedMap sortedMap = treeMap.subMap("2", "5");

		System.out.println("SortedMap Contains : " + sortedMap);

		/*
		 * Please also note that, - SortedMap throws IllegalArgumentException
		 * for any attempts to insert the key less than fromKey and grater than
		 * or equal to toKey.
		 * 
		 * - subMap throws ClassCastException, if fromKey and toKey can not be
		 * compared using Map's Comparators
		 * 
		 * - subMap throws IllegalArgumentException, if fromKey is grater than
		 * toKey
		 */
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetTailMapFromTreeMapExample() {
		// create TreeMap object
		TreeMap treeMap = new TreeMap();

		// add key value pairs to TreeMap
		treeMap.put("1", "One");
		treeMap.put("3", "Three");
		treeMap.put("2", "Two");
		treeMap.put("5", "Five");
		treeMap.put("4", "Four");

		/*
		 * To get a Tail Map from Java TreeMap use, SortedMap tailMap(Object
		 * fromKey) method of Java TreeMap class.
		 * 
		 * This method returns the portion of TreeMap whose keys are grater than
		 * or equal to fromKey.
		 * 
		 * Please note that, the SortedMap returned by this method is backed by
		 * the original TreeMap. So any changes made to SortedMap will be
		 * reflected back to original TreeMap.
		 */

		SortedMap sortedMap = treeMap.tailMap("2");

		System.out.println("Tail Map Contains : " + sortedMap);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GetLowestHighestKeyTreeMapExample() {
		// create TreeMap object
		TreeMap treeMap = new TreeMap();

		// add key value pairs to TreeMap
		treeMap.put("1", "One");
		treeMap.put("3", "Three");
		treeMap.put("2", "Two");
		treeMap.put("5", "Five");
		treeMap.put("4", "Four");

		/*
		 * To get the lowest key currently stored in Java TreeMap use, Object
		 * firstKey() method of TreeMap class.
		 * 
		 * This method returns the first or lowest key currently stored in the
		 * TreeMap object.
		 */

		System.out.println("Lowest key Stored in Java TreeMap is : "
				+ treeMap.firstKey());

		/*
		 * To get the highest key currently stored in Java TreeMap use, Object
		 * lastKey() method of TreeMap class.
		 * 
		 * This method returns the last or highest key currently stored in the
		 * TreeMap object.
		 */

		System.out.println("Highest key Stored in Java TreeMap is : "
				+ treeMap.lastKey());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void IterateValuesOfTreeMapExample() {
		// create TreeMap object
		TreeMap treeMap = new TreeMap();

		// add key value pairs to TreeMap
		treeMap.put("1", "One");
		treeMap.put("2", "Two");
		treeMap.put("3", "Three");

		/*
		 * get Collection of values contained in TreeMap using Collection
		 * values() method of TreeMap class
		 */
		Collection c = treeMap.values();

		// obtain an Iterator for Collection
		Iterator itr = c.iterator();

		// iterate through TreeMap values iterator
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMapJavaTest TT = new TreeMapJavaTest();
		// TT.CheckKeyOfTreeMapExample();
		// TT.CheckValueOfTreeMapExample();
		// TT.GetHeadMapFromTreeMapExample();
		// TT.GetSetViewOfKeysFromTreeMapExample();
		// TT.GetSubMapFromTreeMapExample();
		// TT.GetTailMapFromTreeMapExample();
		// TT.GetLowestHighestKeyTreeMapExample();
		TT.IterateValuesOfTreeMapExample();

	}

}

/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Vineesh
 * 
 */
public class TreeMapTest {

	/**
	 * A Red-Black tree based NavigableMap implementation. The map is sorted
	 * according to the natural ordering of its keys, or by a Comparator
	 * provided at map creation time, depending on which constructor is used.
	 * This implementation provides guaranteed log(n) time cost for the
	 * containsKey, get, put and remove operations
	 */
	public TreeMapTest() {

	}

	public void setTreeMap() {
		Map<Integer, String> data = new TreeMap<Integer, String>();

		data.put(1244, "6000");
		for (int i = 100; i > 0; i--) {
			data.put(i, Integer.toString(i));
		}

		for (int i = -100; i < 0; i++) {
			data.put(i, Integer.toString(i));
		}
		data.put(1234, "6000");

		System.out.println(data);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMapTest tm = new TreeMapTest();
		tm.setTreeMap();
	}

}

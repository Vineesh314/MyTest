/**
 * 
 */
package com.mytest.Datastructures;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Vineesh
 * 
 */
public class ArraysTest {

	/**
	 * 
	 */
	public ArraysTest() {
		// TODO Auto-generated constructor stub
	}

	public void CompareBooleanArraysExample() {
		// create boolean arrays
		boolean[] blnArray1 = new boolean[] { true, false, true };
		boolean[] blnArray2 = new boolean[] { true, false, true };

		/*
		 * To compare two boolean arrays use, static boolean equals(boolean
		 * array1[], boolean array2[]) method of Arrays class.
		 * 
		 * It returns true if both arrays are equal. Arrays are considered as
		 * equal if they contain same elements in same order.
		 */

		boolean blnResult = Arrays.equals(blnArray1, blnArray2);
		System.out.println("Are two boolean arrays equal ? : " + blnResult);

		/*
		 * Please note that two boolean array references pointing to null are
		 * considered as equal.
		 */
	}

	public void CompareByteArraysExample() {
		// create byte arrays
		byte[] byteArray1 = new byte[] { 7, 25, 12 };
		byte[] byteArray2 = new byte[] { 7, 25, 12 };

		/*
		 * To compare two byte arrays use, static boolean equals(byte array1[],
		 * byte array2[]) method of Arrays class.
		 * 
		 * It returns true if both arrays are equal. Arrays are considered as
		 * equal if they contain same elements in same order.
		 */

		boolean blnResult = Arrays.equals(byteArray1, byteArray2);
		System.out.println("Are two byte arrays equal ? : " + blnResult);

		/*
		 * Please note that two byte array references pointing to null are
		 * considered as equal.
		 */}

	public void CompareCharArraysExample() {
		// create character arrays
		char[] charArray1 = new char[] { 'd', 'h', 'r', 'f' };
		char[] charArray2 = new char[] { 'd', 'h', 'r', 'f' };

		/*
		 * To compare two char arrays use, static boolean equals(char array1[],
		 * char array2[]) method of Arrays class.
		 * 
		 * It returns true if both arrays are equal. Arrays are considered as
		 * equal if they contain same elements in same order.
		 */

		boolean blnResult = Arrays.equals(charArray1, charArray2);
		System.out.println("Are two char arrays equal ? : " + blnResult);

		/*
		 * Please note that two char array references pointing to null are
		 * considered as equal.
		 */
	}

	public void CompareDoubleArraysExample() {
		// create double arrays
		double[] dblArray1 = new double[] { 10.3221, 789.23, 427.213 };
		double[] dblArray2 = new double[] { 10.3221, 789.23, 427.213 };

		/*
		 * To compare two double arrays use, static boolean equals(double
		 * array1[], double array2[]) method of Arrays class.
		 * 
		 * It returns true if both arrays are equal. Arrays are considered as
		 * equal if they contain same elements in same order.
		 * 
		 * Two double elements are considered as equal if new
		 * Double(d1).equals(new Double(d2))
		 */

		boolean blnResult = Arrays.equals(dblArray1, dblArray2);
		System.out.println("Are two double arrays equal ? : " + blnResult);

		/*
		 * Please note that two double array references pointing to null are
		 * considered as equal. Also, two NaN values are considerd equal. But
		 * 0.0d and -0.0d are considered as unequal.
		 */
	}

	@SuppressWarnings({ "rawtypes" })
	public void CreateListFromObjectArrayExample() {
		// create an array of type Object, in this case we will create String
		// array
		String[] strArray = new String[] { "Object", "Array", "Converted",
				"To", "List" };

		/*
		 * To create List from an array of type Object use, static List
		 * asList(Object[] objArray) method of Arrays class.
		 * 
		 * This method returns a fixed sized list backed by original array.
		 */

		List list = Arrays.asList(strArray);

		// get an iterator
		Iterator itr = list.iterator();

		// iterate through list created from Array
		System.out
				.println("List created from an Array of type Object contains,");
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArraysTest AT = new ArraysTest();
		AT.CompareBooleanArraysExample();
		AT.CompareByteArraysExample();
		AT.CompareCharArraysExample();
		AT.CompareDoubleArraysExample();
		AT.CreateListFromObjectArrayExample();

	}
}

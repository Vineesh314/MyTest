/**
 * 
 */
package com.mytest.Opearations;

import java.util.Arrays;

/**
 * @author Vineesh
 * 
 */
public class SortingTest {

	/**
	 * 
	 */
	public SortingTest() {
		// TODO Auto-generated constructor stub
	}

	public void SortByteArrayExample() {
		// create byte array
		byte[] b1 = new byte[] { 3, 2, 5, 4, 1 };

		// print original byte array
		System.out.print("Original Array :\t ");
		for (int index = 0; index < b1.length; index++)
			System.out.print("  " + b1[index]);

		/*
		 * To sort java byte array use Arrays.sort() method of java.util
		 * package. Sort method sorts byte array in ascending order and based on
		 * quicksort algorithm. There are two static sort methods available in
		 * java.util.Arrays class to sort a byte array.
		 */

		// To sort full array use sort(byte[] b) method.
		Arrays.sort(b1);

		// print sorted byte array
		System.out.print("\nSorted byte array :\t ");
		for (int index = 0; index < b1.length; index++)
			System.out.print("  " + b1[index]);

		/*
		 * To sort partial byte array use sort(byte[] b, int startIndex, int
		 * endIndex) method where startIndex is inclusive and endIndex is
		 * exclusive
		 */

		byte[] b2 = new byte[] { 5, 2, 3, 1, 4 };
		Arrays.sort(b2, 1, 4);

		// print sorted byte array
		System.out.print("\nPartially Sorted byte array :\t ");
		for (int index = 0; index < b2.length; index++)
			System.out.print("  " + b2[index]);

	}

	public void SortCharArrayExample() {
		// create char array
		char[] c1 = new char[] { 'd', 'a', 'f', 'k', 'e' };

		// print original char array
		System.out.print("Original Array :\t ");
		for (int index = 0; index < c1.length; index++)
			System.out.print("  " + c1[index]);

		/*
		 * To sort java char array use Arrays.sort() method of java.util
		 * package. Sort method sorts char array in ascending order and based on
		 * quicksort algorithm. There are two static sort methods available in
		 * java.util.Arrays class to sort a char array.
		 */

		// To sort full array use sort(char[] c) method.
		Arrays.sort(c1);

		// print sorted char array
		System.out.print("\nSorted char array :\t ");
		for (int index = 0; index < c1.length; index++)
			System.out.print("  " + c1[index]);

		/*
		 * To sort partial char array use sort(char[] c, int startIndex, int
		 * endIndex) method where startIndex is inclusive and endIndex is
		 * exclusive
		 */

		char[] c2 = new char[] { 'd', 'a', 'f', 'k', 'e' };
		Arrays.sort(c2, 1, 4);

		// print sorted char array
		System.out.print("\nPartially Sorted char array :\t ");
		for (int index = 0; index < c2.length; index++)
			System.out.print("  " + c2[index]);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortingTest ST = new SortingTest();
		ST.SortByteArrayExample();
		ST.SortCharArrayExample();

	}

}

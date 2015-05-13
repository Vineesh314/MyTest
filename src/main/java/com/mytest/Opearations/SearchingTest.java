/**
 * 
 */
package com.mytest.Opearations;

import java.util.Arrays;

/**
 * @author Vineesh
 * 
 */
public class SearchingTest {

	/**
	 * 
	 */
	public SearchingTest() {
		// TODO Auto-generated constructor stub
	}

	public void BinarySearchByteArrayExample() {
		// create byte array
		byte bArray[] = { 1, 2, 4, 5 };

		/*
		 * To perform binary search on byte array use int binarySearch(byte[] b,
		 * byte value) of Arrays class. This method searches the byte array for
		 * specified byte value using binary search algorithm.
		 * 
		 * Please note that the byte array MUST BE SORTED before it can be
		 * searched using binarySearch method.
		 * 
		 * This method returns the index of the value to be searched, if found
		 * in the array. Otherwise it returns (- (X) - 1) where X is the index
		 * where the the search value would be inserted. i.e. index of first
		 * element that is grater than the search value or array.length, if all
		 * elements of an array are less than the search value.
		 */

		// sort byte array using Arrays.sort method
		Arrays.sort(bArray);

		// value to search
		byte searchValue = 2;

		// since 2 is present in byte array, index of it would be returned
		int intResult = Arrays.binarySearch(bArray, searchValue);
		System.out.println("Result of binary search of 2 is : " + intResult);

		// lets search something which is not in byte array !
		searchValue = 14;
		intResult = Arrays.binarySearch(bArray, searchValue);
		System.out.println("Result of binary search of 14 is : " + intResult);
	}

	public void BinarySearchCharArrayExample() {
		// create char array
		char charArray[] = { 'a', 'b', 'd', 'e' };

		/*
		 * To perform binary search on char array use int binarySearch(char[] b,
		 * char value) of Arrays class. This method searches the char array for
		 * specified char value using binary search algorithm.
		 * 
		 * Please note that the char array MUST BE SORTED before it can be
		 * searched using binarySearch method.
		 * 
		 * This method returns the index of the value to be searched, if found
		 * in the array. Otherwise it returns (- (X) - 1) where X is the index
		 * where the the search value would be inserted. i.e. index of first
		 * element that is grater than the search value or array.length, if all
		 * elements of an array are less than the search value.
		 */

		// sort char array using Arrays.sort method
		Arrays.sort(charArray);

		// value to search
		char searchValue = 'b';

		// since 'b' is present in char array, index of it would be returned
		int intResult = Arrays.binarySearch(charArray, searchValue);
		System.out.println("Result of binary search of 'b' is : " + intResult);

		// lets search something which is not in char array !
		searchValue = 'c';
		intResult = Arrays.binarySearch(charArray, searchValue);
		System.out.println("Result of binary search of 'c' is : " + intResult);
	}

	public void BinarySearchDoubleArrayExample() {
		// create double array
		double doubleArray[] = { 1.23, 2.10, 4.74, 5.34 };

		/*
		 * To perform binary search on double array use int
		 * binarySearch(double[] b, double value) of Arrays class. This method
		 * searches the double array for specified double value using binary
		 * search algorithm.
		 * 
		 * Please note that the double array MUST BE SORTED before it can be
		 * searched using binarySearch method.
		 * 
		 * This method returns the index of the value to be searched, if found
		 * in the array. Otherwise it returns (- (X) - 1) where X is the index
		 * where the the search value would be inserted. i.e. index of first
		 * element that is grater than the search value or array.length, if all
		 * elements of an array are less than the search value.
		 */

		// sort double array using Arrays.sort method
		Arrays.sort(doubleArray);

		// value to search
		double searchValue = 4.74;

		// since 4.74 is present in double array, index of it would be returned
		int intResult = Arrays.binarySearch(doubleArray, searchValue);
		System.out.println("Result of binary search of 4.74 is : " + intResult);

		// lets search something which is not in double array !
		searchValue = 3.33;
		intResult = Arrays.binarySearch(doubleArray, searchValue);
		System.out.println("Result of binary search of 3.33 is : " + intResult);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchingTest ST = new SearchingTest();
		ST.BinarySearchByteArrayExample();
		ST.BinarySearchCharArrayExample();
		ST.BinarySearchDoubleArrayExample();

	}

}

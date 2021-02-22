package de.ekert.cicd;

import java.util.Random;

/**
 * Our quick sort algorithm using one or the other implementation of IQuickSort interface
 * @author thomas_e
 *
 */
public class QuickSort {

	/**
	 * The sort method. taking an Integer Array and returning the sorted result.
	 * @param arr
	 * @return
	 */
	public static Integer[] sort(Integer [] arr) {
		IQuickSort sorter = new QuickSortProcedural(arr);
		return sorter.qSort();
	}
	
	
	/**
	 * A convenience method to generate an Array of Integer of length count with random content
	 * @param count
	 * @return
	 */
	public static Integer[] generateData(int count) {
		Random rand = new Random();
		Integer [] arr = new Integer [count];
		for (Integer i = 0; i < count; i++) {
			arr[i] = rand.nextInt(count);
		}
		return arr;
	}
	
	
	/**
	 * A convenience method that transforms an Array of Integer into a human readable String in the form '[Integer, Integer, ...]'
	 * @param arr
	 * @return
	 */
	public static String arrToString(Integer [] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0; i < arr.length; i++) {
			Integer val = arr[i];
			sb.append(val).append(i < (arr.length -1)?",":"");
		}
		sb.append(']');
		return sb.toString();
	}	
}

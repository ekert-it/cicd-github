package de.ekert.cicd;

/**
 * A demo app to run quicksort
 * @author thomas_e
 *
 */
public class QuickSortDemo {

	public static void main(String[] args) {		
		Integer[] data = QuickSort.generateData(30);
		System.out.println(QuickSort.arrToString(data));
		
		Integer[] result = QuickSort.sort(data);
		System.out.println(QuickSort.arrToString(result));
	}

}

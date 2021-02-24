package de.ekert.cicd;

/**
 * A demo app to run quicksort
 * @author thomas_e
 *
 */
public class QuickSortDemo {

	public static void main(String[] args) {
		int count = 30;
		if (args.length > 0) {
			try {
				count = Integer.parseInt(args[0]);

			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			Integer[] data = QuickSort.generateData(count);
			System.out.println(QuickSort.arrToString(data));

			Integer[] result = QuickSort.sort(data);
			System.out.println(QuickSort.arrToString(result));
		}

	}
}
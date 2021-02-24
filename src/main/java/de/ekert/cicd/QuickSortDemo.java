package de.ekert.cicd;

/**
 * A demo app to run quicksort
 * @author thomas_e
 *
 */
public class QuickSortDemo {
  private static final Integer DEFAULT = 30;

	public static void main(String[] args) {
    // interpret number argument
		int count = getCount (args);

    // generate some random data + print to console
		Integer[] data = QuickSort.generateData(count);
		System.out.println(QuickSort.arrToString(data));

    // sort data + print to console
		Integer[] result = QuickSort.sort(data);
		System.out.println(QuickSort.arrToString(result));

	}






//**********  Helper Methods ******************************
  private static Integer getCount(String[] args) {
    int count = DEFAULT;
		if (args.length > 0) {
			try {
				count = Integer.parseInt(args[0]);

			} catch (NumberFormatException e) {
        System.err.println ("Could not interpret \"" + args[0] + "\". Defaulting to " + DEFAULT);
			}
		}
    if (count < 0) {
      System.err.println ("Cannot create negative size array. Defaulting to " + DEFAULT);
      count = 30;
    }
    return count;
  }
}
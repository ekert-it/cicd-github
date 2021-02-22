package de.ekert.cicd;

public class QuickSortProcedural implements IQuickSort {

	private Integer[] startArr;

	public QuickSortProcedural(Integer arr[]) {
		this.startArr = arr;
	}
	
	@Override
	public Integer[] qSort() {
		qSortInternal (startArr, 0, startArr.length - 1);
		return startArr;
	}
	
	private void qSortInternal(Integer arr[], int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			qSortInternal(arr, begin, partitionIndex - 1);
			qSortInternal(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(Integer arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}
		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;
		return i + 1;
	}

}

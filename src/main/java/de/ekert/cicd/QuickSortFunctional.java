package de.ekert.cicd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSortFunctional implements IQuickSort {

	private Integer[] startArr;

	public QuickSortFunctional(Integer arr[]) {
		this.startArr = arr;
	}
	
	@Override
	public Integer [] qSort() {
		List<Integer> ints = Arrays.asList(startArr);
		List<Integer> result = qSortInternal (ints);
		return result.toArray(new Integer[result.size()]);
	}
	
	private static List<Integer> qSortInternal (List<Integer> input) {
		if (input.size() == 0) {
			return input;
		}
		List<Integer> sub = input.subList(1, input.size());
		Integer p = input.get(0);
		List<Integer> result = new ArrayList<>();

		result.addAll(qSortInternal (sub.stream().filter(c -> c <= p).collect(Collectors.toList())));
		result.add(input.get(0));
		result.addAll(qSortInternal (sub.stream().filter(c -> c > p).collect(Collectors.toList())));
		
		return result;
	}
}

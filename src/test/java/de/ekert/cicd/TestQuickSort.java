package de.ekert.cicd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestQuickSort {
	private static final int COUNT = 100;
	
	@Test
	public void testAllAvailable() {
		Integer [] data = QuickSort.generateData(COUNT);
		Integer [] result = QuickSort.sort(data);
		
		List<Integer> dataList = new ArrayList<> (Arrays.asList(data));
		List<Integer> resultList = new ArrayList<> (Arrays.asList(result));
		
		assert (data.length == result.length);
		
		for (Integer i : data) {
			assert (resultList.contains(i));
			resultList.remove(i);
		}
		for (Integer i : result) {
			assert (dataList.contains(i));
			dataList.remove(i);
		}
	}
 
	@Test
	public void testOrder() {
		Integer [] data = QuickSort.generateData(COUNT);
		Integer [] result = QuickSort.sort(data);
	
		for (int i=0; i < result.length-1; i++) {
			assert (result[i] <= result[i+1]);
		}
	}
	
	@Test
	public void testEmptyArray() {
		Integer[] data = new Integer[0];
		Integer[] result = QuickSort.sort(data);
		
		assert (result.length == 0);
	}

}

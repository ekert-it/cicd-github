package de.ekert.cicd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestQuickSortXU {
	private static final int COUNT = 100;
	
	@Test
	public void ourTest() {
    Integer [] data = QuickSort.generateData(COUNT);
    Integer [] result = QuickSort.sort(data.clone());

    //Assert.assertTrue (false);
    
  }
}

package de.ekert.cicd;

/**
 * An interface to define an API for quick sort algorithms within a single method<br/>
 * This demo only allows sorting of Integer<br/>
 * This is a demo case for a ci/cd presentation
 * @author thomas_e
 *
 */
public interface IQuickSort {

	/**
	 * Implement this method to run the sorting.<br/>
	 * Sorting may happen inplace of the provided data or as a copy when returned by qSort();<br/>
	 * There is no guaranty whether qSort() returns an independent clone of your data. Neither is quarantied whether inplace sorting happens or not.<br/>
	 * tbd: Improve this behavior.
	 * @return
	 */
	public Integer[] qSort();

}

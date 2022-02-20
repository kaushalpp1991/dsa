package com.dsa.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {
	
	

	@Test
	public void should_not_throw_any_exception_if_passed_list_is_null() {
		MergeSort.sort(null, (x,y) -> x-y);
		
	}
	
	@Test
	public void should_not_throw_any_exception_if_passed_list_is_empty() {
		MergeSort.sort(new int[] {}, (x,y) -> x-y);
		
	}
	
	@Test
	public void should_not_perform_sorting_operation_for_only_singe_element() {
		MergeSort.sort(new int[] {1}, (x,y) -> x-y);
	}
	
	@Test
	public void should_sort_array_in_ascending_order() {
		int arrayToSort[] = new int[] {7,5,2,10,-19,1};
		int sortedArray[] =  new int[] {-19,1,2,5,7,10};
		
		MergeSort.sort(arrayToSort, (x,y) -> x-y);
		
		assertArrayEquals(sortedArray, arrayToSort);
	}
	
	@Test
	public void should_sort_array_in_descending_order() {
		int arrayToSort[] = new int[] {7,5,2,10,19,1};
		int sortedArray[] =  new int[] {19,10,7,5,2,1};
		
		MergeSort.sort(arrayToSort, (x,y) -> y-x);
		
		assertArrayEquals(sortedArray, arrayToSort);
	}

}

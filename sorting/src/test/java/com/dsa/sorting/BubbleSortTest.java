package com.dsa.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {

	
	@Test
	public void should_not_throw_any_exception_if_passed_list_is_null() {
		BubbleSort.sort(null, (x,y) -> x-y);
		
	}
	
	@Test
	public void should_not_throw_any_exception_if_passed_list_is_empty() {
		BubbleSort.sort(new int[] {}, (x,y) -> x-y);
		
	}
	
	@Test
	public void should_not_perform_sorting_operation_for_only_singe_element() {
		BubbleSort.sort(new int[] {1}, (x,y) -> x-y);
	}
	
	@Test
	public void should_not_perform_sorting_if_passed_comparator_is_null() {
		int arrayToSort[] = new int[] {7,5,2,10,19,1};
		int sortedArray[] =  new int[] {7,5,2,10,19,1};
		
		BubbleSort.sort(arrayToSort, null);
		
		assertArrayEquals(sortedArray, arrayToSort);
	}
	
	
	@Test
	public void should_sort_passed_list_in_ascending_order() {
		int arrayToSort[] = new int[] {7,5,2,10,19,1};
		int sortedArray[] =  new int[] {1,2,5,7,10,19};
		
		BubbleSort.sort(arrayToSort, (x,y) -> x-y);
		
		assertArrayEquals(sortedArray, arrayToSort);
	}
	
	
	@Test
	public void should_not_sort_already_sorted_list() {
		int arrayToSort[] = new int[] {1,2,5,7,10,19};
		int sortedArray[] =  new int[] {1,2,5,7,10,19};
		
		BubbleSort.sort(arrayToSort, (x,y) -> x-y);
		
		assertArrayEquals(sortedArray, arrayToSort);
	}
	
	
	@Test
	public void should_sort_passed_list_in_descending_order() {
		int arrayToSort[] = new int[] {7,5,2,10,19,1};
		int sortedArray[] =  new int[] {19,10,7,5,2,1};
		
		BubbleSort.sort(arrayToSort, (x,y) -> y-x);
		
		assertArrayEquals(sortedArray, arrayToSort);
	}
	
	
}

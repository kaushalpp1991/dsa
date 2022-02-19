package com.dsa.sorting;

import java.util.Comparator;

public class BubbleSort {

	public static void sort(int[] arrayToSort, Comparator<Integer> comparator) {
		
		
		if(arrayToSort == null || arrayToSort.length < 2 || comparator == null) {
			return;
		}
		
		for(int i=0; i< arrayToSort.length; i++) {
			
			for(int j=0; j<arrayToSort.length-1; j++) {
				if(comparator.compare(arrayToSort[j], arrayToSort[j+1]) > 0) {
					int smallerElement = arrayToSort[j+1];
					arrayToSort[j+1] = arrayToSort[j];
					arrayToSort[j] = smallerElement;
				}
			}
			
			
		}
		
		
	}

}

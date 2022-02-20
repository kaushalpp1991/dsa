package com.dsa.sorting;

import java.util.Comparator;

public class SelectionSort {

	public static void sort(int[] arrayToSort, Comparator<Integer> comparator) {
		if(arrayToSort == null || arrayToSort.length < 2 || comparator == null) {
			return;
		}
		
		for(int i=0; i< arrayToSort.length; i++) {
			
			for(int j=i+1; j<arrayToSort.length; j++) {
				if(comparator.compare(arrayToSort[i], arrayToSort[j]) > 0) {
					int smallerElement = arrayToSort[j];
					arrayToSort[j] = arrayToSort[i];
					arrayToSort[i] = smallerElement;
				}
				
			}
			
			
		}
		
	}

}

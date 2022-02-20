package com.dsa.sorting;

import java.util.Comparator;

public class MergeSort {

	public static void sort(int[] arrayToSort, Comparator<Integer> comparator) {

		if(arrayToSort == null || arrayToSort.length < 2 || comparator == null) {
			return;
		}
		
		divide(arrayToSort,0,arrayToSort.length-1,comparator);
	}

	//Time complexity: O(logn) for recursion and O(n) for conquer, space complexity: O(n)
	private static void divide(int[] arrayToSort, int start, int end, Comparator<Integer> comparator) {
		//base to break recursion
		if(start >= end) {
			return;
		}
		int mid = (start + end )/2;
		divide(arrayToSort, start, mid, comparator);
		divide(arrayToSort,mid+1, end, comparator);
		
		conquer(arrayToSort, start, mid, end, comparator);
		
		
	}

	//Time complexity: O(n)
	private static void conquer(int[] arrayToSort, int start, int mid, int end, Comparator<Integer> comparator) {

		int[] mergedArr = new int[end-start+1];
		int ind1 = start;
		int ind2=mid+1;
		int ind3=0;
		//compare elements from two sorted arrays
		while(ind1 <= mid && ind2 <= end) {
			if(comparator.compare(arrayToSort[ind2],arrayToSort[ind1]) >= 0) {
				mergedArr[ind3++] = arrayToSort[ind1++];
			}else {
				mergedArr[ind3++] = arrayToSort[ind2++];
			}
		}
		//put remaining arrays from first sorted array
		while(ind1 <= mid) {
			mergedArr[ind3++] = arrayToSort[ind1++];
		}
		//put remaining array from second sorted array
		while(ind2 <= end) {
			mergedArr[ind3++] = arrayToSort[ind2++];
		}
		
		//replace values from mergedarray to original array
		for(int i=0, j=start; i < mergedArr.length; i++,j++) {
			arrayToSort[j] = mergedArr[i];
		}
		
		
		
	}

}

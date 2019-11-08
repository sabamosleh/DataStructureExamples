package com.jagjit.Hactoberfest;

import java.util.Arrays;

public class MergeSort {

	private static void merge(int[] inputArray, int start, int mid, int end) {
		
		int i = 0, first = start, last = mid + 1;
	    int[] tmp = new int[end - start + 1];

	    while (first <= mid && last <= end) {
	      tmp[i++] = inputArray[first] < inputArray[last] ? inputArray[first++] : inputArray[last++];
	    }
	    while (first <= mid) {
	      tmp[i++] = inputArray[first++];
	    }
	    while (last <= end) {
	      tmp[i++] = inputArray[last++];
	    }
	    i = 0;
	    while (start <= end) {
	    	inputArray[start++] = tmp[i++];
	    }
		
	}

	private static void mergesort(int[] inputArray, int start, int end) {

		// split the array into two parts
		if (start < end) {

			int mid = (start + end) / 2;

			mergesort(inputArray, start, mid);

			mergesort(inputArray, mid + 1, end);

			merge(inputArray, start, mid, end);

		}
	}

	public static void mergesort(int[] inputArray) {
		mergesort(inputArray, 0, inputArray.length - 1);
	}

	public static void main(String[] args) {

		System.out.println("Unsorted Array");
		int[] inputArray = { 2, 6, 3, 5, 1  };

		System.out.println(Arrays.toString(inputArray));
		// System.out.println(Arrays.toString(input));

		// sorting array using MergeSort algorithm
		mergesort(inputArray);

		System.out.println("After sorting using Mergesort");
		System.out.println(Arrays.toString(inputArray));

	}

}

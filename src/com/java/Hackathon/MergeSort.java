package com.java.Hackathon;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		mergeSort(array, 0, array.length - 1);

		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	// Divides array into two equal parts until there is only one element per array
	// left.
	static void mergeSort(final int[] array, final int startIndex, final int endIndex) {
		if (startIndex < endIndex) {
			int middleIndex = (startIndex + endIndex) / 2;
			mergeSort(array, startIndex, middleIndex);
			mergeSort(array, middleIndex + 1, endIndex);
			merge(array, startIndex, middleIndex, endIndex);
		}
	}

	// Merges two arrays (that are already sorted) to create a resultant sorted
	// array.
	static void merge(final int[] array, final int startIndex, final int middleIndex, final int endIndex) {
		int[] leftArray = new int[middleIndex - startIndex + 1];
		int[] rightArray = new int[endIndex - middleIndex];

		for (int index = 0; index < leftArray.length; index++) {
			leftArray[index] = array[startIndex + index];
		}

		for (int index = 0; index < rightArray.length; index++) {
			rightArray[index] = array[middleIndex + index + 1];
		}

		int arrayIndex = startIndex;
		int leftArrayIndex = 0;
		int rightArrayIndex = 0;

		while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
			if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]) {
				array[arrayIndex++] = leftArray[leftArrayIndex++];
			} else {
				array[arrayIndex++] = rightArray[rightArrayIndex++];
			}
		}

		while (leftArrayIndex < leftArray.length) {
			array[arrayIndex++] = leftArray[leftArrayIndex++];
		}

		while (rightArrayIndex < rightArray.length) {
			array[arrayIndex++] = rightArray[rightArrayIndex++];
		}
	}
}

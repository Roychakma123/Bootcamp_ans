package com.automation.bootcamp_submission;
		

public class MergeSort {
    // Method to perform merge sort on an array
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to sort an array with 0 or 1 element
        }

        // Perform merge sort
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    // Helper method for merge sort
    private static void mergeSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            // Find the middle point
            int mid = low + (high - low) / 2;

            // Recursively sort the first and second halves
            mergeSortHelper(arr, low, mid);
            mergeSortHelper(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    // Method to merge two sorted halves of an array
    private static void merge(int[] arr, int low, int mid, int high) {
        // Calculate the sizes of the two subarrays
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays leftArray[] and rightArray[]
        System.arraycopy(arr, low, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

        // Merge the temporary arrays back into arr[low...high]
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if there are any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if there are any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Array before sorting: " + arrayToString(arr));

        mergeSort(arr);

        System.out.println("Array after sorting: " + arrayToString(arr));
    }

    // Helper method to convert an array to string for printing
    private static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}


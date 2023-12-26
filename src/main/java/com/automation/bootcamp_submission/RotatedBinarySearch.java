package com.automation.bootcamp_submission;

	public class RotatedBinarySearch {
    // Method to perform binary search on a rotated sorted array
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            }

            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                // Check if the target is in the left half
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Check if the right half is sorted
            else {
                // Check if the target is in the right half
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 6;

        int result = search(rotatedArray, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

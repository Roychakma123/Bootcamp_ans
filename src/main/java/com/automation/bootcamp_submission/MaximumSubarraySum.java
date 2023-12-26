package com.automation.bootcamp_submission;

		
public class MaximumSubarraySum {
    // Method to find the maximum subarray sum using Kadane's algorithm
    public static int findMaxSubarraySum(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSubarraySum = findMaxSubarraySum(arr);

        System.out.println("Maximum Subarray Sum: " + maxSubarraySum);
    }
}

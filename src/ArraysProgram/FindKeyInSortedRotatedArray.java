package ArraysProgram;

import java.util.Arrays;

	/*
 		Java program to search an element in a sorted and pivoted array
	 */
public class FindKeyInSortedRotatedArray {

    // Searches an element key in a pivoted sorted array arr[] of size n
    static int pivotedBinarySearch(int[] arr, int n, int key) {

        int pivot = findPivot(arr, 0, n - 1);

        // If we didn't find a pivot, then array is not rotated at all.
        if (pivot == -1)
            return binarySearch(arr, 0, n - 1, key);

        // If we found a pivot, then first compare with key and then search in two sub-arrays around pivot
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot - 1, key);
        return binarySearch(arr, pivot + 1, n - 1, key);
    }

    /*
        Function to get pivot.
        For array 3, 4, 5, 6, 1, 2 it returns 3 (index of 6)
    */
    static int findPivot(int[] arr, int startIndex, int endIndex) {
        // base cases
        if (endIndex < startIndex)
            return -1;
        if (endIndex == startIndex)
            return startIndex;

        int mid = (startIndex + endIndex) / 2; 		     // Alo mid = startIndex + (endIndex - startIndex)/2;
        if (mid < endIndex && arr[mid] > arr[mid + 1])   // arr = {4, 5, 6, 1, 2}, arr[mid] = 6
            return mid;
        if (mid > startIndex && arr[mid] < arr[mid - 1]) // arr = { 6, 1, 2}, arr[mid] = 1
            return (mid - 1);
        if (arr[startIndex] >= arr[mid])
            return findPivot(arr, startIndex, mid - 1);
        return findPivot(arr, mid + 1, endIndex);
    }

    /* Standard Binary Search function */
    static int binarySearch(int[] arr, int startIndex, int endIndex, int key) {
        if (endIndex < startIndex)
            return -1;

        /* startIndex + (endIndex - startIndex)/2; */
        int mid = (startIndex + endIndex) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), endIndex, key);
        return binarySearch(arr, startIndex, (mid - 1), key);
    }

    public static void main(String[] args) {
        // Let us search 3 in below array
        int[] array = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = array.length;
        int key = 2;
        System.out.println(Arrays.toString(array));
        System.out.println("Element at given index " + key + " is : " + pivotedBinarySearch(array, n, key));
    }
} 

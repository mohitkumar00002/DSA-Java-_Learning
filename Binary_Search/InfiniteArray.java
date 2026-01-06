package Binary_Search;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 2, 3, 5, 6, 7, 8, 9, 11, 13, 14, 15, 18, 19, 21, 24, 25, 28, 29, 30 };
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        int result = infiniteArraySearch(arr, target);
        if (result != -1) {
            System.out.println(target + " is found at index " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    static int infiniteArraySearch(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Step 1: Expand the range until target <= arr[end] or end is out of bounds
        while (end < arr.length && target > arr[end]) {
            start = end + 1;
            end = (end + 1) * 2;

            if (end >= arr.length) {
                end = arr.length - 1; // prevent out of bounds
                break;
            }
        }

        // Step 2: Binary Search in the found range
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                return middle;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }
}

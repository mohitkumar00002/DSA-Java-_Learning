package Array_Problems;

import java.util.Scanner;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.print("Enter the number : ");
        int target = input.nextInt();
        int start  = 0;
        int end = arr.length -1;
        int result = RotatedBinarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println(target + " found at index "+ result);
        }
    }
    // static int RotatedBinarySearch(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start<=end){
    //         int mid = start + (end-start)/2;
    //         if(target == arr[mid]){
    //             return mid;
    //         }
    //         // left half is sorted
    //         if(arr[start] <= arr[mid]){
    //             if(target < arr[mid] && target >= arr[start]){
    //                 end = mid - 1;
    //             }
    //             else{
    //                 start = mid + 1;
    //             }
    //         }
    //         // right half is sorted
    //         else{
    //             if(target > arr[mid] && target <= arr[end]){
    //                 start = mid + 1;
    //             }
    //             else{
    //                 end = mid - 1;
    //             }
    //         }
    //     }
    //     return - 1;
    // }

     static int rotatedBinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Check middle element
        if (arr[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return rotatedBinarySearch(arr, target, start, mid - 1);
            } else {
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
        }

        // Right half is sorted
        else {
            if (target > arr[mid] && target <= arr[end]) {
                return rotatedBinarySearch(arr, target, mid + 1, end);
            } else {
                return rotatedBinarySearch(arr, target, start, mid - 1);
            }
        }
    }
}

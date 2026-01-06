package Binary_Search;

import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int[] arr = {10, 12, 15, 16, 20, 25, 28, 30, 35, 38, 42, 45, 50}; // ascending
        int[] arr = {50, 45, 42, 38, 35, 30, 28, 25, 20, 16, 15, 12, 10}; // descending

        System.out.print("Enter the targeted element: ");
        int target = input.nextInt();

        int result = OrderAgnostic(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        input.close(); 
    }

    static int OrderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end]; 

        while(start <= end){
            int middle = start + (end - start) / 2;

            if (arr[middle] == target){
                return middle;
            }

            if (isAscending){
                if (target < arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target < arr[middle]){
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }

        return -1;
    }
}

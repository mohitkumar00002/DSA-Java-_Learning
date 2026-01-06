// import java.util.Scanner;

// public class BinarySearch {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int arr[] = {22,34,45,51,55,60,62,68,75,82,89,90};
//         System.out.print("Enter the number : ");
//         int target = input.nextInt();
//         int result = BinaryS(target, arr);
//         if(result == -1){
//             System.out.println("Element not found");
//         }
//         else{
//             System.out.println(target + " is found at index : "+ result);
//         }

//     }
//     static int BinaryS(int target, int arr[]){
//         int start = 0;
//         int end = arr.length-1;
       
//         while(start<=end){
//              int mid  = start + (end - start)/2;
//             if(target == arr[mid]){
//                 return mid;
//             }
//             else if(target < arr[mid]){
//                 end = mid -1;
//             }
//             else{
//                 start = mid + 1;
//             }
//         }
//         return -1;
//     }
// }

// Recursion

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {22, 34, 45, 51, 55, 60, 62, 68, 75, 82, 89, 90};

        System.out.print("Enter the number: ");
        int target = input.nextInt();

        int end = arr.length - 1;
        int result = BinaryS(arr, target, 0, end);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(target + " is found at index: " + result);
        }
    }

    static int BinaryS(int arr[], int target, int start, int end) {
        //Base condition to stop recursion
        if (start >= end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return BinaryS(arr, target, start, mid - 1);
        } else {
            return BinaryS(arr, target, mid + 1, end);
        }
    }
}

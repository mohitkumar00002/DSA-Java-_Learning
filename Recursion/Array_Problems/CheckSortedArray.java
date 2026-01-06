package Array_Problems;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 8, 10, 12, 15};    // ascending
        int[] arr2 = {2, 5, 7, 3, 9, 12, 10, 15};    // unsorted
        // int[] arr3 = {15, 12, 10, 8, 7, 5, 3, 1};    // descending

        // System.out.println(isArraySorted(arr1)); // true
        // System.out.println(isArraySorted(arr2)); // false
        // System.out.println(isArraySorted(arr3)); // true

        System.out.println(isArraySorted(arr1, 0));
        System.out.println(isArraySorted(arr2, 0));
    }
    // check single condition
    // static boolean isArraySorted(int[] arr) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if (arr[i] > arr[i + 1]) {
    //             return false;  // Not sorted
    //         }
    //     }
    //     return true; // Sorted
    // }

    // Check both conditions
    // static boolean isArraySorted(int[] arr) {
    //     if (arr.length < 2) return true; // 1 element = sorted

    //     boolean ascending = true;
    //     boolean descending = true;

        
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if (arr[i] < arr[i + 1]) {
    //             descending = false;
    //         } else if (arr[i] > arr[i + 1]) {
    //             ascending = false;
    //         }
    //     }

    //     return ascending || descending;
    // }

    // Recursive Approach
    static boolean isArraySorted(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index + 1] && isArraySorted(arr, index+1);
    }
}


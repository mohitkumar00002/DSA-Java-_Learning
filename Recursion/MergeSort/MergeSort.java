
// package Array_Problems;

// import java.util.Arrays;

// public class SimpleMergeSort {
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 9, 1, 6, 3};
//         arr = mergeSort(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     static int[] mergeSort(int[] arr) {
//         // Base condition
//         if (arr.length == 1) {
//             return arr;
//         }

//         int mid = arr.length / 2;

//         // Divide the array into 2 halves
//         int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
//         int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

//         // Merge both sorted halves
//         return merge(left, right);
//     }

//     static int[] merge(int[] first, int[] second) {
//         int[] mix = new int[first.length + second.length];

//         int i = 0, j = 0, k = 0;

//         while (i < first.length && j < second.length) {
//             if (first[i] < second[j]) {
//                 mix[k++] = first[i++];
//             } else {
//                 mix[k++] = second[j++];
//             }
//         }

//         // Add remaining elements
//         while (i < first.length) {
//             mix[k++] = first[i++];
//         }

//         while (j < second.length) {
//             mix[k++] = second[j++];
//         }

//         return mix;
//     }
// }

package MergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 2, 18, 25, 1, 12};
        int start = 0;
        int end = arr.length -1;
        mergeSort(arr,start,end);
        for(int num: arr){
            System.out.print(num + " ");
        }

    }
    static void mergeSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end - start )/2;

        mergeSort(arr,start,mid);
        mergeSort(arr, mid+1,end);

        merge(arr, start, mid, end);
    }
    static void merge(int arr[], int start, int mid, int end){
        int[] merged = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                merged[k++] = arr[i++];
            }
            else{
                merged[k++] = arr[j++];
            }
        }
        while (i<= mid){
            merged[k++] = arr[i++];
        }
        while(j<=end){
            merged[k++] = arr[j++];
        }
        for(int p=0;p<merged.length;p++){
            arr[start + p] = merged[p];
        }
    }
}
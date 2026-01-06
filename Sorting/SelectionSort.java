package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 8, 3, 9, 2, 10, 1};
        // selectionSort(arr);
        selectionSort2(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    // static void selectionSort(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         int last = arr.length - i -1;
    //         int maxIndex = 0;

    //         for(int j=1;j<=last;j++){
    //             if(arr[j]>arr[maxIndex]){
    //                 maxIndex = j;
    //             }
    //         }
    //         int temp = arr[maxIndex];
    //         arr[maxIndex] = arr[last];
    //         arr[last] = temp;
    //     }
    // }
    static void selectionSort2(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int minIndex = 0;
            for(int j=1;j<=last;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[last];
            arr[last] = temp;
        }
    }
}

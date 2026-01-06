package Sorting;
import java.util.*;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,8,3,9,2,10,1};
        // Bubble_Sort(arr);
        Bubble_Sort2(arr);
        System.out.println(Arrays.toString(arr));

    }
    //ascending order
    static void Bubble_Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length-i-1 ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // descending order
    static void Bubble_Sort2(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i-1;j++){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }
    }
} 
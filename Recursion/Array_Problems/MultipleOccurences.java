package Array_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,4,6,6,12,14,18,18,20,15};
        System.out.print("Enter the number: ");
        int target = input.nextInt();
        int result = MultipleOccurences(arr, target);
        System.out.println(result);
    }
    // static void MultipleOccurences(int[] arr, int target){
    //     boolean found = false;
    //     System.out.print("Element found at indices:");
    //     for(int i=0;i<arr.length-1;i++){
    //         if(target == arr[i]){
    //             found = true;
    //             System.out.print(" " + i);
    //         }
    //     }
    //     if(!found){
    //         System.out.println("Element not found");
    //     }
    // }
    
    // static void MultipleOccurences(int[] arr, int target){
    //     ArrayList <Integer> list = new ArrayList<>();
    //     for(int i=0;i<arr.length-1;i++){
    //         if(target == arr[i]){
    //             list.add(i);
    //         }
    //     }
    //     System.out.println(list);
    // }

    static int MultipleOccurences(int[] arr, int target, int index){
        ArrayList <Integer> list = new ArrayList<>();
        if(index == arr.length -1){
            return -1;
        }
        if(target == arr[index]){
            list.add(index);
        }
        return LinearSearch(arr, target, index+1);
    }
}

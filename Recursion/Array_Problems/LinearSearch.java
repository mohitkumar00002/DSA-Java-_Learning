package Array_Problems;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,5,8,10,3,9,30,18,32}; 
        System.out.print("Enter the number: ");
        int target = input.nextInt();
        int result = LinearSearch(arr, target,0);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(target + " found at index : "+ result);
        }
    }
    static int LinearSearch(int[] arr, int target, int index){
        if(index == arr.length -1){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return LinearSearch(arr, target, index+1);
    }
}

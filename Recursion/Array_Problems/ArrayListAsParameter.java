package Array_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAsParameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,4,5,7,9,9,10,12};
        System.out.print("Enter the number : ");
        int target = input.nextInt();
        // ArrayList<Integer> list = new ArrayList<>();
        System.out.println(allIndex(arr, target, 0, new ArrayList<>()));

    } 
    static ArrayList<Integer> allIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return allIndex(arr, target,index+1, list);
    }
}

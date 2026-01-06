package Array_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInFunctionBody {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 4, 5, 7, 9, 9, 10, 12};
        System.out.print("Enter the number : ");
        int target = input.nextInt();

        System.out.println(allIndex(arr, target, 0));
    }

    static ArrayList<Integer> allIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        // base case
        if (index == arr.length) {
            return list;
        }

        // if target found, add index
        if (arr[index] == target) {
            list.add(index);
        }

        // recursive call to get rest of indices
        ArrayList<Integer> answerFromBelowCalls = allIndex(arr, target, index + 1);

        // combine current list with results from below
        list.addAll(answerFromBelowCalls);

        return list;
    }
}
 
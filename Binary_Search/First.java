package Binary_Search;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 12, 15, 16, 20, 25, 28, 30, 35, 38, 42, 45, 50};
        System.out.print("Enter the number to search: ");
        int target = input.nextInt();
        int result = BinarySearch(arr, target);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + result);
        }
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target == arr[middle]){
                return middle;
            }
            else if(target < arr[middle]){
                end = middle-1;
            }
            else{
                start = middle + 1;
            }
        }
        return -1;
    }
}

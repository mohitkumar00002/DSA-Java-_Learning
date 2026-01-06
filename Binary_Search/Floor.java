package Binary_Search;
import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 12, 15, 16, 20, 25, 28, 30, 35, 38, 42, 45, 50};
        System.out.print("Enter the targeted element : ");
        int target = input.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int result = binarySearch(arr, target, start, end);
      
        if (result == -1) {
            System.out.println("Floor not found because the targeted element is smaller than the smallest element of the array.");
        }
        else if(target == arr[result]){
            System.out.println("Element found at index : "+result);
        }
        else {
            System.out.println("Floor for the targeted number is: " + arr[result] + " and it is found at index: " + result);
        }
        input.close();
    }
    static int binarySearch(int[] arr,int target, int start, int end){
          while(start<=end){
            if(target <arr[0]){
                return -1;
            }
            int middle = start + (end - start)/2;
            if(target < arr[middle]){
                end = middle -1;
            }
            else if(target> arr[middle]){
                start = middle + 1;
            }
            else{
                return middle;
            }
          }
          return end;  
    }
}
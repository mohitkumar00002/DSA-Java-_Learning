package Binary_Search;
import java.util.Scanner;

public class FoundInMountainArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 15, 12, 10, 8, 6, 4, 2, 1};
        System.out.print("Enter the element for search : ");
        int target = input.nextInt();

    }

    static int FoundInMountainArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            if(arr.length < 3){
                return -1;
            }
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } 
            else {

                end = mid;
            }
        }
        return start;
    }
}

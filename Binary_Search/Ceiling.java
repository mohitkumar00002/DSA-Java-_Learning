package Binary_Search;
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {12,15,20,23,27,30,32,33,37,40};
        System.out.print("Enter the number for search : ");
        int target = input.nextInt();
        int result = Ceiling(arr, target);
        
        if(result == -1){
            System.out.println("Element  or Celing element of the targeted elemnt does not exist in the array");
        }
        else if(target == arr[result]){
            System.out.println("Targeted element found at index : "+ result);
        }
        else{
            System.out.println("Ceiling element of the targeted element is : " + arr[result]);
        }
 }
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        if(target>arr[end]){
            return -1;
        }
            while(start<=end){
                int middle = start + (end - start)/2;
                if(target == arr[middle]){
                    return middle;
                }
                else if(target < arr[middle]){
                    end = middle -1;
                }
                else{
                    start = middle + 1;
                }
            }
        return start;
    }
}
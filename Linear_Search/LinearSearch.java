import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 12, 34, 54, 67, 87, 31, 66, 22};
        if(arr.length<=0){
            System.out.println("Array is empty!!");
        }
        else{
        System.out.print("Enter the number for search : ");
        int target = input.nextInt();
        
        int result = LinearSearch(arr, target);
        if(result ==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index : "+ result);
        }
        }
    }
    static int LinearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
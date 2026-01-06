import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 12, 34, 54, 67, 87, 31, 66, 22};
        if(arr.length<=0){
             System.out.println("Array is empty");
        }
        else{
            System.out.print("Enter the number for search: ");
            int target = input.nextInt();
            LinearSearch(arr, target);

        }
    }
    static void LinearSearch(int[] arr, int target){
        boolean found = false;
        int index = -1;
        for(int i=0;i<arr.length;i++){

            if(arr[i] == target){
                found = true;
                index = i;
                break;
            }
        }
         if(found){
                System.out.println("Element found at index : "+ index);
            }
            else{
                System.out.println("Element not found");
            }
    }
}
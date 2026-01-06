package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Two ways of array declaration and initilisation

        // 1.
        int []arr = {1,2,3,4,5};
        // 2.
        int []arr2 = new int[5];
        for(int i=0;i<arr2.length;i++){
            System.out.print("Enter element "+(i+1) + " : ");
            arr2[i] = input.nextInt();
        }

        // three ways of printing
        // 1.
        // System.out.print(arr + " ");
        System.out.println(Arrays.toString(arr));

        // 2.
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }
        
        // 3.
        // for(int num : arr2){
        //     System.out.print(num + " ");
        // }



    }
}

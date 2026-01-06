package Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        for(int i=0;i<arr.length;i++){
            System.out.print("Ener element "+(i+1)+" : ");
            arr[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(arr));

        //modify
        arr[1] = "Ayu";
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {62,44,54,22,77,80,56,91,23,45,};
        linearSearch(arr);
    }
    static void linearSearch(int[] arr){
        if(arr.length<=0){
            System.out.println("Array is empty.");
        }
        int min = arr[0];
        int min_index = 0;
        for(int index=0;index<arr.length;index++){
            if(arr[index]<min){
                min = arr[index];
                min_index = index;
            }
        }
        System.out.println("Minimun number is "+ min + " and it is present at index "+ min_index);
    }
}

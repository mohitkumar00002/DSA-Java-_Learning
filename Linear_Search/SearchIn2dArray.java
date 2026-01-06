import java.util.Scanner;

public class SearchIn2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        System.out.print("Enter the number for search : ");
        int target = input.nextInt();
        search(arr, target);

    }
    static void search(int[][] arr, int target){
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println("Element found at index : (" + i + "," + j +")");
                }
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}

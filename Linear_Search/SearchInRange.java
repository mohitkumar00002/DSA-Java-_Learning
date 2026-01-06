import java.util.Scanner;

public class SearchInRange{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.print("Enter elment for search : ");
        int target = input.nextInt();
        System.out.print("Enter statring index : ");
        int start = input.nextInt();
        System.out.print("Enter end index : ");
        int end = input.nextInt();
        SearchInRange(arr,target,start,end);
    }
    static void SearchInRange(int[] arr,int target, int start, int end){
        if(arr.length <= 0){
            System.out.println("Array is empty");
        }
        else{
            boolean found = false;
            for(int i=start;i<=end;i++){
                if(target == arr[i]){
                    System.out.println("Element found at index : "+ i);
                    found = true;
                }
            }
            if(found == false){
                System.out.println("Element not found");
            }
        }
    }

}
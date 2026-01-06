// import java.util.Scanner;

// public class TwoSum {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int[] arr = {1,2,3,4,5,6,7,8,9,10};
//         System.out.print("Enter the targeted number : ");
//         int target = input.nextInt();
//         int result = TwoSum(arr,target);
//         if(result == -1){
//             System.out.println("No such pair found");;
//         }
//     }
//     static int TwoSum(int[] arr, int target){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i] + arr[j] == target){
//                     System.out.println("Pair found : "+arr[i]+"+"+arr[j] +" = " +target);
//                     return 1;
//                 }
//             }
//         }
//         return -1;
//     }
    
// }
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the targeted number : ");
        int target = input.nextInt();
        TwoSum(arr, target);
    }
    static void TwoSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                System.out.print("Pair found : "+ arr[i] + " + " + arr[j] + " = " + target);
                return;
            }
            else{
                System.out.println("No such pair found");
                return;
            }
            }
            
        }
    }
}
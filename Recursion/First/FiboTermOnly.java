// Recursive Approach
// import java.util.Scanner;

// public class FiboTermOnly {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = input.nextInt();
//         int result = Fibo(n);
//         if(result == -1){
//             System.out.println("Term should be greater than 0");
//         }
//         else{
//             System.out.println("Fibonacci term at number "+ n+ " is : "+ result);
//         }
//     }
//     static int Fibo(int n){
//         if(n<=0) return -1;
//         else if(n==1) return 0;
//         else if(n==2) return 1;
//         else return Fibo(n-1) + Fibo(n-2);
//     }
// }

// Iterative Approach
import java.util.Scanner;
public class FiboTermOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int result = Fibo(n);
        if(result == -1){
            System.out.println("Term should be greater than 0");
        }
        else{
            System.out.println("Fibonacci term at number "+ n+ " is : "+ result);
        }
    }
    static int Fibo(int n){
        int first = 0;
        int second = 1;
        int next = 0;
        if(n<=0) return -1;
        else if(n==1) return first;
        else if(n==2) return second;
        else{
            for(int i=3;i<=n;i++){
                next = first+ second;
                first = second;
                second = next;
            }
            return next;
        }
    }
}
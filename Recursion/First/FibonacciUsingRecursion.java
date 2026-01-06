// iterative approach

// import java.util.Scanner;

// public class FibonacciUsingRecursion {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number of terms : ");
//         int n = input.nextInt();
//         Fibo(n);
//     }
//     static void Fibo(int n){
//         int first = 0;
//         int second = 1;
//         int next;
//         if(n<=0){
//             System.out.println("Term should be greater than 0");
//         }
//         else if(n == 1){
//             System.out.println("Fibonacci Series : " + first);
//         }
//         else {
//             System.out.print("Fibonacci Series : " + first + " " + second);
//             for(int i=3;i<=n;i++){
//                 next = first + second;
//                 System.out.print(" "+ next);
//                 first = second;
//                 second = next;
//             }
//         }
//     }
// }

// Recursive Approach

import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = input.nextInt();
        int result = Fibo(n);
        if(result == -1){
            System.out.println("Term should be greater than 0");
        }
        else{
            System.out.print("Fibonacci Series:");
            for(int i=1;i<=n;i++){
                System.out.print(" "+ Fibo(i));
            }
        }

    }
    static int Fibo(int n){
        if(n<=0) return -1;
        else if(n==1) return 0;
        else if(n==2) return 1;
        else return Fibo(n-1) + Fibo(n-2);
    }
}
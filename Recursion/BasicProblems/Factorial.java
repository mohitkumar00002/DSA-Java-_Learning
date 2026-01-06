package BasicProblems;

// import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = input.nextInt();
//         int fact = 1;
//         for(int i=1;i<=num;i++){
//             fact = fact * i;
//         }
//         System.out.println("Factorial of "+ num + " is: "+fact);
//     }
    
// }


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int result = fact(num);
        System.out.println("Factorial of "+ num + " is: "+ result);

    }
    static int fact(int n){
        if(n==0 || n==1) return 1;
        return n * fact(n-1);
    }
    
}
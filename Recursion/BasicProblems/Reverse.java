package BasicProblems;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int result = reverse(num,0);
        System.out.println("Reverse : " + result);

    }
    // iterative approach
    // static int reverse(int n){
    //     int reverse = 0;
    //     int lastDigit;

    //     while(n>0){
    //         lastDigit = n%10;
    //         reverse = (reverse * 10) + lastDigit;
    //         n /= 10;
    //         }
    //     return reverse;
    // }
    
    // half recursive approach
//     static int reverse(int n, int rev) {
//     if (n == 0) return rev;          
//     int lastDigit = n % 10;           
//     rev = (rev * 10) + lastDigit;    
//     return reverse(n / 10,rev);      
// }

// using helper function

 static int reverse(int n, int rev) {
    if (n == 0) return rev;
    return reverse(n/10,rev * 10 + n % 10);
}


}
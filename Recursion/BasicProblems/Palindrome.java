package BasicProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int result = palindrome(num, 0);
        if(result == num){
            System.out.println(num + " is palindrome");
        }
        else{
            System.out.println(num + " not palindrome");
        }

    }
    
    static bool reverse(int n){
        int originalNumber = n;
        int reverse = 0;
        int lastDigit;

        while(n>0){
            lastDigit = n%10;
            reverse = (reverse * 10) + lastDigit;
            n /= 10;
            }
        if(originalNumber = reverse){
            return true;
        }
        else return false;
    }
    }
    // static int palindrome(int n,int rev){
    //     if(n==0){
    //         return rev;
    //     }
    //     return palindrome(n/10, rev * 10 + n % 10);
    // }
}

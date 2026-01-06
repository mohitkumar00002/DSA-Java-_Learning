package BasicProblems;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        // int result = sumOfDigits(num);
        int result = Sum(num);
        System.out.println("Sum : " + result);

    }
    // static int sumOfDigits(int num){
    //     int sum =0;
    //     int lastDigit;
    //     while(num>0){
    //         lastDigit = num%10;
    //         sum += lastDigit;
    //         num /= 10;
    //     }
    //     return sum;
    // }
    
    static int Sum(int num){
        if(num<=0){
            return 0;
        }
        return (num%10) + Sum(num/10);
        
    }

}

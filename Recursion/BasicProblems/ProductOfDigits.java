package BasicProblems;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        // int result = Product(num);
        int result = Product(num);
        System.out.println("Sum : " + result);

    }
    // static int Product(int num){
    //     int sum =0;
    //     int lastDigit;
    //     while(num>0){
    //         lastDigit = num%10;
    //         sum += lastDigit;
    //         num /= 10;
    //     }
    //     return sum;
    // }
    
    static int Product(int num){
        if(num<=0){
            return 1;
        }
        return (num%10) * Product(num/10);
    }

}

package BasicProblems;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        // System.out.println("Number of zeros in "+ num + " is "+ CountZeros(num) );
        int result = CountZeros(num, 0);
        System.out.println("Number of zeros in "+ num + " is "+ result );
        
        
    }
    // static int CountZeros(int num){
    //     int count = 0;
    //     while(num>0){
    //         int lastDigit = num%10;
    //         if(lastDigit == 0){
    //             count++;
    //         }
    //         num /=10;
    //     }
    //     return count;a
    // }

    static int CountZeros(int num, int count){
        if(num==0){
            return count;
        }
        int rem = num % 10;
        if(rem ==0){
            return CountZeros(num/10, count+1);
        }
        else{
        return CountZeros(num/10, count);
        }
    }
}

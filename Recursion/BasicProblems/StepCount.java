package BasicProblems;
import java.util.Scanner;

public class StepCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num  = input.nextInt();
        System.out.println(countSteps(num,0));

    }
    // static int countSteps(int num){
    //     int count = 0;
    //     while(num>0){
    //         if(num%2==0){
    //             num = num/2;
    //             count++;
    //         }
    //         else{
    //             num = num -1;
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    static int countSteps(int num, int count){
        if(num==0){
            return count;
        }
        if(num % 2 == 0){
            return countSteps(num/2, count+1);
        }
        else{
            return countSteps(num-1, count+1);
        }
    }
}

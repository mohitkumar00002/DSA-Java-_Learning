import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        Armstrong(num);
    }
    static void Armstrong(int n){
        int originalNum = n;
        int digit,sum = 0;
        while(n>0){
            digit = n%10;
            sum += digit*digit*digit;
            n /=10;
        }
        if(originalNum == sum){
            System.out.println(originalNum + " is a Armstrong number.");
        }
        else{
            System.out.println(originalNum + " is not a Armstrong number.");
        }
    }
}
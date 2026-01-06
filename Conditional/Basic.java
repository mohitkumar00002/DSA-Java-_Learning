import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        if(num>10){
            System.out.println("Number is greater than 10");
        }
        System.out.println("Number = " + num);
    }
}
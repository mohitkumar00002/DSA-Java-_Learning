import java.util.Scanner;

public class PrintUptoN{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        Print(num);
    }
    static void Print(int num){
        if(num==0){
            return;
        }
        Print(num-1);
        System.out.print(num + " ");
    }
} 
package BasicProblems;

import java.util.Scanner;

public class PrintFromNto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        Print(num);
    }
    static int Print(int num){
        if(num==0){
            return 1;
        }
        System.out.println(num);
        return Print(num -1);

    }
}

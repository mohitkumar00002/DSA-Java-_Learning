import java.util.Scanner;

public class Uppercase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.nextLine();
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
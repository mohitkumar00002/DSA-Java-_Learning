import java.util.Scanner;

public class XorFrom0ToA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.println("XOR from 0 to " + a + " = " + xorFrom0ToA(a));
    }

    static int xorFrom0ToA(int a) {
        if (a % 4 == 0)
            return a;
        else if (a % 4 == 1)
            return 1;
        else if (a % 4 == 2)
            return a + 1;
        else
            return 0;
    }
}

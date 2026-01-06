import java.util.Scanner;

public class XorFromAtoB {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the value of a: ");
    int a = input.nextInt();

    System.out.print("Enter the value of b: ");
    int b = input.nextInt();

    System.out.println("XOR from " + a + " to " + b + " = " + xorFromAtoB(a, b));
  }

  // XOR from 0 to n
  static int xorFrom0ToN(int n){
    if (n % 4 == 0) return n;
    if (n % 4 == 1) return 1;
    if (n % 4 == 2) return n + 1;
    return 0;
  }

  // XOR from a to b
  static int xorFromAtoB(int a, int b){
    return xorFrom0ToN(b) ^ xorFrom0ToN(a-1);
  }
}

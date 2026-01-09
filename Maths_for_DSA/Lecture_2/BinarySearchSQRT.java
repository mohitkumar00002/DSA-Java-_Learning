import java.util.Scanner;

public class BinarySearchSQRT {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num = input.nextInt();

    System.out.print("Enter the precision value: ");
    int precision = input.nextInt();

    System.out.println(sqrt(num, precision));
  }

  static double sqrt(int n, int p) {
    int start = 0;
    int end = n;
    double root = 0.0;

    // Binary Search for integer part
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if ((long) mid * mid == n) {
        return mid;
      }

      if ((long) mid * mid < n) {
        root = mid;          // store possible answer
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    // Precision part
    double incr = 0.1;
    for (int i = 0; i < p; i++) {
      while (root * root <= n) {
        root += incr;
      }
      root -= incr;
      incr /= 10;
    }

    return root;
  }
}

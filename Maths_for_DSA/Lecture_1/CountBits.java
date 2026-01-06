// import java.util.Scanner;;
// public class CountBits {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int num = input.nextInt();
//     System.out.println(BitsCount(num));
//   }
//   static int BitsCount(int num){
//     int count = 0;
//     while(num>0){
//       int digit = num&1;
//       count++;
//       num = num>>1;
//     }
//     return count;
//   }
// }


// using formula
import java.util.Scanner;

public class CountBits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    System.out.print("Enter the base: ");
    int base = input.nextInt();
    System.out.println(BitsCount(num,base));
  }
  static int BitsCount(int num, int base){
    int count = (int)(Math.log(num) / Math.log(base)) + 1;
    return count;
  }
}
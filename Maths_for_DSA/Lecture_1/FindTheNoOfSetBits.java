// import java.util.Scanner;

// public class FindTheNoOfSetBits {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int num = input.nextInt();
//     System.out.println(FindSetBits(num));
//   }
//   static int FindSetBits(int n){
//     int count = 0;
//     while(n>0){
//       int bit = n&1;
//       if(bit == 1) count++;
//       n = n>>1;
//     }
//     return count;
//   }
// }



// other way
import java.util.Scanner;
public class FindTheNoOfSetBits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    System.out.println(rightMostSetBit(num));
  }
  static int rightMostSetBit(int n){
    int count = 0;
    while(n>0){
      count++;
      n = n- (n&-n);
    }
    return count;
  }
}
// import java.util.Scanner;

// public class OddEven{
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the number : ");
//     int num = input.nextInt();
//     System.out.println(isOdd(num));

//   }
//   static boolean isOdd(int num){
//     return (num & 1) ==1;
//   }
// }

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    int result = EvenOdd(num);
    if (result==1){
      System.out.println("Odd");
    }
    else{
      System.out.println("Even");
    }
  
  }
  static int EvenOdd(int num){
    return num&1;
  }
}

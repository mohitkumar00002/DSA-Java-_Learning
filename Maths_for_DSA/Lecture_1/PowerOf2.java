// import java.util.Scanner;

// public class PowerOf2 {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the number : ");
//     int num = input.nextInt();
//     powerOf2(num);
//   }

//   static void powerOf2(int num){
//     if (num <= 0) {
//       System.out.println(num + " is not a power of 2");
//       return;
//     }

//     int temp = num;
//     int count = 0;

//     while (temp > 0) {
//       if ((temp & 1) == 1) {
//         count++;
//       }
//       temp = temp >> 1;
//     }

//     if (count == 1) {
//       System.out.println(num + " is the power of 2");
//     } else {
//       System.out.println(num + " is not the power of 2");
//     }
//   }
//}


// Simpler Method

import java.util.Scanner;

public class PowerOf2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    int result = powerOf2(num);
    if(result == 1){
      System.out.println(num + " is power of 2");
    }
    else{
      System.out.println(num + " is not power of 2");
    }


  }
  static int powerOf2(int num){
    if((num & (num-1))==0) return 1;
    return -1;
  }
}

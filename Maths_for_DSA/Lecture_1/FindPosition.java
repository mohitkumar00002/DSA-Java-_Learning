// Example - 10110110
// Ans - 2
// import java.util.Scanner;

// public class FindPosition {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int num = input.nextInt();
//     System.out.println("Right most set bit is : "+ FindPositionOfRightMSB(num));

//   }
//   static int FindPositionOfRightMSB(int num){
//     if(num == 0) return -1;
//     int position = 1;
//     while((num & 1) == 0){
//       num = num >> 1;
//       position++;
//     }
//     return position;
//   }
// }

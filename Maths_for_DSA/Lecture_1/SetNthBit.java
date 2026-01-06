// 0 -> 1
// 1 -> 1

import java.util.Scanner;

public class SetNthBit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = input.nextInt();
    System.out.print("Enter the bit number: ");
    int bit_no = input.nextInt();
    System.out.println(SetBit(num, bit_no));

  }
  static int SetBit(int num, int bit_no){
    return num | (1 << bit_no - 1);
  }
}
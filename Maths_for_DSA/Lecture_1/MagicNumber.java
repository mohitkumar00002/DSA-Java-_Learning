import java.util.Scanner;

public class MagicNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    System.out.print("Enter the base: ");
    int base = input.nextInt();
    System.out.println(magicNumber(num, base));                  
  }
  static int magicNumber(int num, int base){
    int power = base;
    int result = 0;
    while(num>0){
      int last = num & 1;
      result = result + (last * power);
      power = power * base;
      num = num >> 1;
    }
    return result;
  }
}
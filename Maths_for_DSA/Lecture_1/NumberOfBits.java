import java.util.Scanner;

public class NumberOfBits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    int count = 0;
    while(num>0){
      int last = num & 1;
      count++;
      num = num >> 1;
    }
    System.out.println(count);
  }
}

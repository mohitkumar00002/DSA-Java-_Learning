import java.util.Scanner;

public class AllPrimeNumbersUptoN {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
  }
  static int primeNum(int num){
    if(num<=1) return -1;
    if(num == 2) return 1;
    if(num % 2 == 0) return -1;
    int count = 1;
    for(int i=3; i*i<=num;i+=2){
      
    }
  }
}
